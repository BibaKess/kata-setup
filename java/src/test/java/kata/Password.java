package kata;

public class Password {
	
	
	private String passWordValue ;

	
	public Password(String passWordValue) {
		super();
		passWordValue = passWordValue;
	}

	public String getPassWordValue() {
		return passWordValue;
	}

	public void setPassWordValue(String passWordValue) {
		passWordValue = passWordValue;
	}

	public boolean hasAtLeastOneNumber() {
		return passWordValue.matches(".*\\d+.*");
	}

	public boolean hasAtLeastOneCaracter() {
		return passWordValue.matches("/^([a-zA-Z]+)$/");
	} 
	
	
	

}
