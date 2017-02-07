public class Seat{
 private int seatStatus; // 0 = available, 1 = reserved, 2 = booked
 private String seatNumber;
 private int seatX;
 private int seatY;
 
 public Seat(){
  setSeatStatus(0);
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








}
