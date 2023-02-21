package com.cogent.EmployeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cogent.EmployeeManagement.ConnectToDB;

public class BusinessLogic {
	Connection conn= null;
	//Insert
	void addData() throws SQLException {
		conn=ConnectToDB.connectSetUp();
		PreparedStatement stmt=conn.prepareStatement("insert into EmployeeManagement values(?,?)");  
		stmt.setInt(1,114); 
		stmt.setString(2,"Smith");  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
}

	//Select
	void readData() throws SQLException {
		conn=ConnectToDB.connectSetUp();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EmployeeManagement");
		
		while (rs.next()) {
			// Display values
			System.out.print("ID: " + rs.getInt("PersonID"));
			System.out.println(", Name: " + rs.getString("FirstName"));

	}
	}

	void updateData() throws SQLException {
		conn = ConnectToDB.connectSetUp();
		PreparedStatement stmt = conn.prepareStatement("UPDATE EmployeeManagement SET FirstName=? WHERE PersonID=?");
	
		stmt.setString(1, "Huang");
		stmt.setInt(2, 111);
		int i = stmt.executeUpdate();
		System.out.println("records updated");
	}
	//delete
	void deleteData() throws SQLException {
		conn = ConnectToDB.connectSetUp();
		PreparedStatement stmt = conn.prepareStatement("DELETE FROM EmployeeManagement WHERE PersonID = ?");
		//deletes the record where PersonID is 112
		stmt.setInt(1, 112);
		int i = stmt.executeUpdate();
		System.out.println("records deleted");
	}
	}
