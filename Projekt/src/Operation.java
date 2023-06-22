public class Operation {
    private String operation;
    private double amount;
    private double balance;
    private String date;
    private String time;
    
    public Operation(String operation, double amount, double balance, String date, String time){
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
        this.date = date;
        this.time = time;
    }
    
    public String getOperation(){
        return operation;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getTime(){
        return time;
    }
    
    public String toString(){
        return "Operation: " + operation + " " + amount + " " + balance + " " + date + " " + time;
    }
   
   
   



    
}
