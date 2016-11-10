
package metu.shizaru.stock;


/**
 * 
 * @author MERVE
 *
 */


public class Supplier implements SupplierInterface {
	


	
	private String name;
	private String id;
	private String address;
	private String contactPerson;
	
	

	
	
	public void placeOrder(){
	//	Scanner sc= new Scanner(System.in) ;
		StockManagementApplication merve= new StockManagementApplication();
	
		System.out.println("TRY AGAIN");
		merve.menu();
		
		
		
	}
	
	public void checkStatus(){
		
	         
		
		Order f_order= new Order();
		
		 f_order.setStatus(false);
		
	}
	
	
	
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the contactPerson
	 */
	public String getContactPerson() {
		return contactPerson;
	}
	/**
	 * @param contactPerson the contactPerson to set
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	

	
	
	
	
}
