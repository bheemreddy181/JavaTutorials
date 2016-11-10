package metu.shirazu.stock;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements OrdinaryOrderInterface{
	
	private String orderName;
	private int	totalOrder;
	private boolean status;
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getTotalOrder() {
		return totalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public void getOrderStatus() {
	
		ArrayList<Order> orders = new ArrayList<Order>();
		
		Iterator <Order> itr = orders.iterator();
		
		while(itr.hasNext()){
			Order element = itr.next();
			if (!element.getOrderName().equals(null) && !element.getStatus()){
				
				System.out.println("ORDERED PRODUCT NAME: "+element.getOrderName()+"\n"+"\n"+"ORDERED COPY: "+
						element.getTotalOrder()+"\n"+"RECEIVE STATUS: "+element.getStatus());
		
			}
			
		}
	}

}
