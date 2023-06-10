
import java.util.ArrayList;

public class Bank {
    ArrayList<Client> clients = new ArrayList<Client>();
    

    public  String getListClients(){
        String listClients = "";
        for(Client client : clients){
            listClients += client.toString() + "\n";
        }
        return listClients;
    }

    public void addClinet(Client client){
        clients.add(client);
        
    }
  

  
    public void delate( int cl){
        for(Client client : clients){
            if(client.getId() == cl){
                clients.remove(client);
            }
        }
    }
    


    public void findeClient(int id){
        Client clientf = new Client();
        for(Client client : clients){
            if(client.getId() == id){
                clientf = client;
            }
        }
   


        System.out.println("Szukany klient: "+ clientf);
    }

    @Override
    public String toString() {
        return "Bank: " + " "+
                "clients=  " + clients +
                ' ' ;
            }
}
