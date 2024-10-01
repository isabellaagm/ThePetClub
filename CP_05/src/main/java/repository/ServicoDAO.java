package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.Servico;

public class ServicoDAO {

		
	private Connection connection;
		
		
		public ServicoDAO() {
			this.connection = ConnectionFactory.conectar();
		}

		
		public void insert(Servico servico){
			String sql = "INSERT INTO SERVICOS VALUES(?,?,?,?)";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, servico.getIdServico());
				stmt.setString(2, servico.getServico());
				stmt.setInt(3, servico.getIdAnimal()); 	
				stmt.setString(4, servico.getData());  
				stmt.execute();
				
				stmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void update(Servico servico, int id) {
			String sql = "update SERVICOS set idAnimal=?, data=?, servico=? where idServico=?";
			PreparedStatement stmt;
			
			try {
				stmt = connection.prepareStatement(sql);
				
				stmt.setInt(1, servico.getIdAnimal()); 	
				stmt.setString(2, servico.getData()); 
				stmt.setString(3, servico.getServico()); 
				stmt.setInt(4, servico.getIdServico());
				
				stmt.execute();
				stmt.close();

			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar o update");
				throw new RuntimeException();
			}
		}
		
		public void delete(int id) {
			String sql = "delete from SERVICOS where idServico=?";
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
		
		public void deleteByAnimalId(int id) {
			String sql = "delete from servicos where idAnimal=?";
			PreparedStatement stmt;
			boolean tem;
			try {
				stmt = connection.prepareStatement(sql);
				stmt.setInt(1, id);

				do {
					tem=stmt.execute();
				}while(tem==true);
				stmt.close();

			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar o delete servico by id animal");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		
		public Servico selectById(int id) {
			String sql = "SELECT * FROM SERVICOS WHERE idServico = ?";
			PreparedStatement stmt;
			try {
				stmt = connection.prepareStatement(sql);
				stmt.setInt(1, id);

				ResultSet rs = stmt.executeQuery(); 
				
				if(rs.next()) {
					Servico servico = new Servico();
					
					servico.setIdAnimal(rs.getInt("idAnimal"));
					servico.setData(rs.getString("data"));
					servico.setServico(rs.getString("descricao"));
					servico.setIdServico(rs.getInt("idServico"));
					rs.close();
					stmt.close();
					return servico;
					
				}

				
			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar select by id");
				throw new RuntimeException();
			}
			return null;
			
			
		}
		
		public List<Servico> selectByIdAnimal(int id) {
			List<Servico> servicos = new ArrayList<Servico>();
			String sql = "SELECT * FROM SERVICOS WHERE idAnimal = ?";
			PreparedStatement stmt;
			try {
				stmt = this.connection.prepareStatement(sql);
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery(); 
				
				while(rs.next()) {
					
					Servico servico = new Servico();
					
					servico.setIdAnimal(rs.getInt("idAnimal"));
					servico.setData(rs.getString("data"));
					servico.setServico(rs.getString("descricao"));
					servico.setIdServico(rs.getInt("idServico"));
					
					servicos.add(servico);
				}
				rs.close();
				stmt.close();
				return servicos;
			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar select by id (Servico by Animal)" + id);
				e.printStackTrace();
				throw new RuntimeException();
			}
			
			
		}
		
		public List<Servico> selectAll() {
			
			List<Servico> servicos = new ArrayList<Servico>();
			String sql = "select * from SERVICOS";

			PreparedStatement stmt;
			try {
				stmt = this.connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					
			
					Servico servico = new Servico();
					
					servico.setIdAnimal(rs.getInt("idAnimal"));
					servico.setData(rs.getString("data"));
					servico.setServico(rs.getString("descricao"));
					servico.setIdServico(rs.getInt("idServico"));

					servicos.add(servico);
				}
				rs.close();
				stmt.close();
				return servicos;
			} catch (SQLException e) {
				System.out.println("Erro ao tentar executar select");
				throw new RuntimeException();
			}
		}
	
}

