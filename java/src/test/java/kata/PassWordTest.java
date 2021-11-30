package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class PassWordTest {
	
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
	 void pass_word_hasMoreThanThenCaractere_notValid() {
		Password password = new Password("pass12345");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertFalse(password.hasMoreThanTenCaractere());
	}
	
	@Test
	 void pass_word_hasMoreThanTenCaractere_valid() {
		Password password = new Password("pass12345678");
		
		Assertions.assertNotNull(password.getPassWordValue());
		Assertions.assertTrue(password.hasMoreThanTenCaractere());
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
    void pass_word_Valid_Refactoring(){
		Password password = new Password("123$Pass");

		Assertions.assertTrue(password.isValidPasswordForUser());
	}
    
    @Test
    void pass_word_notValid_lessThanSixCractere(){
		Password password = new Password("12pa");

		Assertions.assertFalse(password.isValidPasswordForUser());
	}
    
    @Test
    void pass_word_notValid_withoutCaractere(){
		Password password = new Password("1234567");

		Assertions.assertFalse(password.isValidPasswordForUser());
	}
    
    @Test
    void pass_word_notValid_withoutNumber(){
		Password password = new Password("Abcde£f");

		Assertions.assertFalse(password.isValidPasswordForUser());
	}
    @Test
    void pass_word_valid_withSpecialCars(){
    	Password password = new Password("Abcdeéà(°£f");
    	
    	Assertions.assertTrue(password.hasAtLeastOneSpecialCars());
    }
    @Test
    void pass_word_not_valid_withoutSpecialCars(){
    	Password password = new Password("Abcdedfghgff");
    	
    	Assertions.assertFalse(password.hasAtLeastOneSpecialCars());
    }
    @Test
    void test() {
    	//Assertions.assertFalse("bcdedfghgff".matches(".*[éèàêå$&+,:;=?@#|'<>.-^*()%!]+.*"));
    	Assertions.assertFalse("B".matches(".*[éèàêå]+.*"));
    }
     @Test
     void testDuPO() throws Exception {
         Assertions.assertTrue(new Password("bonjour1").isValidPasswordForUser());
         Assertions.assertTrue(new Password("123456éà").isValidPasswordForUser());
         Assertions.assertTrue(new Password("123456ééè()à").isValidPasswordForUser());
         Assertions.assertTrue(new Password("TéDéDé1").isValidPasswordForUser());
         Assertions.assertTrue(new Password("HELLO00").isValidPasswordForUser());

         Assertions.assertFalse(new Password("hello1").isValidPasswordForUser());
         Assertions.assertFalse(new Password("HELLPPP").isValidPasswordForUser());         
         Assertions.assertFalse(new Password("123456789").isValidPasswordForUser());
     }
 }
