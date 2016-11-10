package metu.shirazu.stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class Product {
		
		private String [] supplier; 
		private String id ;
		private String title;
		private double price;
		private int threshold;
		private int totalInStock;
		
		public String[] getSupplier() {
			return Arrays.copyOf(supplier, supplier.length);
		}
		public void setSupplier(String[] supplier) {
			supplier = Arrays.copyOf(supplier, supplier.length);
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getThreshold() {
			return threshold;
		}
		public void setThreshold(int threshold) {
			this.threshold = threshold;
		}
		public int getTotalInStock() {
			return totalInStock;
		}
		public void setTotalInStock(int totalInStock) {
			this.totalInStock = totalInStock;
		}
		
		
		public void orderProduct(){
			
		}
		
		public void getAllSuppliers(){
			ArrayList <Supplier> allSupplier = new  ArrayList <Supplier>();
			System.out.println("FOREIGN SUPPLIERS:");
			Iterator<Supplier> itr= allSupplier.iterator(); 
			
			while(itr.hasNext()){
				Supplier element = itr.next();
				System.out.println("Id of Supplier " +element.getId()+ " Contact person: " +element.getContactPerson());
			}
			
		}
		
		public abstract int getPhysicalSize();
		
}
