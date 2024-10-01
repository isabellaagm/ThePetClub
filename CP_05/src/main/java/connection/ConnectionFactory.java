package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@SuppressWarnings("unused")
public class ConnectionFactory {
	
	private static Connection connection;
	private final static String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private final static String USER = "rm99451";
	private final static String PASSWORD = "280703";

	public static Connection conectar() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao conectar ao banco de dados", e);
		}
		return connection;
	}

	}

