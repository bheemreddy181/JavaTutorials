
package metu.shizaru.stock;

/**
 * 
 * @author MERVE
 *
 */
public class ForeignSupplier extends Supplier{

	/**
	 * 
	 */
	//public ForeignSupplier() {
		// TODO Auto-generated constructor stub
	//}

	private int taxPerGood;
	


	
	
	/**
	 * @return the taxPerGood
	 */
	public double getTaxPerGood() {
		return taxPerGood;
	}





	/**
	 * @param taxPerGood the taxPerGood to set
	 */
	public void setTaxPerGood(int taxPerGood) {
		this.taxPerGood = taxPerGood;
	}





	public double calculateTax(double amount) {
	return amount * taxPerGood;
	}
	
	
}
