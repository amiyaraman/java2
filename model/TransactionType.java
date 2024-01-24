package model;

public enum TransactionType  {
    DEPOSIT("Deposit"),
    WITHDRAWAL("Withdrawal"),
    TRANSFER("Transfer"),
    FEE("Fee"),
    INTEREST("Interest"),
    PURCHASE("Purchase");

    private final String label;

    TransactionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}