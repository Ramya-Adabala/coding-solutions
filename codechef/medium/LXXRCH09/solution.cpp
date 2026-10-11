class BankAccount {
    int balance;

    // Constructor: initializes balance and displays creation message
    BankAccount() {
        balance = 0;  // default balance
        System.out.println("Bank account created.");
    }

    // Method: displays the current account balance
    void showBalance() {
        System.out.println("Current balance is " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount object (constructor is called)
        BankAccount account1 = new BankAccount();
        
        // Manually calling the method using the object reference
        account1.showBalance();
    }
}