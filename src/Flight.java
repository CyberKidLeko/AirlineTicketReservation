public class Flight {
    private int flightNumber;
    private MyLinkedList<Passenger> passengers;

    public Flight(){

    }

    public Flight(int flightNumber){
        setFlightNumber(flightNumber);
        this.passengers = new MyLinkedList<>();
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }


    public int getFlightNumber() {
        return flightNumber;
    }


    public void reserveTicket(String name, long id, String contactNumber){
        Passenger passenger = new Passenger(name, id, contactNumber);
        passengers.append(passenger);

    }

    public void cancelTicket(){

    }

    public void checkTicket(){

    }

    public void displayPassengers(){

    }

    public String toString(){
        return String.format("%d, %d", getFlightNumber());
    }
}
