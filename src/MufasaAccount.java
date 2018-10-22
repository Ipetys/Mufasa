// I'm too lazy to handle all variables as well as with UserData. 
// Point of the whole exercise is lost with all these getters and setters and all junk.

public class MufasaAccount {
	private String address;
	private String city;
	private String postal;
	private String country;
	private String password;
	private String cardholder;
	private String cardtype;  //yes this was supposed to be a list, but I don't care
	private String cardnum;
	private String cardexpdate;
	
	
	//constructor
	public MufasaAccount(String address, String city, String postal, String country, String password, 
			String cardholder, String cardtype, String cardnum, String cardexpdate) {
		this.address = address;
		this.city = city;
		this.postal = postal;
		this.country = country;
		this.password = password;
		this.cardholder = cardholder;
		this.cardtype = cardtype;
		this.cardnum = cardnum;
		this.cardexpdate = cardexpdate;
	}	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getCardexpdate() {
		return cardexpdate;
	}
	public void setCardexpdate(String cardexpdate) {
		this.cardexpdate = cardexpdate;
	}

}
