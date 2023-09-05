public class Passenger {
    private long id;
    private boolean gender;
    private String name;
    private String surname;
    private String contactNumber;
    private int flightNumber;
    private int seatNumber;

    public Passenger(long id, boolean gender, String name, String surname, String contactNumber){
        setId(id);
        setGender(gender);
        setName(name);
        setSurname(surname);
        setContactNumber(contactNumber);
    }

    public void setId(long id){
        this.id = id;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public long getId(){
        return id;
    }
    public boolean getGender(){
        return gender;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    private String getContactNumber(){
        return contactNumber;
    }

    public String toString(){
        return String.format("%-13d, %b, %s, %s", getId(), getGender(), getName(), getSurname(), getContactNumber());
    }
}
