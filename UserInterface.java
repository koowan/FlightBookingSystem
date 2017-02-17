public class UserInterface{
//prints out menu options so main isn't cluttered

    public void displayMainMenu(){
  	//display the Main Menu
  	System.out.println("Welcome to Scotia Airlines!");
  	System.out.println("---------------------------");
  	System.out.println("1.Flight Administration");
  	System.out.println("2.Book a flight");
  	System.out.println("3.Cancel a flight");
  	System.out.println("4.Display Flight Details");
  	System.out.println("5.Quit");
  	System.out.println("Make your selection:");
  	}

    public void displayAdminMenu(){
    //display the admin menu
    System.out.print("");
    System.out.println("Admin Menu");
    System.out.println("---------------------------");
    System.out.println("1.Close a flight");
    System.out.println("2.Quit");
    System.out.println("Make your selection:");
    }

    public void displayFlightOneDetails(){
      //display the details of flight one
      System.out.print("");
      System.out.println("[1]");
      System.out.println("Flight Number: 1234");
      System.out.println("Departs From: Glasgow");
      System.out.println("Arrives At: Western Isles");
      System.out.print("");
    }

    public void displayFlightTwoDetails(){
      //display the details of the flight two
      System.out.print("");
      System.out.println("[2]");
      System.out.println("Flight Number: 4321");
      System.out.println("Departs From: Western Isles");
      System.out.println("Arrives At: Glasgow");
      System.out.print("");
    }

}
