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

 public int getSeatStatus(){
  return this.seatStatus;
 }

 public void setSeatStatus(int seatStatus){
  this.seatStatus = seatStatus;
 }

 public String getSeatNumber(){
  return this.seatNumber;
 }

 public void setSeatNumber(String seatNumber){
  this.seatNumber = seatNumber;
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

 public void convertSeatNum(){
  seatNumber = this.seatNumber;

  setSeatX(Integer.parseInt(seatNum.charAt(0)));

    if(seatNum.charAt(1) == "D"){
    setSeatY(0);
    }
    else if(seatNum.charAt(1) == "C"){
    setSeatY(1);
    }
    else if(seatNum.charAt(1) == "B"){
    setSeatY(2);
    }
    else if(seatNum.charAt(1) == "A"){
    setSeatY(3);
    }
  }
 }
