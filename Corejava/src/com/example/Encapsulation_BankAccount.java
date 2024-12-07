package com.example;

public class Encapsulation_BankAccount {
	
	    // Private fields (data hiding)
	    private String accountNumber;
	    private String accountHolderName;
	    private double balance;

	    
	    // Constructor
	    public Encapsulation_BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative.");
	            this.balance = 0;
	        }
	    }

	    // Getter for accountNumber
	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    // Getter for accountHolderName
	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    // Getter for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	

	// Main class to demonstrate encapsulation
	    public static void main(String[] args) {
	        // Creating a BankAccount object
	    	Encapsulation_BankAccount account = new Encapsulation_BankAccount("123456", "Rutuja Tambade", 1000.0);

	        // Accessing data through public methods
	        System.out.println("Account Holder: " + account.getAccountHolderName());
	        System.out.println("Balance: " + account.getBalance());

	        // Depositing and withdrawing money
	        account.deposit(500.0);
	        account.withdraw(200.0);

	        // Printing updated balance
	        System.out.println("Updated Balance: " + account.getBalance());
	    }
	}
