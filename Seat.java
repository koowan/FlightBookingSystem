import java.util.*;
public class Seat{
 private String seatNumber;
 private int seatX; //row
 private int seatY; //column
 SeatStatus seatStatus;
 Passenger passenger = new Passenger();

 public Seat(int seatX, int seatY, SeatStatus seatStatus, Passenger passenger){
   this.seatX = seatX;
   this.seatY = seatY;
   this.seatStatus = seatStatus;
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

public void makeReservation(){


}

public void convertSeatNum(){
  seatNumber = this.seatNumber;

  setSeatX(Character.getNumericValue(seatNumber.charAt(0)));

      if(seatNumber.charAt(1) == 'D'){
      setSeatY(0);
      }
      else if(seatNumber.charAt(1) == 'C'){
      setSeatY(1);
      }
      else if(seatNumber.charAt(1) == 'B'){
      setSeatY(2);
      }
      else if(seatNumber.charAt(1) == 'A'){
      setSeatY(3);
      }
   }


 }
