import java.time.LocalDate;
public class Operation {
    private double amount;
    private LocalDate date;
    private String operationType;
    
    public Operation(double amount, String operationType, LocalDate date) {
        this.amount = amount;
        this.date = date;
        this.operationType = operationType;
    }
    public double getAmount() {
        return amount;
    }
    public LocalDate getDate() {
        return date;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(operationType);
        builder.append(" \n");
        builder.append(amount);
        builder.append("\n ");
        builder.append(date);
        return builder.toString();
    }
       
            







}
