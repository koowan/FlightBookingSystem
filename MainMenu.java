import java.util.*;
public class MainMenu{
  public static void main(String[] args) throws InputValidationException {
    //set "PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_60\bin"
    Scanner input = new Scanner(System.in);
    UserInterface userInterface = new UserInterface();
    FlightStatus flightStatus;
    SeatStatus seatStatus;
    int switch1 = 0;
    int switch2 = 0;


    Flight one = new Flight ("1234", "Glasgow", "Western Isle", FlightStatus.OPEN);
    Flight two = new Flight("4321", "Western Isle", "Glasgow", FlightStatus.CLOSED);

    try{
      do{
        userInterface.displayMainMenu();
        switch1 = input.nextInt();
        switch(switch1){
          case 1:
          do{
            System.out.println("Login required:")
            System.out.println("---------------------------");
            Staff staffaccount = new Staff("kawanc@scotairlines.com", "asdfghjkl");
            StaffAccounts staffaccounts = new StaffAccounts();
            staffaccounts.register(staffaccount);

            System.out.println("Please enter your email:");
            String email = input.nextLine();
            input.nextLine();


            System.out.println("Please enter your password:");
            String password = input.nextLine();


            Staff signIn = new Staff(email, password);
            Cipher cipher = new RailFenceCipher();

            if(cipher.verify(password, staffaccounts.lookup(email).getHashedPassword())){
              System.out.println("Login Successful");
              userInterface.displayAdminMenu();
              switch2 = input.nextInt();
            }
            else{
              System.out.println("Incorrect Email/Password");
              return;
            }
            switch(switch2){
              case 1:
                userInterface.displayFlightOneDetails();
                userInterface.displayFlightTwoDetails();
                System.out.println("Choose a flight to close:");
                int closeFlight = input.nextInt();
                if (closeFlight == 1){
                  one.closeFlight();
                  System.out.println("Flight one is now closed.")
                  return;
                }
                else if(closeFlight == 2){
                  two.closeFlight();
                  System.out.println("Flight two is now closed.")
                  return;
                }

                break;
            }//end switch 2
          } while (switch2!=2);
            break;
          case 2:
            userInterface.displayFlightOneDetails();
            userInterface.displayFlightTwoDetails();

            System.out.println("Choose a flight >");
            int flightChoice = input.nextInt();
            boolean resident = false;

            if (flightChoice == 1){
              System.out.println("---------------------------");
              userInterface.displayFlightOneDetails();
              one.flightStatusDisplay();
              System.out.println("---------------------------");
              one.generateSeats();
              one.viewAvailability();
              System.out.println("---------------------------");

              System.out.println("Enter a seat number you wish to reserve/book:");
              String seatNum = input.nextLine();
              input.nextLine();
              System.out.println("Enter your name:");
              String passengerName = input.nextLine();
              System.out.println("Are you a resident of the Western Isles? Y/N");
              String isResident = input.next();
              if (isResident.equals("N") || isResident.equals("n")){
                resident = false;
              }
              else if(isResident.equals("Y") || isResident.equals("y")){
                resident = true;
              }
              System.out.println("Enter your address:");
              String address = input.nextLine();
              input.nextLine();
              System.out.println("Enter your passport number:");
              String passportNum = input.nextLine();
              System.out.println("Enter company name:       (enter none if not business class)");
              String businessName = input.nextLine();
              one.makeReservation(seatNum, passengerName, resident, address, passportNum, businessName);

              System.out.println("");
              System.out.println("Confirm Booking");
              System.out.println("---------------------------");
              System.out.println("Enter seat number you reserved:");
              String confirmseatNum = input.nextLine();
              System.out.println("Enter you name:");
              String confirmpassengerName = input.nextLine();
              one.confirmReservation(confirmseatNum, confirmpassengerName);
              }

            else if (flightChoice ==2){
              System.out.println("---------------------------");
              userInterface.displayFlightTwoDetails();
              two.flightStatusDisplay();
              System.out.println("---------------------------");
              two.generateSeats();
              two.viewAvailability();
              System.out.println("---------------------------");

              System.out.println("Enter a seat number you wish to reserve/book:");
              String seatNum = input.nextLine();
              input.nextLine();
              System.out.println("Enter your name:");
              String passengerName = input.nextLine();
              System.out.println("Are you a resident of the Western Isles? Y/N");
              String isResident = input.next();
              if (isResident.equals("N") || isResident.equals("n")){
                resident = false;
              }
              else if (isResident.equals("Y") || isResident.equals("y")){
                resident = true;
              }
              System.out.println("Enter your address:");
              String address = input.nextLine();
              input.nextLine();
              System.out.println("Enter your passport number:");
              String passportNum = input.nextLine();
              System.out.println("Enter company name:       (enter none if not business class)");
              String businessName = input.nextLine();

              two.makeReservation(seatNum, passengerName, resident, address, passportNum, businessName);

              System.out.println("");
              System.out.println("Confirm Booking");
              System.out.println("---------------------------");
              System.out.println("Enter seat number you reserved:");
              String confirmseatNum = input.nextLine();
              System.out.println("Enter you name:");
              String confirmpassengerName = input.nextLine();
              two.confirmReservation(confirmseatNum, confirmpassengerName);

              }
              break;

              case 3:
              System.out.println("Cancel Reservation/Booking");
              System.out.println("---------------------------");
              userInterface.displayFlightTwoDetails();

              System.out.println("Choose which flight you would like to cancel reservation/booking");
              int cancelFlightRB = input.nextInt();
              if (cancelFlightRB == 1){
              System.out.println("Enter seat you would like to cancel");
              String cancelSeat = input.nextLine();
              System.out.println("Enter name under reservation/booking:");
              String cancelPassenger = input.nextLine();
              one.cancelReservation(cancelSeat, cancelPassenger);
              }
              else if (cancelFlightRB == 2){
              System.out.println("Enter seat you would like to cancel");
              String cancelSeat = input.nextLine();
              System.out.println("Enter name under reservation/booking:");
              String cancelPassenger = input.nextLine();
              two.cancelReservation(cancelSeat, cancelPassenger);
              }
              break;

              case 4:
              System.out.println("Flight Details");
              System.out.println("---------------------------");
              userInterface.displayFlightOneDetails();
              userInterface.displayFlightTwoDetails();
              break;
            }//end switch 1
          } while (switch1!=5);
    }
    catch (InputValidationException e) {
      e.printStackTrace();
    }
    }
  }

