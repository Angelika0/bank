import java.util.ArrayList;
import java.util.List;
public class Bank {
    ArrayList<Client> clients = new ArrayList<Client>();

    public void add(Client client){
        clients.add(client);
    }

    @Override
    public String toString() {
        return "Bank:  " + " \' "+
                "clients=  " + clients +
                '}';
    }
    public void delate( int cl){
        for(Client client : clients){
            if(client.getId() == cl){
                clients.remove(client);
            }
        }
    }
    public String finde(int id){
        Client clientf = new Client();
        for(Client client : clients){
            if(client.getId() == id){
                clientf = client;
            }
        }
        return "SZUKANY KLIJENT: " + clientf;
    }
}
