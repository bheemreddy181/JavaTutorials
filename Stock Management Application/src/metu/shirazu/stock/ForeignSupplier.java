package metu.shirazu.stock;

public class ForeignSupplier extends Supplier {

	private double taxPerGood;
	
	ForeignSupplier(double taxPerGood){
		
		super();
		this.taxPerGood = taxPerGood;
		
	}

	public double getTaxPerGood() {
		return taxPerGood;
	}

	public void setTaxPerGood(double taxPerGood) {
		this.taxPerGood = taxPerGood;
	}

	
	public double calculateTax(int amount){
		return amount * taxPerGood;
	}
}
