import java.util.*;

public class Flight{
	private String flightNumber;
	private String departName;
	private String arrivalName;
	FlightStatus flightStatus;
	Seat[][] seating = new Seat[4][8];

	public static void main(String[] args) throws InputValidationException {
		Flight test = new Flight();
	}

	public Flight(){
		setFlightNumber(null);
		setDepartName(null);
		setArrivalName(null);
		setFlightStatus(FlightStatus.OPEN);
		generateSeats();
	}
	
	
	public Flight(String flightNumber, String departName, String arrivalName, FlightStatus flightstatus){
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

	public void setFlightStatus(FlightStatus flightStatus){
		this.flightStatus = flightStatus;
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

	/* make reservation
	 * 
	 * 
	 */
	
	/* confirm reservation
	 * 
	 */
	
	/* cancel reservation
	 * 
	 */
	
	public void closeFlight(){
		setFlightStatus(FlightStatus.CLOSED);
	}
	
}
