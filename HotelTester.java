import java.util.Scanner;

public class HotelTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hotel hotel = new hotel();
        while (true) {
            System.out.println("1.  Book Reservation");
            System.out.print("1-2: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("First Name: ");
                hotel.setFname(scanner.nextLine());
                scanner.next();
                System.out.print("Last Name: ");
                hotel.setFname(scanner.nextLine());
                scanner.next();
                System.out.print("# of pax: ");
                hotel.setPax(scanner.nextInt());

                System.out.print("Enter # of nights: ");
                hotel.setPerNight(scanner.nextInt());

                System.out.println("Sub-Menu");
                System.out.println("1. Show Available Rooms");
                System.out.println("2. Exit ");
                System.out.print("1-2: ");
                int sub1 = scanner.nextInt();

                if (sub1 == 1) {

                }


            } else if (choice == 2) {

            } else if (choice == 3) {
            } else {
                break;
            }
        }
        
        scanner.close();
    }
}