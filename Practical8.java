class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + balance);
        } else if (amount <= 0) {
            throw new InsufficientBalanceException("Invalid withdrawal amount");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Practical8 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);

        acc.displayBalance();

        try {
            acc.withdraw(500);
            acc.withdraw(700);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        acc.displayBalance();
    }
}
