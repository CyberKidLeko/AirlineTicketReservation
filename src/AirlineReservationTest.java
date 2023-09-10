import java.util.Scanner;

public class AirlineReservationTest {

    public static void main(String [] args){
        System.out.println("1. reserve a ticket");
        System.out.println("2. cancel a reservation");
        System.out.println("3. check whether a ticket is reserved for a particular person");
        System.out.println("4. display the passengers");
        System.out.println("5. check double-bookings");
        System.out.println("6. EXIT");

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        switch (k){
            case 1:
                System.out.println("Enter customer name: ");
                String name = scanner.nextLine();
                System.out.println("Enter ID number: ");
                Long id = scanner.nextLong();
                System.out.println("Enter contact number: ");
                String contactNumber = scanner.nextLine();
                System.out.println("Ticket reserved successfully");
                break;
            case 2:
                System.out.println("Enter customer name: ");
                name = scanner.nextLine();
                System.out.println("Enter ID number: ");
                id = scanner.nextLong();
                System.out.println("Enter contact number: ");
                contactNumber = scanner.nextLine();
                System.out.println("Ticket cancelled successfully");
                break;
            case 3:
                System.out.println("Enter customer name: ");
                name = scanner.nextLine();
                System.out.println("Enter ID number: ");
                id = scanner.nextLong();
                System.out.println("Enter contact number: ");
                contactNumber = scanner.nextLine();
                System.out.println("Ticket cancelled successfully");
                break;

            case 4:
                System.out.println("Enter customer name: ");
                name = scanner.nextLine();
                System.out.println("Enter ID number: ");
                id = scanner.nextLong();
                System.out.println("Enter contact number: ");
                contactNumber = scanner.nextLine();
                System.out.println("Ticket cancelled successfully");
                break;
            case 5:

        }




    }
}
