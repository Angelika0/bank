import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class NormalAccaount extends Account {

    private double balance =0.0;
    private String numerKonta; 
    private  List<Operation> historyOperations = new ArrayList<Operation>();
    
    public NormalAccaount(){
        this.balance=0.0;
        this.numerKonta="";
        
    }
    public NormalAccaount(double balance, String numerKonta, Client client){
        this.balance=balance;
        this.numerKonta=numerKonta;
        
    }
    public String getNumerKonta(){
        return numerKonta;
    }

   
   
    
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public String toString(){
        return " KONTO " + " \n "+
                "balance= " + balance +
                ", numerKonta= " + numerKonta;
    }
    
    

    

    
}
