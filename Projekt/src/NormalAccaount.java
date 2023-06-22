import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class NormalAccaount extends Account {

    private double balance =0.0;
    private String numerKonta; 
    private  List<Operation> historyOperations = new ArrayList<Operation>();
    
    public NormalAccaount(){
        this.balance=0.0;
        this.numerKonta=" ";
        
    }
    public NormalAccaount(double balance, String numerKonta, Client client){
        this.balance=balance;
        this.numerKonta=numerKonta;
        this.historyOperations = new ArrayList<Operation>();
        
    }
    public String getNumerKonta(){
        return numerKonta;
    }

   
   
    
    public void deposit(double amount){
        balance += amount;
        historyOperations.add(new Operation(amount, LocalDate.now()));

    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            historyOperations.add(new Operation(-amount, LocalDate.now()));
        }
        else {
            System.out.println("Brak środków na koncie");
        }
    }
    public void transfertoNormalAccaount(double amount, NormalAccaount account){
        if(balance >= amount){
            balance -= amount;
            account.deposit(amount);
            historyOperations.add(new Operation(-amount, LocalDate.now()));
        }
        else {
            System.out.println("Brak środków na koncie");
        }
    }
    public void transfertoSavingAccaount(double amount, SavingAccaunt account){
        if(balance >= amount){
            balance -= amount;
            account.deposit(amount);
            historyOperations.add(new Operation(-amount, LocalDate.now()));
        }
        else {
            System.out.println("Brak środków na koncie");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void printOperationHistorybyAmount(double from, double to){
        System.out.println("Historia operacji: ");
        for(Operation operation : historyOperations){
            if(Math.abs(operation.getAmount()) >= from && Math.abs(operation.getAmount()) <= to){
                System.out.println(operation);
            }
        }
    }
   
    public void printOperationsHistory(LocalDate from, LocalDate to){
        System.out.println("Historia operacji: ");
        for(Operation operation : historyOperations){
            if(operation.getDate().isAfter(from) && operation.getDate().isBefore(to)){
                System.out.println(operation);
            }
        }
    }
  
 
  
      
    @Override
    public String toString(){
        return " KONTO OSOBISTE " + " \n "+
                "Dostępne środki: " + balance + 
                " Numer Konta= " + numerKonta;
    }
    
    

    

    
}
