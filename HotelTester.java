import java.util.Scanner;
public class HotelTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hotel hotel = new hotel();
        while (true) {
            System.out.println("1. Book Reservation ");
            System.out.println("2. Show Reservation / Booking ");
            System.out.println("3. Exit ");
            System.out.print("1-2: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("First Name: ");
                hotel.setFname(scanner.nextLine());
                scanner.next();
                System.out.print("Last Name: ");
                hotel.setLname(scanner.nextLine());
                scanner.next();
                System.out.print("# of pax: ");
                hotel.setPax(scanner.nextInt());
                System.out.print("Enter # of nights: ");
                hotel.setPerNight(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Enter Room Type (Basic/Deluxe/Premium");
                hotel.setroomType(scanner.nextLine().toUpperCase());

                System.out.println("Sub-Menu");
                System.out.println("1. Show Available Rooms");
                System.out.println("2. Exit ");
                System.out.print("1-2: ");
                int sub1 = scanner.nextInt();

                if (sub1 == 1) {
                    hotel.ShowRooms();
                    System.out.println("\nSelect Room ");
                    hotel.setroomnum(scanner.nextLine());
                } else {
                    break;
                }
            } else if (choice == 2) {
                hotel.HotelRatesCaculation();
                hotel.displayInfo();

            } else if (choice == 3) {
            } else {
                break;
            }
        }
        System.out.println("hello");
        
        scanner.close();
    }
}