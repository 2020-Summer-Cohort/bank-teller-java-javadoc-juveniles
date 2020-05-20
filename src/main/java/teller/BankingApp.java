package teller;

public class BankingApp {
    public static void main(String[] args) {

        Bank bank = new Bank ();
        Account account1 = new Account("54899", "Checking", 5487.65);
        Account account2 = new Account ("78457", "Savings", 47894.00);

        bank.openAccount(account1);
        bank.openAccount(account2);

        System.out.println(bank.getAllAccounts());



    }
}
