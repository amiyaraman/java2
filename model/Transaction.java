package model;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private LocalDateTime dateTime;
    private TransactionType transactionType;
    private double amount;
    private String description;

    public Transaction(String transactionId, LocalDateTime dateTime, TransactionType transactionType, double amount, String description) {
        this.transactionId = transactionId;
        this.dateTime = dateTime;
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "model.Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", dateTime=" + dateTime +
                ", transactionType=" + transactionType +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}