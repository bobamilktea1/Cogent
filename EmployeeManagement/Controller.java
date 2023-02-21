package com.cogent.EmployeeManagement;
import java.sql.SQLException;

import com.cogent.EmployeeManagement.BusinessLogic;

public class Controller {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BusinessLogic bl= new BusinessLogic();
		System.out.println("before adding: ");
		bl.readData();				
		bl.addData();
		System.out.println("after adding: ");
		bl.readData();
		System.out.println();
		System.out.println("before updating: ");
		bl.readData();			
		bl.updateData();
		System.out.println("after updating: ");
		bl.readData();
		System.out.println();
		System.out.println("before deleting: ");
		bl.readData();
		bl.deleteData();
		System.out.println("after deleting: ");
		bl.readData();
		System.out.println("success");
	}

}
