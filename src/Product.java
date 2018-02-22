
public class Product {
	private String name;
	private Price price;
	
	public Product(String name, Price price) {
		this.name = name;
		this.price = price;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public double calculatePrice(double amount) {
		return price.calculatePrice(amount);
	}
	
	public void updateProductPrice(double newPrice) {
		price.updatePrice(newPrice);
	}
	
	public String displayPrice() {
		return price.toString();
	}
	
	@Override
	public String toString() {
		return name;
	}
}
