package br.com.cb.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection conn;
	private static final String URL = "jdbc:mysql://localhost:3306/customers_db?serverTimezone=UTC&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "D@t@BASE_7819";
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return conn;
	}
}
