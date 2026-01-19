public class hotel {
    private double RatePerNight = 1200.0;
    private int PerNight;
    private double RatePerHead = 50;
    private String roomType;
    private static int BookingCounter = 0001;
    private int bookingNumber;
    private int pax;
    private String fname;
    private String lname;  
    private double total; 

    public void setFname(String fname){this.fname = fname;}
    public void setLname(String lname){this.lname = lname;}
    public void setPax(int pax){this.pax =pax;}
    public void setPerNight(int PerNight){this.PerNight = PerNight;}
    public void setBookingNum(int bookingNumber){this.bookingNumber = BookingCounter++;}
    public void setTotal(double total){this.total = total;}
    public int getBookingNumber(){return bookingNumber;}
    public int getPerNight(){return PerNight;}
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public int getPax(){return pax;}
    public double getTotal(){return total;}

    public void HotelRatesCaculation() {
        if (PerNight >= 1 && PerNight <=30 * RatePerNight || pax >= 1 && pax <=30 * RatePerHead){} 
        else {
            if (roomType.equalsIgnoreCase("Basic")) {}
            else if (roomType.equalsIgnoreCase("Deluxe")) {RatePerNight += 500;}
            else if (roomType.equalsIgnoreCase("Premium")) {RatePerNight += 1000;}
            double total = RatePerNight + RatePerHead;
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
