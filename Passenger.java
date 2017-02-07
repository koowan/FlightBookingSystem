public class Passenger{
    private String name;
    private String type;
    private String address;
    private String passportNum;

    public Passenger(String name, String type, String address, String passportNum){
      setName(name);
      setType(type);
      setAddress(address);
      setPassportNum(passportNum);
    }

    public String getName(){
      return this.name;
    }

    public void setName(String name){
      this.name = name;
    }

    public String getType(){
      return this.name;
    }

    public void setType(String type){
      this.type = type;
    }

    public String getAddress(){
      return this.address;
    }

    public void setAddress(String address){
      this.address = address;
    }

    public String getPassportNum(){
      return this.passportNum;
    }

    public void setPassportNum(String passportNum){
      this.passportNum = passportNum;
    }


}
