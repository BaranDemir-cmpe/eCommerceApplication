package eCommerce;
import java.util.ArrayList;

public class User {
	private String userName;
	private String name;
	private String surName;
	private String dateOfBirth;
	private String password;
	private String eMail;
	private String homeAdress;
	private String workAdress;
	private ArrayList<Product> favoriteProducts = new ArrayList<Product>();
	private ArrayList<Product> productOrdered = new ArrayList<Product>();
	private ArrayList<CreditCard> creditCards = new ArrayList<CreditCard>();
	
	public User(String userName,String name,String surName,String dateOfBirth,String password,String eMail,
			String homeAdress,String workAdress) {
		this.userName = userName;
		this.name = name;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.eMail = eMail;
		this.homeAdress = homeAdress;
		this.workAdress = workAdress;
	}
	public void setFavoriteProducts(ArrayList<Product> favoriteProducts) {
		this.favoriteProducts = favoriteProducts;
	}
	public ArrayList<Product> getFavoriteProducts(){
		return this.favoriteProducts;
	}
	public void setProductOrdered(ArrayList<Product> productOrdered) {
		this.productOrdered = productOrdered;
	}
	public ArrayList<Product> getProductOrdered(){
		return this.productOrdered;
	}
	
	public void setCreditCards(ArrayList<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}

	public ArrayList<CreditCard> getCreditCards(){
		return this.creditCards;
	}
	
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}

	public String getWorkAdress() {
		return workAdress;
	}

	public void setWorkAdress(String workAdress) {
		this.workAdress = workAdress;
	}
	
	public void favoriteList(Product product) {
		this.favoriteProducts.add(product);
	}
	
	public void purchase(ArrayList<Product> productList) {
		for(int i=0;i<productList.size();i++) {
			if(productList.get(i).getStockInfo()<0) {
				productList.remove(i);
			}
			
			
			else
				System.out.println("Purchase is successful");
			break;
			
		}
	}
}
