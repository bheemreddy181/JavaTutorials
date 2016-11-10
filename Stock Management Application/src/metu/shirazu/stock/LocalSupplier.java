package metu.shirazu.stock;

public class LocalSupplier extends Supplier {
	
	private String deliveryMethod;

	LocalSupplier(String deliveryMethod){
		super();
		this.deliveryMethod = deliveryMethod;
		
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
		
	
	
	
	
}
