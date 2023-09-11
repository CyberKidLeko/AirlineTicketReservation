public class Flight {
    private String flightNumber;
    private MyLinkedList<Passenger> passengers;

    public Flight(){

    }

    public Flight(String flightNumber){
        setFlightNumber(flightNumber);
        this.passengers = new MyLinkedList<>();
    }
    //mutator
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    //accessor
    public String getFlightNumber() {
        return flightNumber;
    }


    public void reserveTicket(Passenger passenger) {
        passengers.append(passenger);//adds passenger to list
    }

    public void cancelTicket(Passenger passenger) {
        passengers.delete(passenger);//removes passenger from list
    }

    public boolean checkTicket(Passenger passenger) {
        return passengers.contains(passenger);// see if list contains certain value
    }




    //testing toString
    public String toString(){
        return String.format("%s", getFlightNumber());
    }
}
