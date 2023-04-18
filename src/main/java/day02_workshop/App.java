package day02_workshop;

import java.util.Random;
import java.util.UUID;

public class App 
{
    public static void main( String[] args )
    {
        BankAccount makeItRain = new BankAccount("Daddy McRich",  "69696969");
        makeItRain.deposit(3000.69f);
        makeItRain.withdraw(3000f);
        makeItRain.transactionHistory();

        BankAccount imSoPoor = new BankAccount("Daddy McRich",  "32948230");
        imSoPoor.setClosed(true);

        int n = 7;
        BankAccount [] accounts = new BankAccount [n];

        for (int i = 1; i < accounts.length; i++) {
            String uuid = UUID.randomUUID().toString();

            float min = 1234f;
            float max = 9867543f;

            Random randomnum = new Random();
            float initialBalance = min + randomnum.nextFloat();

            accounts [i] = new BankAccount("Sucker " + String.valueOf(i), initialBalance, uuid);

        }

        
    }
}
