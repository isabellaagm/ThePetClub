package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.Tutor;

public class TutorDAO {
	
	
private Connection connection;
	
	
	public TutorDAO() {
		this.connection = ConnectionFactory.conectar();
	}

	
	public Tutor insert(Tutor tutor){
		String sql = "INSERT INTO tutores VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, tutor.getIdTutor()); 
			stmt.setString(2, tutor.getNome()); 	
			stmt.setString(3, tutor.getCpf()); 
			stmt.setString(4, tutor.getTelefone());
			stmt.setString(5, tutor.getEndereco());
			stmt.setString(6, tutor.getSenha());

			stmt.execute();
			tutor.setIdTutor(Statement.RETURN_GENERATED_KEYS);
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tutor;
	}
	
	public void update(Tutor tutor, int id) {
		String sql = "update tutores set nome=?, cpf=?, telefone=?, endereco=? where idTutor=?";
		PreparedStatement stmt;
		
		try {
			stmt = connection.prepareStatement(sql);
			
			
			stmt.setString(1, tutor.getNome()); 	
			stmt.setString(2, tutor.getCpf()); 
			stmt.setString(3, tutor.getTelefone()); 
			stmt.setString(4, tutor.getEndereco()); 
			stmt.setInt(5, tutor.getIdTutor()); 
			stmt.setString(6, tutor.getSenha()); 
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar o update");
			throw new RuntimeException();
		}
	}
	
	public void delete(int id) {
		String sql = "delete from tutores where idTutor=?";
		PreparedStatement stmt;
		
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar o delete tutor");
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public Tutor selectById(int id) {
		String sql = "SELECT * FROM TUTORES WHERE idTutor = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery(); 
			
			Tutor tutor = new Tutor();
			if(rs.next()) {
				tutor.setNome(rs.getString("nome"));
				tutor.setEndereco(rs.getString("endereco"));
				tutor.setTelefone(rs.getString("telefone"));
				tutor.setCpf(rs.getString("cpf"));
				tutor.setIdTutor(rs.getInt("idTutor"));
				tutor.setSenha(rs.getString("senha"));
			}
			rs.close();
			stmt.close();
			return tutor;
			
		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar select by id (tutor)");
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
	}
	
	public List<Tutor> selectAll() {
		
		List<Tutor> tutores = new ArrayList<Tutor>();
		String sql = "select * from tutores";

		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
							
				Tutor tutor = new Tutor();
				tutor.setNome(rs.getString("nome"));
				tutor.setEndereco(rs.getString("endereco"));
				tutor.setTelefone(rs.getString("telefone"));
				tutor.setCpf(rs.getString("cpf"));
				tutor.setIdTutor(rs.getInt("idTutor"));
				tutor.setSenha(rs.getString("senha"));

				tutores.add(tutor);
			}
			rs.close();
			stmt.close();
			return tutores;
		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar select");
			throw new RuntimeException();
		}
	}


}
