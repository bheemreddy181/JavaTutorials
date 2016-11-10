package metu.shirazu.stock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StockManagementApplication {
	static Scanner option = new Scanner(System.in);
	ArrayList <Supplier> supplier = new ArrayList <Supplier>();
	ArrayList <Product> product = new ArrayList <Product>();
	ArrayList <Order> order = new ArrayList <Order>();
	
	Iterator <Product> ProductItr = product.iterator();
	public static void main(String[] args) {
		
		
		
		menu();
	
	}
	
	public static void menu(){
		
		
		System.out.println("----------------MENU----------------");
		System.out.println( "0 - Exit");
		System.out.println(" 1 - Add New Product");
		System.out.println(" 2 - Remove a Product");
		System.out.println(" 3 - List All Music Products");
		System.out.println(" 4 - List All Movie Products");
		System.out.println(" 5 - List All Book Products");
		System.out.println(" 6 - List All Suppliers");
		System.out.println(" 7 - List All Foreign Suppliers");
		System.out.println(" 8 - List All Local Suppliers");
		System.out.println(" 9 - List All current Orders");
		System.out.println("10 - Increase Product in Stock");
		System.out.println("11 - Decrease Product in Stock");
		System.out.println("12 - Received Order");
		System.out.println("13 - Total Product in Stock");
		System.out.println("14 - Place Order");
		System.out.println("15 - Check Status of Product");
		int choose = option.nextInt();
		switch (choose){
		
		case 0: 
			break;
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		
		}
		
		
	}

	public void addNewProduct(){
		
		System.out.println("What do want to add to the product list");
		System.out.println("Press 1 to for Movie ----- 2 for Music ---- 3 for Book ");
		int type =option.nextInt();
		
		
		if (type == 1){
			System.out.println(" Enter the id of movie");
			String id = option.nextLine();
			
			while(ProductItr.hasNext())
			{
				Product element= ProductItr.next();
				if(element.getId().equals(id)){
					System.out.println("This movie is already added");
				}
				else{
					
				}
			}
			
		}
		
		
		
	}
}
