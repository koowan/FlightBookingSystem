import java.util.*;

public class Seat{
	private String seatNumber;
	private float seatPrice;
	int seatX; //row
	int seatY; //column
	SeatStatus seatStatus;
	Passenger passenger = new Passenger();
	
	
	public static void main(String[] args) {
		Seat[][] test = new Seat[4][8];
		
		for (int i = 0; i < 4; i ++) {
			for (int j = 0; j < 8; j ++) {
				test[i][j] = new Seat(i,j);
			}
		}
		
	}

	
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
	
	
	public float getSeatPrice(){
		return this.seatPrice;
	}
	
	
	public void setSeatPrice(float seatPrice){
		this.seatPrice = seatPrice;
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
