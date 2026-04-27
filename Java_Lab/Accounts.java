import java.util.Scanner;

abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName, address;

    Accounts(int accNum, String name, String addr, double bal) {
        this.accountNumber = accNum;
        this.accountHoldersName = name;
        this.address = addr;
        this.balance = bal;
    }

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("\nAccount: " + accountNumber + " | Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int accNum, String name, String addr, double bal, double rate) {
        super(accNum, name, addr, bal);
        this.rateOfInterest = rate;
    }

    void withdrawal(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds.");
    }

    void deposit(double amount) {
        balance += amount;
    }

    void calculateAmount() {
        balance += (balance * rateOfInterest) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Acc No, Name, Address, Balance, Rate: ");
        SavingsAccount sa = new SavingsAccount(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());

        System.out.print("Deposit amount: ");
        sa.deposit(sc.nextDouble());
        System.out.print("Withdraw amount: ");
        sa.withdrawal(sc.nextDouble());
        sa.calculateAmount();
        sa.display();
        sc.close();
    }
}
