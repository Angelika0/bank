
import java.util.ArrayList;

import java.util.Iterator;





public class Bank  {
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
        System.out.println("Dodano klienta: " + client.getName() + " " + client.getSurname() + "  ID NOWEGO KLIJENTA:" + client.getId());
        
    }
  

  
    public void delate( int cl){
       Iterator<Client> iterator = clients.iterator();
         while(iterator.hasNext()){
              Client client = iterator.next();
              if(client.getId() == cl){
                iterator.remove();
              }
              else{
                  System.out.println("Nie ma takiego klienta");
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
    StringBuilder sb = new StringBuilder();

    for (Client client : clients) {
        sb.append(client.toString()).append("  ");
    }
    sb.setLength(sb.length() - 2); // Jeśli chcesz usunąć ostatni przecinek i spację

    return sb.toString();
}
}
