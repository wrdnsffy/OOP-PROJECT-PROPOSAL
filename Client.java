public class Client {
    private String name;
    private String userid;
    private String password;
    private String phoneNumber;
    private String address;

    // Constructor
    public Client(String name, String userid, String password, String phoneNumber, String address) {
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters and setters for each field
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUserid() { return userid; }
    public void setUserid(String userid) { this.userid = userid; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Client{name='" + name + "', userid='" + userid + "', phoneNumber='" + phoneNumber + "', address='" + address + "'}";
    }
}
