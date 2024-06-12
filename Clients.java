//by Wardina Saffiya Binti Jamalulil 24000996

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
        // Add client
        clientList.add(client);
    }

    // Method to remove a client from the list
    public void remove(String userid) {
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
    public Client find(String userid) {
        // Find and return client by userId
        for (Client client : clientList) {
            if (client.getUserId().equals(userId)) {
                return client;
            }
        }
        return null; // Return null if client not found
    }
}
