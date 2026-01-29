import java.util.Arrays;
public class hotel {
    private double RatePerNight;
    private int PerNight;
    private double RatePerHead;
    private String roomType;
    private static int BookingCounter = 0001;
    private int bookingNumber;
    private int pax;
    private String fname;
    private String lname;  
    private double total; 
    private String roomnum;

    public void setFname(String fname){this.fname = fname;}
    public void setLname(String lname){this.lname = lname;}
    public void setPax(int pax){this.pax =pax;}
    public void setPerNight(int PerNight){this.PerNight = PerNight;}
    public void setBookingNum(int bookingNumber){this.bookingNumber = BookingCounter++;}
    public void setTotal(double total){this.total = total;}
    public void setroomnum(String roomnum){this.roomnum = roomnum;}
    public int getBookingNumber(){return bookingNumber;}
    public int getPerNight(){return PerNight;}
    public String getroomnum(){return roomnum;}
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public int getPax(){return pax;}
    public double getTotal(){return total;}

    public void ShowRooms() {
        String[] roomnum = {"701", "702",};
        for (String room : roomnum) {
            System.out.println(room);
        }
    }

    public void HotelRatesCaculation() {
        if (roomType.equalsIgnoreCase("Basic")){
            RatePerNight +=1000;
            RatePerHead += 50;
        } else if (roomType.equalsIgnoreCase("Deluxe")){
            RatePerNight += 2000;
            RatePerHead += 50;
        } else if (roomType.equalsIgnoreCase("Premium")){
            RatePerNight += 3000;
            RatePerHead += 50;
        }
    }

    public void displayInfo() {
        System.out.println("Booking Number: " + bookingNumber);
        System.out.println("Name: " + fname + " " + lname);
        System.out.println("Room Type: " + roomType);
        System.out.println("PAX: " + pax);
        System.out.println("No. of days: " + PerNight);
        System.out.println("Amount Due: " + total);
        
    }


}
