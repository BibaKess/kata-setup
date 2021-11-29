package kata;

import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassWordTest {
	
	@Test
	public void pass_word_valid(){
		Password passWord = new Password("1");

		
		Assertions.assertNotNull(passWord.getPassWordValue());
		Assertions.assertTrue(passWord.hasAtLeastOneNumber());
		
	}
	
	@Test
	public void pass_word_isNotValid() {
		Password password = new Password("azerty");
	}

}
