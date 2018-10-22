import static org.junit.Assert.*;

import org.junit.Test;

public class MufasaAccountTest {
	@Test
	public void MufasaAccountTest_1() {
		MufasaAccount MA = new MufasaAccount("Osoite", "Kaupunki", "12345", "Perkele", "password1234", 
			"bill gates", "VISA","123456789", "10/10/2020");
		assertEquals("Osoite","Osoite",MA.getAddress());
	}
}
