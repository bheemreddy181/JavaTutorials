package metu.shirazu.stock;

public class Supplier implements SupplierInterface {

	private String id;
	private String address;
	private String contactPerson;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkStatus() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
