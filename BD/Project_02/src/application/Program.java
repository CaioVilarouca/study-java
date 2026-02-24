package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program { // Recupera dados
	public static void main (String[] args) {
		// Conexão com Banco de Dados
		Connection conector = null;
		// Classe Statement, serva para montar um comando SQL
		Statement statment = null;
		// Classe ResultSet, contém os dados armazenado na forma de tabela 
		ResultSet resultSet = null;
		
		try {
			// Conectar o banco de dados
			conector = DB.pegarConexao();
			
			statment = conector.createStatement(); // Busca os colunas 
			// Executa uma consulta no banco de dados
			resultSet = statment.executeQuery("select * from department");
			
			while (resultSet.next()) { // next() é um método True e vai retorna False quando chegar na última posição
				System.out.printf("%d, %s \n",resultSet.getInt("Id"), resultSet.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.fechaResultSet(resultSet);
			DB.fechaStatement(statment);
			DB.fecharConexao();
		}
	}
}
