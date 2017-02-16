public class Passenger{
	private String name;
	private String address;
	private String passportNum;
	private String businessName;
	private boolean resident;
	    
	public Passenger() throws InputValidationException{
		setName(null);
		setAddress(null);
		setPassportNum(null);
		setBusinessName(null);
		setResident(false);
	}


	public Passenger(String name, boolean resident, String address, String passportNum, String businessName) throws InputValidationException{
		setName(name);
		setResident(resident);
		setAddress(address);
		setPassportNum(passportNum);
		setBusinessName(businessName);
	}

	
	public String getName(){
		return this.name;
	}

	public void setName(String name) throws InputValidationException {
		if (name.matches("\\p{Alpha}{1,15}")){
			this.name = name;
		} else {
			throw new InputValidationException();
		}
	}

	public boolean getResident(){
		return this.resident;
	}

	public void setResident(boolean resident){
		this.resident = resident;
	}

	public String getAddress(){
		return this.address;
	}

	public void setAddress(String address) throws InputValidationException {
		//if (address.matches("\\p{Digit}\\p{Space}\\p{Alpha}\\p{Space}\\p{Alpha}{3,30}")){
			this.address = address;
		//} else {
		//	throw new InputValidationException();
		//}
	}

	public String getPassportNum(){
		return this.passportNum;
	}

	public void setPassportNum(String passportNum) throws InputValidationException {
		if (passportNum.matches("\\p{Digit}{8}")){
			this.passportNum = passportNum;
		} else {
			throw new InputValidationException();
		}
	}
	
	public String getBusinessName(){
		return this.businessName;
	}
	
	private void setBusinessName(String businessName) {
		this.businessName = businessName;
		
	}

	
	public void viewPassenger(){
		if (this.businessName != null)
			System.out.println("\nName: " + this.name + "\nPassport #: " + this.passportNum + "\nAddress: " + this.address + "\nBusiness: " + this.businessName + "\nResident?: " + this.resident);
		else
			System.out.println("\nName: " + this.name + "\nPassport #: " + this.passportNum + "\nAddress: " + this.address + "\nResident?: " + this.resident);
		
	}


}
