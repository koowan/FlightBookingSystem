public class Passenger{
	private String name;
	private PassengerType type;
	private String address;
	private String passportNum;
	private String businessName;
	    
	public Passenger() throws InputValidationException{
		setName(null);
		setType(PassengerType.STANDARD);
		setAddress(null);
		setPassportNum(null);
		setBusinessName(null);
	}


	public Passenger(String name, PassengerType type, String address, String passportNum, String businessName) throws InputValidationException{
		setName(name);
		setType(type);
		setAddress(address);
		setPassportNum(passportNum);
		setBusinessName(businessName);
	}

	
	public String getName(){
		return this.name;
	}

	public void setName(String name) throws InputValidationException {
		if (name.matches("\\p{Alpha}){1,15}")){
			this.name = name;
		} else {
			throw new InputValidationException();
		}
	}

	public PassengerType getType(){
		return this.type;
	}

	public void setType(PassengerType type){
		this.type = type;
	}

	public String getAddress(){
		return this.address;
	}

	public void setAddress(String address) throws InputValidationException {
		if (address.matches("\\p{Digit}(\\p{Space}(\\p{Alpha}(\\p{Space}(\\p{Alpha}){3, 30}")){
			this.address = address;
		} else {
			throw new InputValidationException();
		}
	}

	public String getPassportNum(){
		return this.passportNum;
	}

	public void setPassportNum(String passportNum) throws InputValidationException {
		if (passportNum.matches("\\p{Digit}){8}")){
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
		if (this.type == PassengerType.BUSINESS)
			System.out.println("\nName: " + this.name + "\nType: " + this.type + "\nBusiness: " + this.businessName + "\nAddress: " + this.address + "\nPassport #: " + this.passportNum);
		else
			System.out.println("\nName: " + this.name + "\nType: " + this.type + "\nAddress: " + this.address + "\nPassport #: " + this.passportNum);
		
	}


}
