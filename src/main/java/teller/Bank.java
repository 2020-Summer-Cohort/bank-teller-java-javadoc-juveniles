package teller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<String, Account> accounts = new HashMap<>();

    public Collection<Account> getAllAccounts() {
        Collection<Account> allAccounts = accounts.values();
        return allAccounts;
    }

    public void openAccount(Account anotherAccount) {
        accounts.put(anotherAccount.getAccountNumber(), anotherAccount);

    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);


    }
    public void closeAccount(String accountNumber) {
       accounts.remove(accountNumber);
    }

}
