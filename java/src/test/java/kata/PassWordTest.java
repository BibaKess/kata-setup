package kata;

import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassWordTest {
	
	@Test
	 void pass_word_hasOneNumber_Valid(){
		Password password = new Password("1");

		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertTrue(password.hasAtLeastOneNumber());
		
	}
	
	@Test
	void pass_word_hasOneNumber_notValid() {
		Password password = new Password("azerty");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertFalse(password.hasAtLeastOneNumber());
		
	}
	
	@Test
	 void pass_word_hasOneCaracter_notValid() {
		Password password = new Password("123456");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertFalse(password.hasAtLeastOneCaracter());
	}
	
	@Test
	 void pass_word_hasOneCaracter_Valid() {
		Password password = new Password("az");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertTrue(password.hasAtLeastOneCaracter());
	}


    @Test
    void name() throws Exception {
        Assertions.assertTrue("a".matches("/(a+)/"));
        Assertions.assertTrue("a".matches("/^([a-zA-Z]+)$/"));
        Assertions.assertTrue("az".matches("/^([a-zA-Z]+)$/"));
    }
}
