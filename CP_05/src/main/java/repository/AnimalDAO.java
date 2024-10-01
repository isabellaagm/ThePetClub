package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.Animal;

public class AnimalDAO {

		
	private Connection connection;
		
		
		public AnimalDAO() {
			this.connection = ConnectionFactory.conectar();
		}

		
		public void insert(Animal animal){
			String sql = "INSERT INTO animais VALUES(?,?,?,?,?,?,?)";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, animal.getIdAnimal());
				stmt.setInt(2, animal.getIdTutor());
				stmt.setString(3, animal.getNome()); 
				stmt.setString(4, animal.getRaca()); 	
				stmt.setString(5, animal.getCor()); 
				stmt.setInt(6, animal.getIdade()); 
				stmt.setString(7, animal.getGenero()); 
				stmt.execute();
				
				
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void update(Animal animal, int id) {
			String sql = "update animais set idTutor=?, nome=?, raca=?, cor=?, idade=?, genero=? where idAnimal=?";
			PreparedStatement stmt;
			
			try {
				stmt = connection.prepareStatement(sql);

				stmt.setInt(1, animal.getIdTutor());
				stmt.setString(2, animal.getNome()); 
				stmt.setString(3, animal.getRaca()); 	
				stmt.setString(4, animal.getCor()); 
				stmt.setInt(5, animal.getIdade()); 
				stmt.setString(6, animal.getGenero()); 
				stmt.setInt(7, animal.getIdAnimal());
				
				stmt.execute();
				stmt.close();

			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar o update");
				throw new RuntimeException();
			}
		}
		
		public void delete(int id) {
			String sql = "delete from animais where idAnimal=?";
			PreparedStatement stmt;
			
			try {
				stmt = connection.prepareStatement(sql);
				stmt.setInt(1, id);

				stmt.execute();
				stmt.close();

			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar o delete animal");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		
		public Animal selectById(int id) {
			String sql = "SELECT * FROM ANIMAIS WHERE idAnimal = ?";
			PreparedStatement stmt;
			try {
				stmt = connection.prepareStatement(sql);
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery(); 
				
				if(rs.next()) {
					
					Animal animal = new Animal();
					
					animal.setIdAnimal(rs.getInt("idAnimal"));
					animal.setNome(rs.getString("nome"));
					animal.setCor(rs.getString("cor"));
					animal.setRaca(rs.getString("raca"));
					animal.setIdade(rs.getInt("idade"));
					rs.close();
					stmt.close();
					return animal;
				}
				
				return null;
			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar select by id (Animal)");
				throw new RuntimeException();
			}
			
			
		}
		
		public List<Animal> selectByTutorId(int id) {
			List<Animal> animais = new ArrayList<Animal>();
			String sql = "SELECT * FROM ANIMAIS WHERE idTutor = ?";
			PreparedStatement stmt;
			try {
				stmt = this.connection.prepareStatement(sql);
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					
					Animal animal = new Animal();
					
					animal.setIdAnimal(rs.getInt("idAnimal"));
					animal.setIdTutor(rs.getInt("idTutor"));
					animal.setNome(rs.getString("nome"));
					animal.setCor(rs.getString("cor"));
					animal.setIdade(rs.getInt("idade"));
					animal.setRaca(rs.getString("raca"));

					animais.add(animal);
				}
				rs.close();
				stmt.close();
				return animais;
			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar select animal by tutor");
				e.printStackTrace();
				throw new RuntimeException();
			}
			
			
		}
		
		public List<Animal> selectAll() {
			
			List<Animal> animais = new ArrayList<Animal>();
			String sql = "select * from animais";

			PreparedStatement stmt;
			try {
				stmt = this.connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					
			
					Animal animal = new Animal();
					animal.setIdAnimal(rs.getInt("idAnimal"));
					animal.setIdTutor(rs.getInt("idTutor"));
					animal.setNome(rs.getString("nome"));
					animal.setCor(rs.getString("cor"));
					animal.setIdade(rs.getInt("idade"));
					animal.setRaca(rs.getString("raca"));

					animais.add(animal);
				}
				rs.close();
				stmt.close();
				return animais;
			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar select");
				throw new RuntimeException();
			}
		}
	
}
