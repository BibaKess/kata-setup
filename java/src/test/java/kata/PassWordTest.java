package kata;

import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
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
	 void pass_word_hasMoreThanSixCaractere_notValid() {
		Password password = new Password("pass");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertFalse(password.hasMoreThanSixCaractere());
	}
	
	@Test
	 void pass_word_hasMoreThanSixCaractere_valid() {
		Password password = new Password("pass1234");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertTrue(password.hasMoreThanSixCaractere());
	}

    @Test
    void name() throws Exception {
        Assertions.assertTrue("a".matches("a"));
        Assertions.assertTrue("a".matches("a+"));
        Assertions.assertTrue("aa".matches("a+"));
        Assertions.assertTrue("aa".matches("[a-z]+"));
        Assertions.assertTrue("az".matches("[a-z]+"));
        Assertions.assertTrue("Aa".matches("[a-zA-Z]+"));
        Assertions.assertTrue("aZ".matches("[a-zA-Z]+"));
        Assertions.assertTrue("1Z".matches(".[a-zA-Z]+"));
        Assertions.assertTrue("rrrr1Z".matches(".*[a-zA-Z]+"));
        Assertions.assertTrue("rrrr1Z666jjj".matches(".*[a-zA-Z]+"));
        Assertions.assertTrue("rrrr1Z666".matches(".*[a-zA-Z]+.*"));
//        Assertions.assertTrue("a".matches("/^([a-zA-Z]+)$/"));
//        Assertions.assertTrue("az".matches("/^([a-zA-Z]+)$/"));
    }
    
    @Test
    void pass_word_Valid(){
		Password password = new Password("123$pass");

		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertTrue(password.hasAtLeastOneNumber());
		Assertions.assertTrue(password.hasAtLeastOneCaracter());
		Assertions.assertTrue(password.hasMoreThanSixCaractere());
	}
    
    @Test
    void pass_word_notValid(){
		Password password = new Password("");

		Assertions.assertFalse(password.isValidPassword());
	}
    
    @Test
    void pass_word_Valid_(){
		Password password = new Password("123$Pass");

		Assertions.assertTrue(password.isValidPassword());
	}
}
