import java.util.Scanner;

public class AirlineReservationTest {

    public static void main(String [] args){

        Flight flight = new Flight("TSM366");
        MyLinkedList<Passenger> newList = new MyLinkedList<>();
        //main menu
        System.out.println("\nMENU:");
        System.out.println("1. reserve a ticket");
        System.out.println("2. cancel a reservation");
        System.out.println("3. check whether a ticket is reserved for a particular person");
        System.out.println("4. display the passengers");
        System.out.println("5. check double-bookings");
        System.out.println("6. EXIT");

        Scanner scanner = new Scanner(System.in);

        int choice;
        //do while loop to iterate menu
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Reserve a ticket");
            System.out.println("2. Cancel a reservation");
            System.out.println("3. Check whether a ticket is reserved for a particular person");
            System.out.println("4. Display the passengers");
            System.out.println("5. Check double-bookings");
            System.out.println("6. EXIT");

            choice = scanner.nextInt();
            scanner.nextLine();

            //switch case to display for different options
            switch (choice) {
                case 1:
                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter passenger ID number: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter passenger contact number: ");
                    String contactNumber = scanner.nextLine();

                    //save new passenger
                    Passenger passenger = new Passenger(name, id, contactNumber);
                    flight.reserveTicket(passenger);
                    System.out.println("Ticket reserved successfully");
                    break;
                case 2:
                    System.out.println("Enter passenger ID number for cancelling: ");
                    id = scanner.nextLine();
                    Passenger passengerToCancel = new Passenger("", id, "");
                    if (flight.checkTicket(passengerToCancel)) {
                        flight.cancelTicket(passengerToCancel);
                        System.out.println("Reservation canceled successfully.");
                    } else {
                        System.out.println("No reservation found for the provided ID number.");
                    }
                    break;
                case 3:
                    System.out.println("Enter passenger ID number for checking reservation: ");
                    id = scanner.nextLine();

                    //new instance to check existing passenger
                    Passenger passengerToCheck = new Passenger("", id, "");
                    if (flight.checkTicket(passengerToCheck)) {
                        System.out.println("Reservation found for the provided ID number.");
                    } else {
                        System.out.println("No reservation found for the provided ID number.");
                    }
                    break;
                case 4:
                    newList.displayPassengers();//displays current list members
                    break;
                case 5:
                    boolean hasDoubleBookings = newList.checkDouble();//checking duplicates
                    if (hasDoubleBookings) {
                        System.out.println("Double bookings detected and removed.");
                    } else {
                        System.out.println("No double bookings found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);//while program not terminated

        scanner.close();
    }
}
