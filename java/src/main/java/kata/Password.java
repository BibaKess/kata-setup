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
		return passWordValue.matches(".*[a-zéèàêÅåA-Z]+.*");
	}

	public boolean hasMoreThanTenCaractere() {
		return passWordValue.length()> 10;
	} 
	public boolean hasMoreThanSixCaractere() {
		return passWordValue.length()> 6;
	} 
	
	public boolean isValidPasswordForUser() {
		return hasMoreThanSixCaractere() && hasAtLeastOneNumber() && hasAtLeastOneCaracter();
	}
	public boolean isValidPasswordForAdmin() {
		return hasMoreThanTenCaractere() && hasAtLeastOneNumber() && hasAtLeastOneCaracter() && hasAtLeastOneSpecialCars();
	}

	public boolean hasAtLeastOneSpecialCars() {
		return  passWordValue.matches(".*[.*[éèàêå$&,+,:;=?@#|'<>-]+.*]+.*");
	}

}
