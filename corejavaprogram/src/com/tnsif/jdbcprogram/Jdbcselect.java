package com.tnsif.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbcselect {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("org.postgresql.Driver");
		System.out.println("load is over");
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/teegala","postgres","javacore");
		
		Statement st=con.createStatement();
		String strselect="select sname,sbranch from student";
		
		System.out.println("the sql statment is "+strselect);
		
		ResultSet rs=st.executeQuery(strselect);
		System.out.println("the records are");
		int rowcount=0;
		while(rs.next()) {
			String sname=rs.getString("sname");
			String sbrach=rs.getString("sbrach");
			
			System.out.println(sname+""+sbrach);
		}
	}
		
	}
	


