public class Seat{
 private int seatStatus; // 0 = available, 1 = reserved, 2 = booked
 private String seatNumber;
 private int seatX;
 private int seatY;
 
 public Seat(){
  setSeatStatus(0);
  setSeatNumber(null);
  setSeatX(0);
  setSeatY(0);
 }
 
 public Seat(int seatStatus, String seatNumber, int seatX, int seatY){
  setSeatStatus(seatStatus);
  setSeatNumber(seatNumber);
  setSeatX(seatX);
  setSeatY(seatY);
 }
  
 public getSeatStatus(){
  return this.seatStatus;
 }
 
 public setSeatStatus(int seatStatus){
  this.seatStatus = seatStatus;
 }
 
 public getSeatNumber(){
  return this.seatNumber;
 }
 
 public setSeatNumber(seatNumber){
  this.seatNumber = seatNumber;
 }

 public getSeatX(){
  return this.seatX;
 }

 public setSeatX(){
  this.seatX = seatX;
 }

 public getSeatY(){
  return this.seatY;
 }
 
 public setSeatY(seatY){
  this.seatY = seatY;
 }


}
