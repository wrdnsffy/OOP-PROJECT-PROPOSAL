//by Nur Aisya' Sofea Binti Husin (22012332) 

public class Client {
    private Name name;
    private String userid;
    private String password;
    private String phoneNumber;
    private Address address;

    // Constructor
    public Client(Name name, String userid, String password, String phoneNumber, Address address) {
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter and Setter for name
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    // Getter and Setter for userid
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for address
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{name='" + name.getFirstName() + " " + name.getLastName() + "', userid='" + userid + "', phoneNumber='" + phoneNumber + "', address='" + address + "'}";
    }
}
