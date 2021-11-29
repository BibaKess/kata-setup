package kata;

public class Password {
	
	
	private String passWordValue ;

	
	public Password(String passWordValue) {
		super();
		this.passWordValue = passWordValue;
	}

	public String getPassWordValue() {
		return passWordValue;
	}

	public void setPassWordValue(String passWordValue) {
		this.passWordValue = passWordValue;
	}

	public boolean hasAtLeastOneNumber() {
		return this.passWordValue.matches(".*\\d+.*");
	} 
	
	
	

}
