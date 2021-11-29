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

	public boolean hasAtLeastOneNumber() {
		return passWordValue.matches(".*\\d+.*");
	}

	public boolean hasAtLeastOneCaracter() {
		return passWordValue.matches(".*[a-zA-Z]+.*");
	}

	public boolean hasMoreThanSixCaractere() {
		return passWordValue.length()>6;
	} 
	
	public boolean isValidPassword() {
		return hasMoreThanSixCaractere() && hasAtLeastOneNumber() && hasAtLeastOneCaracter();
	}

}
