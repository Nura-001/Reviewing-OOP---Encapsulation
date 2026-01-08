// Main class to test Encapsulation

public class Main {
    public static void main(String[] args) {

        // Creating an object of BankAccount
        BankAccount account = new BankAccount("Nurjahan Akter", 5000);

        // Accessing data using public methods only
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money
        account.deposit(2000);

        // Withdrawing money
        account.withdraw(1500);

        // Invalid operations
        account.withdraw(10000);
        account.deposit(-500);
    }
}
