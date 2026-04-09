class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accNo, double initialBalance) {
        this.accountHolder = name;
        this.accountNumber = accNo;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Practical4 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("John Doe", 12345, 1000.0);

        acc.displayBalance();

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);

        acc.displayBalance();
    }
}
