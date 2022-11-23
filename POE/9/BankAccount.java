//Develop a BankAccount class which should contain all methods of Bank i.e. balanceEnquiry(), withdraw() and deposit(). Generate user defined exception LowBalanceException and NegativeNumberException whenever required. Develop application program to use this user defined exception.

import java.util.Scanner;

class LowBalanceException extends Exception
{
    public LowBalanceException(String s)
    {
        super(s);
    }
}

class NegativeNumberException extends Exception
{
    public NegativeNumberException(String s)
    {
        super(s);
    }
}

class Account{
    private int balance;
    public Account(int balance)
    {
        this.balance = balance;
    }
    public void balanceEnquiry()
    {
        System.out.println("Balance: "+balance);
    }
    public void withdraw(int amount) throws LowBalanceException, NegativeNumberException
    {
        if(amount < 0)
            throw new NegativeNumberException("Negative amount cannot be withdrawn");
        if(amount > balance)
            throw new LowBalanceException("Insufficient balance");
        balance -= amount;
    }
    public void deposit(int amount) throws NegativeNumberException
    {
        if(amount < 0)
            throw new NegativeNumberException("Negative amount cannot be deposited");
        balance += amount;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account(1000);
        while(true)
        {
            System.out.print("1. Balance Enquiry\n2. Deposit\n3. Withdraw\n4. Exit\nChoose Option : ");
            int option = sc.nextInt();
            switch(option)
            {
                case 1:
                    a.balanceEnquiry();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ");
                    int amount = sc.nextInt();
                    try{
                        a.deposit(amount);
                    }
                    catch(NegativeNumberException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw : ");
                    amount = sc.nextInt();
                    try{
                        a.withdraw(amount);
                    }
                    catch(LowBalanceException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    catch(NegativeNumberException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using our service !\nExitting...");
                    System.exit(0);
            }
        }

    }
}