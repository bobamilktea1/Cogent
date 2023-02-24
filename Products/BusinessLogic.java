package com.cogent.products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class BusinessLogic {
	static Connection conn= null;
	
	//Insert
	public static void addProduct (int id, String name, double cost, double discount, int available, int sold) throws SQLException {
		conn=ConnectToDB.connectSetUp();
		PreparedStatement stmt=conn.prepareStatement("insert into Product values(?,?,?,?,?,?)"); 
		stmt.setInt(1, id); 
		stmt.setString(2,name);  
		stmt.setDouble(3, cost);  
		stmt.setDouble(4, discount); 
		stmt.setInt(5, available); 
		stmt.setInt(6, sold); 
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
	}
	
	//Show
		public static void readProduct() throws SQLException, ClassNotFoundException {
			conn=ConnectToDB.connectSetUp();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Product");
			ArrayList<Product> list = new ArrayList<Product>();
			while (rs.next()) {
				// Display values
				System.out.print("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Cost: " + rs.getDouble("cost") + ", Discount: " + rs.getDouble("discount") + ", Available: " + rs.getInt("available") + ", Sold: " + rs.getInt("sold"));
			System.out.println("\n");
				
		}
		}
    private List<Product> products;
    public BusinessLogic() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProductsByDiscount() {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getDiscount).reversed())
                .collect(Collectors.toList());
    }

    public List<Product> getProductsBySold() {
        return products.stream()
                .sorted(Comparator.comparingInt(Product::getSold).reversed())
                .collect(Collectors.toList());
    }

    public List<Product> getProductsByCost() {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getCost))
                .collect(Collectors.toList());
    }

    public void increaseDiscountIfSold10(Product product) {
        if (product.getSold() == 10) {
            product.setDiscount(product.getDiscount() + 0.1);
        }
    }
    }


