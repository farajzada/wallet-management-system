public class Transaction {
    private String transactionType;
    private int id;
    private int amount;
    private String date;
    private String sourceId;
    private String destinationId;

    public Transaction(String transactionType, int id, int amount, String date, String sourceId, String destinationId) {
        this.transactionType = transactionType;
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.sourceId = sourceId;
        this.destinationId = destinationId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getDestinationId() {
        return destinationId;
    }


}
