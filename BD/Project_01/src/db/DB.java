package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
		/* Método auxiliar para carregar as propriedades
		 * que estão salva no arquivo "db.propertites".*/
	private static Properties carregarPropriedades() {
		
		// Entrada do arquivo 
		try (FileInputStream entradaArquivo = new FileInputStream("db.properties")) {
			
			Properties propriedade = new Properties();
			// load == leitura do arquivo 
			propriedade.load(entradaArquivo);
			return propriedade;
		}
		catch (IOException e) {
			throw new DBException(e.getMessage());
		}
	}
	
	// Objeto de conexão com o banco de dados do JDBC
	private static Connection conector = null;
	
	// Método para conectar com o banco de dados
	public static Connection pegarConexao() {
		if (conector == null) {
			try {
				Properties propriedade = carregarPropriedades();
				// URL == caminho 
				String url = propriedade.getProperty("dburl");
				
				// Conectar com o banco de dados
				conector = DriverManager.getConnection(url, propriedade);
			}
			catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
		return conector;
	}
	
	// Método para fechar a conexão com o banco de dados JDBC
	public static void fecharConexao() {
		if (conector != null)
			try {
				conector.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
	}
}
