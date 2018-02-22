
public class ItemByWeight extends Item implements Displayable {

	public ItemByWeight(Product product, double amount) {
		super(product, amount);
	}
	
	@Override
	public String display() {
		String displayedText = this.product.getName() +"\n";
		displayedText +=  amount + "kg @ £" + product.displayPrice() + " " + calculatePrice()+"\n";
		return displayedText;
		
	}
}
