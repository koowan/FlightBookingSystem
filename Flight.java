public class Flight{
  // my name kawan i am big weeb!
  private String flightNumber;
  private String departName;
  private String arrivalName;
  private int flightStatus; //0 = available, 1 = checking in, 2 = closed
  private double profit;
  
  public Flight(){
    setFlightNumber(null);
    setDepartName(null);
    setArrivalName(null);
    setFlightStatus(0);
    setProfit(0);
  }

  public Flight(String flightNumber, String departName, String arrivalName, int flightStatus, int double profit){
    setFlightNumber(flightNumber);
    setDepartName(departName);
    setArrivalName(arrivalName);
    setFlightStatus(flightStatus);
    setProfit(profit);
  }

  public String getFlightNumber(){
    return this.flightNumber;
  }

  public void setFlightNumber(String number){
    this.flightNumber = number;
  }

  public String getDepartName(){
    return this.departName;
  }

  public void setDepartName(String departName){
    this.departName = departName;
  }

  public String getArrivalName(){
    return this.arrivalName;
  }

  public void setArrivalName(String arrivalName){
    this.arrivalName = arrivalName;
  }

  public int getFlightStatus(){
    return this.flightStatus;
  }

  public void setFlightStatus(String flightStatus){
    this.flightStatus = flightStatus;
  }

  public double getProfit(){
    return this.profit;
  }

  public void setProfit(double profit){
    this.profit = profit;
  }

  }
}
