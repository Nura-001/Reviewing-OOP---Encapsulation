// Demonstration of Encapsulation in Java
// Example: Bank Account System

public class BankAccount {

    // Step 1: Make data members private
    private String accountHolderName;
    private double balance;

    // Step 2: Constructor to initialize account
    public BankAccount(String name, double initialBalance) {
        accountHolderName = name;
        balance = initialBalance;
    }

    // Step 3: Getter method to read balance
    public double getBalance() {
        return balance;
    }

    // Step 4: Setter-like method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Step 5: Controlled withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Step 6: Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}
