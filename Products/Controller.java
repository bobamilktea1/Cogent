package com.cogent.products;
import java.sql.SQLException;

public class Controller {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	 BusinessLogic bl = new BusinessLogic();
    	 bl.readProduct();
    	 bl.addProduct(6, "Product 6", 60, 0.5, 600, 250);
    	 bl.readProduct();
    	// Display products by discount
         System.out.println("Products by discount: ");
         bl.getProductsByDiscount().forEach(System.out::println);

         // Display products by sold
         System.out.println("Products by sold: ");
         bl.getProductsBySold().forEach(System.out::println);

         // Display products by cost
         System.out.println("Products by cost: ");
    	 }
}
