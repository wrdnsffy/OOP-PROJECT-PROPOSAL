//by Nur Aisya' Sofea Binti Husin (22012332) 

public class Client {
    // Inner class for Name
    public static class Name {
        private String firstName;
        private String lastName;

        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    // Inner class for Address
    public static class Address {
        private String street;
        private String city;
        private String state;
        private String zipCode;

        public Address(String street, String city, String state, String zipCode) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
    }

    private Name name;
    private String userId;
    private String password;
    private String phoneNumber;
    private Address address;

    // Constructor
    public Client(Name name, String userId, String password, String phoneNumber, Address address) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters and setters for userId, password, phoneNumber, and address
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Getter for name
    public Name getName() {
        return name;
    }

    // Setter for name
    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name.getFirstName() + " " + name.getLastName() + '\'' +
                ", userId='" + userId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }
}

//test code by Wardina Saffiya Binti Jamalulil (24000996) 
    
public class Main {
    public static void main(String[] args) {
        // Create a Name object
        Client.Name name = new Client.Name("Nina", "Lily");

        // Create an Address object
        Client.Address address = new Client.Address("123 Jalan Mudah", "Bandar Baru", "Ipoh", "35366");

        // Create a Client object
        Client client = new Client(name, "ninalily", "12345", "123-456-7890", address);

        // Print initial client details
        System.out.println("Initial Client Details:");
        System.out.println(client);

        // Modify client details
        client.setPassword("newpassword456");
        client.setPhoneNumber("098-765-4321");
        client.setAddress(new Client.Address("456 Elm St", "Othertown", "Otherstate", "54321"));

        // Print modified client details
        System.out.println("\nModified Client Details:");
        System.out.println(client);

        // Modify client's name if the getName() method is available
        if (client.getName() != null) {
            client.getName().setFirstName("Jane");
            client.getName().setLastName("Smith");
        }

        // Print client details with modified name if available
        System.out.println("\nClient Details with Modified Name:");
        System.out.println(client);
    }
}
