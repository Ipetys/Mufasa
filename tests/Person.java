import static org.junit.Assert.*;

import org.junit.Test;

public class Person {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	//Three tests for variables
	//my 'Person' is 
	@Test
	public void UserDataTest() {
		UserData us = new UserData("Seppo", "Niemi", "Sepi", "abcdefgh1234", "Finland", 
			"20/20/1970", "05012345678", "dfgjdfkl@ggg.com");
		assertEquals("Seppo","Seppo",us.getFirstName());
	}
	
	@Test
	public void UserDataTest_username() {
		UserData us = new UserData("Seppo", "Niemi", "Sepi", "abcdefgh1234", "Finland", 
			"20/20/1970", "05012345678", "dfgjdfkl@ggg.com");
		assertEquals("Seppo","Sepi",us.getUserName());
	}
	
	@Test
	public void UserDataTest_gsm() {
		UserData us = new UserData("Seppo", "Niemi", "Sepi", "abcdefgh1234", "Finland", 
			"20/20/1970", "05012345678", "dfgjdfkl@ggg.com");
		assertEquals("Seppo","05012345678",us.getGsm());
	}	
}
