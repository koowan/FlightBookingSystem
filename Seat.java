import java.util.*;
public class Seat{
 private String seatNumber;
 private int seatX;
 private char seatY;
 SeatStatus seatStatus;
 Passenger passenger = new Passenger();

 public Seat(int seatX, char seatY, SeatStatus seatStatus, Passenger passenger){
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

 public char getSeatY(){
  return this.seatY;
 }

 public void setSeatY(char seatY){
  this.seatY = seatY;
 }

 public String getSeatNumber(){
  return this.seatNumber;
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
