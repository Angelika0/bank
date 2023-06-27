import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

 abstract class Account{
    protected double balance;
    protected String numerKonta; 
    protected  List<Operation> historyOperations = new ArrayList<Operation>();
  
          public abstract void deposit(double amount);   
            public abstract void withdraw(double amount);
            public abstract double getBalance();
            public abstract String getNumerKonta();
            public abstract void transfertoNormalAccaount(double amount, NormalAccaount account);
            public abstract void transfertoSavingAccaount(double amount, SavingAccaunt account);
            public abstract void printOperationHistorybyAmount(double from, double to);
         
        
            public abstract String toString();
            public abstract void printOperationsHistory(LocalDate from, LocalDate to);
           
            

   
   
    

}
