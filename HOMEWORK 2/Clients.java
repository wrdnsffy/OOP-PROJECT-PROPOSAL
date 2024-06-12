//by Wan Nur Irdina Binti Wan Hasbullah (24000247) 

import java.util.ArrayList;
import java.util.List;

public class Clients {
    private List<Client> clientList;

    // Constructor to initialize the client list
    public Clients() {
        clientList = new ArrayList<>();
    }

    // Method to add a client to the list
    public void add(Client client) {
        // Add client to the list
        clientList.add(client);
    }

    // Method to remove a client from the list
    public void remove(String userId) {
        // Find client by userId and remove from the list
        Client clientToRemove = find(userId);
        if (clientToRemove != null) {
            clientList.remove(clientToRemove);
        } else {
            System.out.println("Client with user ID " + userId + " is not found.");
        }
    }

    // Method to print all clients
    public void print() {
        // Print all clients in the list
        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    // Method to find a client in the list
    public Client find(String userId) {
        // Find and return client by userId
        for (Client client : clientList) {
            if (client.getUserId().equals(userId)) {
                return client;
            }
        }
        return null; // Return null if client not found
    }

//test code by Wardina Saffiya Binti Jamalulil (24000996) 
    
public static void main(String[] args) {
    Clients clients = new Clients();

    // Adding clients
    clients.add(new Client(new Client.Name("11", "Raheem"), "Raheem@gmail.com", "123456", "1234567890", new Client.Address("123 Jalan Muda", "Ipoh", "Perak", "12345")));
    clients.add(new Client(new Client.Name("21", "Dahlia"), "Dahlia@gmail.com", "123456", "1234567890", new Client.Address("123 Jalan Muda", "Ipoh", "Perak", "12345")));

    // Printing all clients
    System.out.println("All Clients: ");
    clients.print();

    // Finding a client
    System.out.println("\nFind Client with userId 11:");
    Client foundClient = clients.find("11");
    if (foundClient != null) {
        System.out.println(foundClient);
    } 
    else {
        System.out.println("Client not found.");
        }

    // Removing a client
    clients.remove("11");
    System.out.println("\nAll Clients after removing client with userId 11:");
    clients.print();
    }
}
