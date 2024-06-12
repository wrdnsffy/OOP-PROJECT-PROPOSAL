//by Wan Nur Irdina Binti Wan Hasbullah (24000247) 

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

    public static void main(String[] args) {
        Clients clients = new Clients();

        // Adding clients
        clients.add(new Client("11", "Raheem", "Raheem@gmail.com"));
        clients.add(new Client("21", "dahlia", "dahlia@gmail.com"));

        // Printing all clients
        System.out.println("All Clients: ");
        clients.print();

        // Finding a client
        System.out.println("Find Client with userId 1:");
        Client foundClient = clients.find("1");
        if (foundClient != null) {
            System.out.println(foundClient);
        } else {
            System.out.println("Client not found.");
        }
      
        clients.remove("1");
        System.out.println("All Clients after removing client with userId 1:");
        clients.print();
    }
}
