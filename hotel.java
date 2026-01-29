import java.util.Arrays;
public class hotel {
    private double RatePerNight;
    private int PerNight;
    private double RatePerHead;
    private String roomType;
    private int bookingNumber;
    private int pax;
    private String fname;
    private String lname;  
    private String rooms;
    private double total;

    public void setFname(String fname){this.fname = fname;}
    public void setLname(String lname){this.lname = lname;}
    public void setPax(int pax){this.pax =pax;}
    public void setPerNight(int PerNight){this.PerNight = PerNight;}
    public void setrooms(String rooms){this.rooms = rooms;}
    public void setroomType(String roomType){this.roomType = roomType;}
    public String getroomType(){return roomType;}
    public int getPerNight(){return PerNight;}
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public int getPax(){return pax;}
    public String getrooms(){return rooms;}

    public void ShowRooms() {
        String[] rooms = { "Room 701", "Room 702", "Room 703", "Room 704", "Room 705", "Room 706", "Room 707", "Room 708", "Room 709"};
        for (String room : rooms) {System.out.println(room);}
    }

    public void HotelRatesCaculation() {
        RatePerNight = 1000;
        RatePerHead = 50;

        if(roomType.equalsIgnoreCase("BASIC")){
            RatePerNight += 50;
        } else if (roomType.equalsIgnoreCase("DELUXE")){
            RatePerNight += 500;
            RatePerHead += 50;
        } else if (roomType.equalsIgnoreCase("PREMIUM")){
            RatePerNight += 1000;
            RatePerHead += 50;
        } 

        total = (RatePerNight * PerNight) + (RatePerHead * pax);
    }

    public void displayInfo() {
        System.out.println("Name: " + fname + " " + lname);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room No. " + rooms);
        System.out.println("PAX: " + pax);
        System.out.println("No. of days: " + PerNight);
        System.out.println("Due Amount: " + total);
        
    }
}
