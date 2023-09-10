public class Passenger {
    private long id;
    private String name;
    private String contactNumber;

    public Passenger(){

    }

    public Passenger(String name, long id, String contactNumber){
        setId(id);
        setName(name);
        setContactNumber(contactNumber);
    }

    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    private String getContactNumber(){
        return contactNumber;
    }

    public String toString(){
        return String.format("%-13d, %s, %s", getId(), getName(), getContactNumber());
    }
}
