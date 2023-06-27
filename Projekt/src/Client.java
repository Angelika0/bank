import java.util.List;
import java.util.ArrayList;

import java.util.Iterator;



public class Client {
    private String name;
    private String surname;
    private int Id;
    private List<Account> accaounts = new ArrayList<Account>();
    

    public Client(){
        this.name="unknown";
        this.surname="unknow";
        this.Id= 00000;

    }
    public Client(String name, String surname, int Id){
        this.name=name;
        this.surname=surname;
        this.Id= Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public void addNormalAccaount(NormalAccaount normalAccaount){
       accaounts.add(normalAccaount);
        System.out.println("Dodano konto" +" o numerze: "+ normalAccaount.getNumerKonta() + "  do klienta: " + name + " " + surname);
    }
    
  public void deleteNormalAccount(String numerKonta) {
    Iterator<Account> iterator = accaounts.iterator();
    while (iterator.hasNext()) {
        Account account = iterator.next();
        if (account instanceof NormalAccaount) {
            NormalAccaount normalAccaount = (NormalAccaount) account;
            if (numerKonta.equals(normalAccaount.getNumerKonta())) {
                iterator.remove();
            }
        }
    }
}
  
    public void addSavingAccaount(SavingAccaunt savingAccaunt){
        accaounts.add(savingAccaunt);
    }
    public void delateSavingAccaount(SavingAccaunt savingAccaunt){
        accaounts.remove(savingAccaunt);
    }
  
   public NormalAccaount findeNormalAccaount(String numerKonta){
        NormalAccaount normalAccaountf = new NormalAccaount();
           
        for(Account account: accaounts){
            if(account instanceof NormalAccaount){
            if( numerKonta.equals(account.getNumerKonta())){
                normalAccaountf = (NormalAccaount)account;
               
            }
        }
        }
        
        return normalAccaountf;
    }
    public SavingAccaunt findeSavingAccaount(String numerKonta){
        SavingAccaunt savingAccaountf = new SavingAccaunt();
           
        for(Account account: accaounts){
            if(account instanceof SavingAccaunt){
            if( numerKonta.equals(account.getNumerKonta())){
                savingAccaountf = (SavingAccaunt)account;
               
            }
        }
        }
        
        return savingAccaountf;
    }


    @Override
    public String toString() {
        return  "\n" + name + " " + surname + '\n' +
                "Id: " + Id + "\n"+
                ' ';
    }
    
public String toString2() {
    StringBuilder sb = new StringBuilder();
    sb.append("\n")
      .append(name)
      .append(" ")
      .append(surname)
      .append(" ")
      .append("\n")
      .append("Id: ")
      .append(Id)
      .append(" \n")
      .append("Rodzaj konta:\n");

    // Wypisanie kont normalnych
    for (Account accaount : accaounts) {
        if(accaount instanceof NormalAccaount){
        sb.append("   ")
          .append(accaount.toString())
          .append("\n");
        }
    }

    // Wypisanie kont oszczędnościowych
    for (Account account : accaounts) {
        if(account instanceof SavingAccaunt){
        sb.append("   ")
          .append(account.toString())
          .append("\n");
        }
    }

    return sb.toString();
}
}





