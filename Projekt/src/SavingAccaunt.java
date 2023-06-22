public class SavingAccaunt {
    private double balance =0.0;
    private String numerKonta;
    
    final private double interest = 0.05;
    public SavingAccaunt(){
        this.balance=0.0;
        this.numerKonta="";
        
        
    }
    public SavingAccaunt(double balance, String numerKonta, Client client ){
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
    public void addInterest(){
        balance += balance * interest;
    }
    public String toString(){
        return "SavingAccaount: " + " \' "+
                "balance= " + balance +
                ", numerKonta= " + numerKonta +
                ", client= "  +
                ", interest= " + interest +"\n";  }


}
