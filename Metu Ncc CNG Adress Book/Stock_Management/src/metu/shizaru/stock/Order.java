
package metu.shizaru.stock;

import java.util.ArrayList;

/**
 * 
 * @author MERVE
 *
 */
public class Order implements OrdinaryOrderInterface{
	ArrayList<Order> orders = new ArrayList<Order>();
	//private int orderNo;
	private String orderName;
	private String orderId;
	private int totalOrder;

	private boolean status;
	
	public void getOrderStatus(){
	
		
		
		
		for(int i=0;i<orders.size();i++){
			if (orders.get(i)!= null&&orders.get(i).isStatus()==true){
				
				
				System.out.println("ORDERED PRODUCT NAME: "+orders.get(i).getOrderName()+"\n"+"PRODUCT ID: "+orders.get(i).getOrderId()+"\n"+"ORDERED COPY: "+orders.get(i).getTotalOrder()+"\n"+"RECEIVE STATUS: "+orders.get(i).isStatus());
				
				
				
			}
			
		}
	}

	
	/**
	 * @return the orderName
	 */
	public String getOrderName() {
		return orderName;
	}

	/**
	 * @param orderName the orderName to set
	 */
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the totalOrder
	 */
	public int getTotalOrder() {
		return totalOrder;
	}

	/**
	 * @param totalOrder the totalOrder to set
	 */
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	

}
