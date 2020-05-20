package teller;

public class Account {
    private String accountNumber;



    private String accountType;
    private double accountBalance;

    public Account(String accountNumber, String accountType, double accountBalance){

        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;


    }

    public void deposit (double depositValue){
        accountBalance += depositValue;
    }

    public void withdrawal (double withdrawalValue){
        accountBalance-= withdrawalValue;
    }

    public void checkAccountBalance (){
        System.out.println("Your account balance is $" + accountBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }


}
