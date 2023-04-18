package day02_workshop;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    // final makes the name input unchangeable
    private final String fullName;
    private String accountNumber;
    private float accountBalance;
    private boolean isClosed;
    private Date accountStartDate;
    private Date accountCloseDate;
    private List<String> transactions;

    public BankAccount(String fullName, String accountNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0f;
        this.accountStartDate = new Date();

        transactions = new ArrayList<>();
    }

    public BankAccount(String fullName, float accountBalance, String accountNumber) {
        this.fullName = fullName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;

        transactions = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Date getAccountStartDate() {
        return accountStartDate;
    }

    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }

    public Date getAccountCloseDate() {
        return accountCloseDate;
    }

    public void setAccountCloseDate(Date accountCloseDate) {
        this.accountCloseDate = accountCloseDate;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "BankAccount [fullName=" + fullName + ", accountNumber=" + accountNumber + ", accountBalance="
                + accountBalance + ", isClosed=" + isClosed + ", accountStartDate=" + accountStartDate
                + ", accountCloseDate=" + accountCloseDate + "]";
    }

    public void deposit(float money) {
        if (isClosed == true) {
            throw new IllegalArgumentException("Account closed or inactive. You cannot put money in a closed account");
            
        } else if (money < 0) {
            throw new IllegalArgumentException("You can't deposit negative dollars are you dumb");

        } else {
            accountBalance += accountBalance + money;
            Date dt = new Date();
            transactions.add("Deposited " + money + " successfully to account " + accountNumber + " on " + dt.toString());
            System.out.println("Deposited " + money + " successfully to account " + accountNumber + ". New Balance = " + accountBalance + "\n");
            if (money > 1000) {
                System.out.println("Wa seh baller sia\n");
            }
        }
    }

    public void withdraw(float money) {
        if (isClosed == true) {
            throw new IllegalArgumentException("Account closed or inactive. You cannot take money from a closed account");

        } else if (accountBalance < money) {
            throw new IllegalArgumentException("Account does not have sufficient balance. Please get a job.");

        } else if (money < 0) {
            throw new IllegalArgumentException("You can't withdraw negative dollars are you dumb");

        } else {
            accountBalance = accountBalance - money;
            Date dt = new Date();
            transactions.add("Withdrawn " + money + " successfully from account " + accountNumber + " on " + dt.toString());
            System.out.println("Withdrawn " + money + " successfully from account " + accountNumber + ". New Balance = " + accountBalance + "\n");
            if (accountBalance < 100.00f) {
                System.out.println("Hope you find a job soon loser\n");
            }

        }

    }

    public void transactionHistory() {
        System.out.println("Transaction history of " + fullName + ":\n");
        for (String payments : transactions) {
            System.out.println(payments + "\n");
        }
    }

}
