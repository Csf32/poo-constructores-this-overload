package Utilitario;

public class PacoteConstrutor {

	public String Name;
	public double price;
	public int quantidy_in_stock;

	public PacoteConstrutor(String Name, double price, int quantidy_in_stock) {
		
		this.Name = Name; 
		this.price = price;
		this.quantidy_in_stock = quantidy_in_stock;
	}
	
	public double total() {
		return price * quantidy_in_stock;
	}
	
	public void addProucts(int quantidy_in_stock) { 
		
		this.quantidy_in_stock += quantidy_in_stock; 
	}
	
	public void removeProducts(int quantidy_in_stock) {
		
		this.quantidy_in_stock -= quantidy_in_stock;
	}
	
	public String toString() { 
		return Name
			+ ", $ "
			 //price com 2 casas:
			+ String.format("%.2f", price)
			+ ", "
			+ quantidy_in_stock 
			+ " units, Total: $ "
			+ String.format("%.2f", total());
	}
}
