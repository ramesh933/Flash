package org.com;

import java.sql.*;

public class Mysql {
	
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection M = DriverManager.getConnection("jdbc:mysql://localhost:3306/Datamatrix","root","manu98");
		Statement S = M.createStatement();
		int sql = S.executeUpdate("insert into Details values(1,'manu')");
		System.out.println(sql+"records affected");
		M.close();
}

}
