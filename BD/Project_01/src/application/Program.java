package application;

import java.sql.Connection;

import db.DB;

public class Program {
	public static void main (String[] args) {
		Connection conector = DB.pegarConexao();
		DB.fecharConexao();
		System.out.println("Conexão com sucesso ao banco de dados.");	}
}
