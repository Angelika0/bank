import java.time.LocalDate;
public class Operation {
    private double amount;
    private LocalDate date;
    public Operation(double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public LocalDate getDate() {
        return date;
    }
    @Override
    public String toString() {
        String operationType = amount > 0 ? "Wpłata" : "wypłata";
        return operationType + "  \n" + amount + ", date=" + date + ' ';
    }
       
            







}
