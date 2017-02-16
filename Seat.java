import java.util.*;

public class Seat{
	private String seatNumber;
	int seatX; //row
	int seatY; //column
	SeatStatus seatStatus;
	Passenger passenger;
	
	
	public Seat(){
		this.seatNumber = "1A";
		convertSeatNumToCoords();
		this.seatStatus = null;
		this.passenger = null;
	}
	
	public Seat(String seatNumber){
		this.seatNumber = seatNumber;
		convertSeatNumToCoords();
		this.seatStatus = SeatStatus.FREE;
		this.passenger = null;
	}

	public Seat(int seatX, int seatY){
		this.seatX = seatX;
		this.seatY = seatY;
		convertCoordsToSeatNum();
		this.seatStatus = SeatStatus.FREE;
		this.passenger = null;
	}
	
	public Passenger getPassenger(){
		return this.passenger;
	}
	
	public void setPassenger(Passenger passenger){
		this.passenger = passenger;
	}
	
	public SeatStatus getSeatStatus(){
		return this.seatStatus;
	}
	
	public void setSeatStatus(SeatStatus status){
		this.seatStatus = status;
	}
	
	public int getSeatX(){
		return this.seatX;
	}
	
	public void setSeatX(int seatX){
		this.seatX = seatX;
	}
	
	public int getSeatY(){
		return this.seatY;
	}
	
	public void setSeatY(int seatY){
		this.seatY = seatY;
	}
	
	public String getSeatNumber(){
		return this.seatNumber;
	}
	
	public void setSeatNumber(String seatNumber){
		this.seatNumber = seatNumber;
	}
	
	
	public void convertSeatNumToCoords(){
		setSeatX(Character.getNumericValue(this.seatNumber.charAt(0))-1);

		if(this.seatNumber.charAt(1) == 'D')
			setSeatY(0);
		else if(this.seatNumber.charAt(1) == 'C')
			setSeatY(1);
		else if(this.seatNumber.charAt(1) == 'B')
			setSeatY(2);
		else if(this.seatNumber.charAt(1) == 'A')
			setSeatY(3);
	}
 
	
	private void convertCoordsToSeatNum() {
		String yCoord = "";
		
		if(this.seatX == 0)
			yCoord = "D";
		else if(this.seatX == 1)
			yCoord = "C";
		else if(this.seatX == 2)
			yCoord = "B";
		else if(this.seatX == 3)
			yCoord = "A";
		
		setSeatNumber((this.seatY+1) + yCoord);
	}


}
