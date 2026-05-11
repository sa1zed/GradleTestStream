package Task4;

public class Transaction {
    String id;
    int amount;
    String status;

    public Transaction(String id, int amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
