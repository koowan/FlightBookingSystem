import java.util.*;
public class MainMenu{
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    Passenger passenger = new Passenger();


    Flight one = new Flight ("1234", "Glasgow", "Western Isle", 0);
    Flight two = new Flight("4321", "Western Isle", "Glasgow", 2);

    System.out.println("Pick a flight");
    System.out.println("1. Western Isles");
    System.out.println("2. Glasgow");

    int userinput = input.nextInt();

    if (userinput == 1){
      System.out.println("Flight number: " + one.getFlightNumber() + "\nDeparture Name: " + one.getDepartName() + "\nArrival Name: " + one.getArrivalName());
      
    }
    else if(userinput == 2){
      System.out.println("Flight number: " + two.getFlightNumber() + "\nDeparture Name: " + two.getDepartName() + "\nArrival Name: " + two.getArrivalName());

    }

    }
  }
  
