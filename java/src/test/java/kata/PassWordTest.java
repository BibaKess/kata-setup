package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassWordTest {
	
	@Test
	public void pass_word_valid(){
		Password passWord = new Password("1");

		Assertions.assertThat(passWord.getPassWordValue()).isNotEmpty();
	}

}
