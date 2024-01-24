package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance=0.0;
    private AccountType accountType;
    private double interestRate;
    private LocalDate dateOpened;
    private double overdraftLimit;
    private List<Transaction> transactions=new ArrayList<>();

    public Account(String accountNumber, String accountHolderName, double balance, AccountType accountType, double interestRate, LocalDate dateOpened, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.dateOpened = dateOpened;
        this.overdraftLimit = overdraftLimit;
    }

    public Account(String accountNumber, String accountHolderName, AccountType accountType, double interestRate, LocalDate dateOpened, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.dateOpened = dateOpened;
        this.overdraftLimit = overdraftLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(LocalDate dateOpened) {
        this.dateOpened = dateOpened;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction){
        this.transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "model.Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                ", interestRate=" + interestRate +
                ", dateOpened=" + dateOpened +
                ", overdraftLimit=" + overdraftLimit +
                ", transactions=" + transactions +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Account o=(Account)obj;
        return o.getAccountNumber().equals(this.accountNumber);
    }
}
