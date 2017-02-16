import java.util.*;

public class Flight{
	private String flightNumber;
	private String departName;
	private String arrivalName;
	FlightStatus flightStatus;
	Seat[][] seating = new Seat[4][8];
	private double profit;
	boolean promotion;

	/*public static void main(String[] args) throws InputValidationException {
		Flight test = new Flight("123","idk","idc",FlightStatus.OPEN);
		
		test.makeReservation("3C","willy",false,"challenger","12345678","twitch.tv/notrealwillywin");
		
	}*/

	public Flight(){
		setFlightNumber(null);
		setDepartName(null);
		setArrivalName(null);
		setFlightStatus(FlightStatus.OPEN);
		generateSeats();
		setProfit(0);
		setPromotion(false);
	}
	
	
	public Flight(String flightNumber, String departName, String arrivalName, FlightStatus flightStatus){
		setFlightNumber(flightNumber);
		setDepartName(departName);
		setArrivalName(arrivalName);
		setFlightStatus(flightStatus);
		generateSeats();
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
	
	public FlightStatus getFlightStatus(){
		return this.flightStatus;
	}

	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}
	
	public Seat getSeat(String seatNum){
		int x = convertSeatNumToXCoord(seatNum);
		int y = convertSeatNumToYCoord(seatNum);
		
		return this.seating[x][y];
	}
	
	public double getProfit(){
		return this.profit;
	}
	
	public void setProfit(double profit){
		this.profit = profit;
	}
	
	public boolean getPromotion(){
		return this.promotion;
	}
	
	public void setPromotion(boolean promotion){
		this.promotion = promotion;
	}

	
	public void flightStatusDisplay(){
		if (getFlightStatus() == FlightStatus.OPEN){
			System.out.println("Available for booking");
		} else if (getFlightStatus() == FlightStatus.CHECKING_IN){
			System.out.println("Checking in");
		} else if (getFlightStatus() == FlightStatus.BOARDING){
			System.out.println("Boarding");
		} else if (getFlightStatus() == FlightStatus.CLOSED){
			System.out.println("Closed");
		}
	}

	
	public void generateSeats(){
		// generates 4 row, 8 column grid of seats
		for (int i = 0; i < 4; i ++) {
			for (int j = 0; j < 8; j ++) {
				this.seating[i][j] = new Seat(i,j);
			}
		}
	}

	
	public void makeReservation(String seatNum, String passengerName, boolean resident, String address, String passportNum, String businessName) throws InputValidationException{
		int x = convertSeatNumToXCoord(seatNum);
		int y = convertSeatNumToYCoord(seatNum);
		
		// checks if flight details have been finalized
		if (this.flightNumber == null || this.departName == null || this.arrivalName == null){
			System.out.println("Flight details not finalized; reservation cannot be made.");
			return;
		}
		// checks for flight status
		if (!(this.flightStatus == FlightStatus.OPEN)){
			System.out.println("Flight is not open; reservation cannot be made");
			return;
		}
		// checks if seat is reserved or booked already
		if (!(seating[x][y].getSeatStatus() == SeatStatus.FREE))
			System.out.println("Seat is not open; reservation cannot be made");
		
		Passenger passenger = new Passenger(passengerName, resident, address, passportNum, businessName);
		seating[x][y].setPassenger(passenger);
		seating[x][y].setSeatStatus(SeatStatus.RESERVED);
		this.profit += calcPrice(seating[x][y].getPassenger());
		
		// check if flight is full
		if (checkFlightFull())
			closeFlight();
	}
	
	
	
	/* confirm reservation
	 * 
	 */
	
	/* cancel reservation
	 * 
	 */
	
	public void closeFlight(){
		setFlightStatus(FlightStatus.CLOSED);
	}
	
	private double calcPrice(Passenger passenger){
		// base ticket = 500.00
		double price = 500;
		
		if (!passenger.getBusinessName().equals(null)) // if business name provided, 25% off
			return price *= .75;
		else if (passenger.getResident()) // if passenger is resident, 10% off
			return price *= .90;
		else if (this.promotion) // if promotion is ongoing, 5% off
			return price *= .95;
		
		return price;
	}
	
	
	public boolean checkFlightFull(){
		// if any seat is free, return false
		for (int i = 0; i < 4; i ++) {
			for (int j = 0; j < 8; j ++) {
				if (this.seating[i][j].getSeatStatus() == SeatStatus.FREE) {
					return false;
				}
			}
		}
		// otherwise, flight is full, return true
		return true;
	}
	
	public void viewAvailability(){
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 8; j++){
				if (this.seating[i][j].getSeatStatus() == SeatStatus.FREE){
				  System.out.print(this.seating[i][j].getSeatNumber() + "[A]\t");
				}
				else if (this.seating[i][j].getSeatStatus() == SeatStatus.RESERVED){
					System.out.print(this.seating[i][j].getSeatNumber() + "[R]\t");
				}
				else if (this.seating[i][j].getSeatStatus() == SeatStatus.BOOKED){
					System.out.print(this.seating[i][j].getSeatNumber() + "[B]\t");
				}
			}
			System.out.println("\n");
		}
	}
	
	
	public static int convertSeatNumToXCoord(String seatNum){
		int x = -1;
		x = Character.getNumericValue(seatNum.charAt(0))-1;
		return x;
	}
	
	public static int convertSeatNumToYCoord(String seatNum){
		int y = -1;

		if(seatNum.charAt(1) == 'D')
			y = 0;
		else if(seatNum.charAt(1) == 'C')
			y = 1;
		else if(seatNum.charAt(1) == 'B')
			y = 3;
		else if(seatNum.charAt(1) == 'A')
			y = 4;
		
		return y;
	}
}
