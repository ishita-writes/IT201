import java.util.Scanner;
interface Bank {
    String BANK_NAME = "HDFC Bank";
    void transaction(double amount, int option);
    void displayBalance();
}

class Customer {
    protected String name;
    protected String CustomerID;
    public Customer(String name, String CustomerID)
    {
        this.name = name;
        this.CustomerID = CustomerID;
    }

    public void displayProfile(){
        System.out.println("Customer Name : "+name);
        System.out.println("Customer ID : "+CustomerID);
    }
}

class Account extends Customer implements Bank
{
    protected long AccNo;
    protected double balance;
    public Account(String name, String CustomerID, long AccNo, double balance)
    {
        super(name, CustomerID);
        this.AccNo = AccNo;
        this.balance = balance;
    }

    @Override
    public void transaction(double amount, int option){
        if (option == 1) {
            balance += amount;
            System.out.println("Amount deposited : "+amount);
        }
        else if (option == 2) {
            if (balance <= amount){
                balance -= amount;
                System.out.println("Withdrawn Rs."+amount);
            }
            else
                System.out.println("Insufficient Funds");
        }
    }

    @Override
    public void displayBalance()
    {
        System.out.println("---Account Summary---");
        displayProfile();
        System.out.println("Account Number : "+AccNo);
        System.out.println("Account Balance : "+balance);
        System.out.println("------------");
    }
}

public class BankInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myAcc = new Account("Jensen Winchester", "CUST2006", 543256743, 34500.50);
        int option;
        do {
            System.out.println("1. View Account Information 2. Deposit 3. Withdraw 4. Exit");
            System.out.println("Enter the choice : ");
            option = sc.nextInt();
            switch(option)
            {
                case 1: myAcc.displayBalance();
                break;
                case 2: System.out.println("Enter amount : ");
                myAcc.transaction(sc.nextDouble(), 1);
                break;
                case 3: System.out.println("Enter amount : ");
                myAcc.transaction(sc.nextDouble(), 2);
                break;
                case 4: System.out.println("Leaving System");
                break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (option != 4);
        sc.close();
    }
}
