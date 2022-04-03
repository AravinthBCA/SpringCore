import java.util.List;

public class ProductsList {
	private List<String> productName;

	public List<String> getProductName() {
		return productName;
	}

	public void setProductName(List<String> productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductsList [productName=" + productName + "]";
	}
	
	
}
