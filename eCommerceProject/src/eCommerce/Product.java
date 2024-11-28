package eCommerce;

public class Product {
	private String productName;
	private String productColor;
	private String productCategory;
	private int stockInfo;
	private int productWeight;
	private String description;
	
	public Product(String productName,String productColor,String productCategory,int stockInfo,
			int productWeight,String description) {
		this.productName = productName;
		this.productColor = productColor;
		this.productCategory = productCategory;
		this.stockInfo = stockInfo;
		this.productWeight = productWeight;
		this.description = description;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductColor() {
		return this.productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getStockInfo() {
		return this.stockInfo;
	}

	public void setStockInfo(int stockInfo) {
		this.stockInfo = stockInfo;
	}

	public int getProductWeight() {
		return this.productWeight;
	}

	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int reducingStock(int number) {
		this.stockInfo = this.getStockInfo()-number;
		if(this.stockInfo<0) {
			System.out.println("There is no stock!");
			return this.stockInfo;
		}
		else
			return this.stockInfo;
	}
	
}
