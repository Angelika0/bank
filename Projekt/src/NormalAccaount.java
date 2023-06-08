public class NormalAccaount extends Account {
    private double balance= 0.0;
    private String accountNumber;
    private String accountType;
    public NormalAccaount(String accountNumber, String accountType){
        this.accountNumber = accountNumber;
        this.accountType = accountType; 
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
    @Override
    public String toString() {
        return "NormalAccaount{" +
                "balance=" + balance +
                '}';
    }
    
}
