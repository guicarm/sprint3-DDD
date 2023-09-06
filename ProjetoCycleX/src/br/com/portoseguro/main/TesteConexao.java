package br.com.portoseguro.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.portoseguro.conexoes.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection c = new ConnectionFactory().conexao();

		System.out.println("Conectado ao banco de dados com sucesso!");

		c.close();

	}

}
