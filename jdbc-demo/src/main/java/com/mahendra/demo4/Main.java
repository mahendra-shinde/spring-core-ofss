package com.mahendra.demo4;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		Connection con = null;
		
		Properties props = new Properties();
		try {
			props.load(Main.class.getResourceAsStream("/db.properties"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager
						.getConnection(
								props.getProperty("db.url"), 
								props.getProperty("db.user"),
								props.getProperty("db.pass")
						);
			System.out.println("Connected to Database");
			PreparedStatement st = con.prepareStatement("select * from hr.departments");
			ResultSet rs = st.executeQuery();
			System.out.println("DEPTID|LOC_ID|MAN_ID|NAME");
			while(rs.next()) {
				System.out.printf(" %4d | %4d | %4d | %20s \n",
						rs.getInt("department_id"), 
						rs.getInt("location_id"), 
						rs.getInt("manager_id"), 
						rs.getString("department_name") );
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

}
