package com.cogent.BankServlets;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")

public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String URL = "jdbc:mysql://localhost/batch65";
	final String USER = "root";
	final String PASSWORD = "betterme";
	final String DRIVER = "com.mysql.cj.jdbc.Driver";
	Connection conn = null;

	public void init() throws ServletException {

		// Database connection through Driver Manager
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
    	response.setContentType("text/html");
    	//((ServletResponse) request).setContentType("text/html");
        String id = request.getParameter("id");
        
         
        System.out.println("Delete: " + id);
     
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is deleted: " + id + "<br/>";      
        htmlRespone += "</html>";
        
        //////////////////logic to add to database //////
        try {
   
		PreparedStatement stmt=conn.prepareStatement("insert into Bank values(?,?,?,?)");  
		stmt.setInt(1,Integer.parseInt(id));//1 specifies the first parameter in the query  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");  
        }catch(Exception e) {
        	System.out.println("something Wrong");
        }
        /////////////////////////////////////////////////
        
        // return response
        writer.println(htmlRespone);
         
    }
 
}

}
