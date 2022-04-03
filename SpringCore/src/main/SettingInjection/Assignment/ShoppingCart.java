package Assignment;

public class ShoppingCart {
	Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id =" + item.getId() + ", name =" + item.getName()
		+ ", quantity =" + item.getQuantity()+  ", price = " + item.getPrice() +
		"]";
	}
	
	
}
