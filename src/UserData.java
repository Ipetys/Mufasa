import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserData {
	//required variables
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String country;
	private String birthdate;
	private String gsm;
	private String email;

	//constructor
	public UserData(String firstName, String lastName, String userName, String password, String country, 
			String birthdate, String gsm, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.country = country;
		this.birthdate = birthdate;
		this.gsm = gsm;
		this.email = email;
	}
	
	//getter and setter for firstname
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName) throws UserDataException {
		String pattern = "^[A-z]+$";
		boolean check = firstName.matches(pattern);
		if(check == true){		
			this.firstName = firstName;
		} else {
			throw new UserDataException("Firstname is not valid!");
		}
	}

	//getter and setter for lastname
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) throws UserDataException {
		String pattern = "^[A-z]+$";
		boolean check = lastName.matches(pattern);
		if(check == true){		
			this.lastName = lastName;
		} else {
			throw new UserDataException("Lastname is not valid!");
		}		
	}
	
	//getter and setter for username
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) throws UserDataException {
		String pattern = "^[a-zA-Z+][[A-Za-z\\\\d_+]{4,15}$";
		boolean check = userName.matches(pattern);		
		if(check == true) {
			this.userName = userName;
		} else {
			throw new UserDataException("Username not valid!");
		}
	}
	
	//getter and setter for password
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password, String confirmPassword) throws UserDataException {
		String pattern = "^(?=.*[a-zA-Z!@#$%^&*()_+])[[A-Za-z\\d!@#$%^&*()_+]{8,19}$";
		boolean check = password.matches(pattern);
		if (check == true && password == confirmPassword) {
			this.password = password;
		} else {
			throw new UserDataException("Password not valid!");
		}
	}
	
	
	//getter and setter for country
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) throws UserDataException {
		String pattern = "^[A-z]+$";
		// I wonder if there is a library or something to check countries or a list with countries...
		boolean check = country.matches(pattern);
		if (check) {
			this.country = country;
		} else {
			throw new UserDataException("Country not valid!");
		}
	}
	
//getter and setter for birthdate + a small method to check if the birthdate is valid	
	public String getBirthdate() {
		return birthdate;
	}
	
	public boolean checkBirthdate(String birthdate) {
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
	          format.parse(birthdate);
	          return true;
	     }
	     catch(ParseException e){
	          return false;
	     }
	}
	
	public void setBirthday(String birthdate) throws UserDataException, ParseException {
		boolean check = checkBirthdate(birthdate);
		if (check) {
			this.birthdate = birthdate;
		} else {
			throw new UserDataException("Birthdate not valid!");
		}
	}
	
	
//getter and setter for GSM	
	public String getGsm() {
		return gsm;
	}
	
	public void setGsm(String gsm) throws UserDataException{
		String pattern = "^[0-9]+$";
		boolean check = gsm.matches(pattern);
		if (check) {
			this.gsm = gsm;
		} else {
			throw new UserDataException("Not a valid GSM-number!");
		}
	}
	
	
// getter and setter for email	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) throws UserDataException {
		String pattern = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}";
		boolean check = email.matches(pattern);
		if (check) {
			this.email = email;
		} else {
			throw new UserDataException("Not a valid E-mail address!");
		}
	}
	
}
