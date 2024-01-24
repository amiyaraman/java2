import model.Account;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private List<Account> accounts;

    public UserAccount() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}