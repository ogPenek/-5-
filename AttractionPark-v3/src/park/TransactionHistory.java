package park;

import java.time.LocalDate;

public class TransactionHistory extends ParkEntity {
    private double amount;
    private LocalDate date;

    public TransactionHistory(String visitorName, double amount) {
        super(visitorName);
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public static String currency() {
        return "UAH";
    }

    public void refund() {
        System.out.println(getClass().getSimpleName() + ".refund() -> returning " + amount + " " + currency() + " to " + name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Транзакція для " + name + ": " + amount + " " + currency() + " (" + date + ")");
    }

    @Override
    public String toString() {
        return "Transaction{name='" + name + "', amount=" + amount + ", date=" + date + "}";
    }
}
