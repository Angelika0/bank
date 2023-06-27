import java.time.LocalDate;

 abstract class Account{
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
