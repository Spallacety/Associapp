package br.edu.ifpi.associapp.teste;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import br.edu.ifpi.associapp.dao.ConnectionFactory;

public class TesteSqlite {
	
	public static void main(String[] args)throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		
		String sql = "select * from gestao";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.executeQuery(sql);
	}
	
	
}
