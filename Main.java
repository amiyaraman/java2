import model.Account;
import model.AccountType;
import model.Transaction;
import model.TransactionType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount();

        Account amiyaAccount = new Account("12345","Amiya" , AccountType.SAVINGS,2.17, LocalDate.now(),20000);

        Account raviAccount = new Account("22345","Ravi" , AccountType.CURRENT,5.17, LocalDate.now(),60000);


        Transaction amiyaTransaction = new Transaction("1", LocalDateTime.now(), TransactionType.DEPOSIT,10000,"Added 10000rs to my account");
        Transaction raviTransaction = new Transaction("2", LocalDateTime.now(),TransactionType.DEPOSIT,20000,"Added 10000rs to my account");
        amiyaAccount.addTransaction(amiyaTransaction);
        raviAccount.addTransaction(raviTransaction);
        userAccount.addAccount(amiyaAccount);
        userAccount.addAccount(raviAccount);
        List<Account> userAccounts = userAccount.getAccounts();
        for (Account account : userAccounts) {
            System.out.println(account);
        }
    }
}