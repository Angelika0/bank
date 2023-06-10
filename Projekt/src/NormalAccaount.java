import java.util.ArrayList;


public class NormalAccaount extends Account {

    private double balance =0.0;
    private String numerKonta;    
    
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
        return "NormalAccaount: " + " \' "+
                "balance= " + balance +
                ", numerKonta= " + numerKonta;
    }
    
    

    

    
}
