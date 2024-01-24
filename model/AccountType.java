package model;

public enum AccountType {
    SAVINGS("Savings model.Account"),
    BASIC_SAVINGS_BANK_DEPOSIT("Basic Savings Bank Deposit model.Account"),
    CURRENT("Current model.Account"),
    SALARY("Salary model.Account"),
    FIXED_DEPOSIT("Fixed Deposit model.Account"),
    RECURRING_DEPOSIT("Recurring Deposit model.Account"),
    NRI("NRI model.Account");

    private final String label;

    AccountType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}