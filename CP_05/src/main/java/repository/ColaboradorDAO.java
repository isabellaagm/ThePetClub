package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.Colaborador;

public class ColaboradorDAO {
	
	private Connection connection;
	
	public ColaboradorDAO() {
		this.connection = ConnectionFactory.conectar();
	}
	
	public void insert(Colaborador colaborador){
		String sql = "INSERT INTO colaboradores VALUES(?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, colaborador.getIdColaborador()); 
			stmt.setString(2, colaborador.getNome()); 	
			stmt.setString(3, colaborador.getCpf()); 
			stmt.setString(4, colaborador.getSenha());

			stmt.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Colaborador colaborador, int id) {
		String sql = "update colaboradores set nome=?, cpf=?, where idcolaborador=?";
		PreparedStatement stmt;
		
		try {
			stmt = connection.prepareStatement(sql);
			
			
			stmt.setString(1, colaborador.getNome()); 	
			stmt.setString(2, colaborador.getCpf()); 
			stmt.setString(3, colaborador.getSenha()); 
			stmt.setInt(4, colaborador.getIdColaborador()); 
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar o update");
			throw new RuntimeException();
		}
	}
	
	public void delete(int id) {
		String sql = "delete from colaboradores where id=?";
		PreparedStatement stmt;
		
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar o delete");
			throw new RuntimeException();
		}
	}
	
	public Colaborador selectById(int id) {
		String sql = "SELECT * FROM colaboradores WHERE id = ?";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery(); 
			


			Colaborador colaborador = new Colaborador();
			
	
			colaborador.setNome(rs.getString("nome"));
			colaborador.setCpf(rs.getString("cpf"));
			colaborador.setSenha(rs.getString("SENHA"));

			rs.close();
			stmt.close();
			return colaborador;
			
		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar select by id");
			throw new RuntimeException();
		}
		
		
	}
	
	public List<Colaborador> selectAll() {
		
		List<Colaborador> colaboradores = new ArrayList<Colaborador>();
		String sql = "select * from colaboradores";

		PreparedStatement stmt;
		try {
			stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
							
				Colaborador colaborador = new Colaborador();
				colaborador.setNome(rs.getString("nome"));
				colaborador.setCpf(rs.getString("cpf"));
				colaborador.setSenha(rs.getString("senha"));

				colaboradores.add(colaborador);
			}
			rs.close();
			stmt.close();
			return colaboradores;
		} catch (SQLException e) {
			System.out.println("Erro ao tentar executar select");
			throw new RuntimeException();
		}
	}
	
}