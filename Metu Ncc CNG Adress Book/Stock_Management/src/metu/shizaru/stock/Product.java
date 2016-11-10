
package metu.shizaru.stock;
/**
 * 
 * @author MERVE
 *
 */

public abstract class Product {
	
	private String[] supplierName;
	private String id;
	private String title;
	private double price;
	private int treshold;
	private int totallnStock;
	
	public void orderProduct(){
		
		System.out.print("");
		
	}
	public void getAllSuppliers(){
		StockManagementApplication merve= new StockManagementApplication();
		System.out.println("FOREIGN SUPPLIERS:");
		merve.listAllForeignSuppliers();	
		System.out.println("LOCAL SUPPLIERS:");
			merve.listAllLocalSuppliers();
			System.out.println(" -------------------");  		
	}
	
	
	
	
	
	
	public abstract int getPhysicalSize();
	/**
	 * @return the supplierName
	 */

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the treshold
	 */
	public int getTreshold() {
		return treshold;
	}
	/**
	 * @param treshold the treshold to set
	 */
	public void setTreshold(int treshold) {
		this.treshold = treshold;
	}
	/**
	 * @return the totallnStock
	 */
	public int getTotallnStock() {
		return totallnStock;
	}
	/**
	 * @param totallnStock the totallnStock to set
	 */
	public void setTotallnStock(int totallnStock) {
		this.totallnStock = totallnStock;
	}
	/**
	 * @return the supplierName
	 */
	public String[] getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierId the supplierName to set
	 */
	/**
	 * @param supplierName
	 */
	public void setSupplierName(String[] supplierName) {
		this.supplierName = supplierName;
	}
	
	
	


}
