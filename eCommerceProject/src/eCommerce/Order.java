package eCommerce;

public class Order {
	private User user;
	private Product product;
	private CreditCard creditCard;
	
	public Order(User user,Product product,CreditCard creditCard) {
		this.user = user;
		this.product = product;
		this.creditCard = creditCard;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
}
