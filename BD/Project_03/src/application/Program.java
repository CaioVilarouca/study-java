package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import db.DB;

public class Program { // Inserir dados
	public static void main (String[] args) {
		// Conexão com Banco de Dados
		Connection conector = null;
		// Objeto para inserir
		PreparedStatement preparedStatament = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			// Conectar com banco
			conector = DB.pegarConexao();
			
			preparedStatament = conector.prepareStatement("INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			preparedStatament.setString(1, "Caio Vilarouca");
			preparedStatament.setString(2, "caiovilarouca@gmail.com");
			preparedStatament.setDate(3, new java.sql.Date(sdf.parse("10/02/2004").getTime()));
			preparedStatament.setDouble(4, 1700.00);
			preparedStatament.setInt(5, 4);
			
			int number = preparedStatament.executeUpdate();
			
			if (number > 0) {
				ResultSet resultSet = preparedStatament.getGeneratedKeys();
				while (resultSet.next()) {
					int id = resultSet.getInt(1);
					System.out.println("ID = " + id );
				}
			}else {
				System.out.println("Nem uma linha foi Adicionada.");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.fechaStatement(preparedStatament);
			DB.fecharConexao();
		}
	}
}
