package day02_workshop;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class FixedDepositAccount extends BankAccount {

    private float interest;
    private int durationInMonths;

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public FixedDepositAccount(String fullName, String accountNumber, float accountBalance, int durationInMonths, float interest) {
        super(fullName, accountBalance, accountNumber);
        this.durationInMonths = durationInMonths;
        this.interest = interest;
    }

    public FixedDepositAccount(String fullName, String accountNumber, float accountBalance, int durationInMonths) {
        super(fullName, accountBalance, accountNumber);
        this.durationInMonths = durationInMonths;
    }

    public FixedDepositAccount(String fullName, String accountNumber) {
        super(fullName, accountNumber);
    }

    //use override to make child class and parent class act different with the same functions
    @Override
    public void withdraw(float money){
        System.out.println("You can't do that.");
    }

    @Override
    public void deposit(float money){
        System.out.println("You can't do that.");
    }

    //calling on parent class' super method in function use super.(thing)
    public float getBalance(String accountName) {
        return super.getAccountBalance() * (100 + interest);
    }


    
    
}
