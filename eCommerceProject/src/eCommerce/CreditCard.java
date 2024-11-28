package eCommerce;

public class CreditCard {
	private long cardNumber;
	private String cardUser;
	private String securityCode;
	private String expirationDate;
	
	public CreditCard(long cardNumber, String cardUser, String securityCode, String expirationDate) {
		this.cardNumber = cardNumber;
		this.cardUser = cardUser;
		this.securityCode = securityCode;
		this.expirationDate = expirationDate;
	}
	public long getCardNumber() {
		return this.cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardUser() {
		return this.cardUser;
	}
	public void setCardUser(String cardUser) {
		this.cardUser = cardUser;
	}
	public String getSecurityCode() {
		return this.securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getExpirationDate() {
		return this.expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
}
