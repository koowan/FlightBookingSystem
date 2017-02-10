public class Passenger{
    private String name;
    private String type;
    private String address;
    private String passportNum;

  /*public Passenger(String name, String type, String address, String passportNum){
      setName(name);
      setType(type);
      setAddress(address);
      setPassportNum(passportNum);
    }*/

    public String getName(){
      return this.name;
    }

    public void setName(String name) throws InputValidationException {
      if (name.matches("\\p{Alpha}){1,15}")){
        this.name = name;
      }
      else {
        throw new InputValidationException();
      }
    }

    public String getType(){
      return this.name;
    }

    public void setType(String type) throws InputValidationException {
      if (type.matches("\\p{Alpha}){5,8}")){
        this.type = type;
      }
      else {
        throw new InputValidationException();
      }
    }

    public String getAddress(){
      return this.address;
    }

    public void setAddress(String address) throws InputValidationException {
      if (address.matches("\\p{Digit}(\\p{Space}(\\p{Alpha}(\\p{Space}(\\p{Alpha}){3, 30}")){
        this.address = address;
    }
      else {
        throw new InputValidationException();
      }
    }

    public String getPassportNum(){
      return this.passportNum;
    }

    public void setPassportNum(String passportNum) throws InputValidationException {
      if (passportNum.matches("\\p{Digit}){8}")){
        this.passportNum = passportNum;
    }
      else {
        throw new InputValidationException();
      }
    }

    public void viewPassenger(){
        System.out.println("\nName: " + name + "\nType: " + type + "\nAddress: " + address + "\nPassport #: " + passportNum);
    }


}
