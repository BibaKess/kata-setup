package kata;

import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassWordTest {
	
	@Test
	public void pass_word_valid(){
		Password password = new Password("1");

		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertTrue(password.hasAtLeastOneNumber());
		
	}
	
	@Test
	public void pass_word_isNotValid() {
		Password password = new Password("azerty");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertFalse(password.hasAtLeastOneNumber());
		
	}
	
	@Test
	public void pass_word_hasOneCaracter() {
		Password password = new Password("123456");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertTrue(password.hasAtLeastOneCaracter());
	}

}
