public class Passenger {
    private String id;
    private String name;
    private String contactNumber;

    public Passenger(){

    }

    public Passenger(String name, String id, String contactNumber){
        setName(name);
        setId(id);
        setContactNumber(contactNumber);
    }

    //mutators
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }


    //accessors
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    private String getContactNumber(){
        return contactNumber;
    }


    /*String for testing the program*/
    @Override
    public String toString(){
        return String.format("ID: %s, Name: %s, Contact Number: %s", getId(), getName(), getContactNumber());
    }
}
