import java.util.Scanner;
abstract class Asset {
    String descriptor, date;
    double currentValue;
    Asset(String desc, String d, double val) {
        this.descriptor = desc;
        this.date = d;
        this.currentValue = val;
    }
abstract void displayDetails();
}
class Stock extends Asset {
    int numShares;
    double sharePrice;
    String asset;
  Stock(String desc, String d, double val, int n, double p, String a) {
        super(desc, d, val); this.numShares = n; this.sharePrice = p; this.asset = a;
    }
    void displayDetails() {
        System.out.println("\n--- Stock Asset ---");
        System.out.println("Desc: " + descriptor + " | Date: " + date + " | Value: " + currentValue);
        System.out.println("Shares: " + numShares + " | Price: " + sharePrice + " | Asset: " + asset);
    }
}
class Bond extends Asset {
    double interestRate;
    String asset;
    Bond(String desc, String d, double val, double rate, String a) {
        super(desc, d, val); this.interestRate = rate; this.asset = a;
    }
    void displayDetails() {
        System.out.println("\n--- Bond Asset ---");
        System.out.println("Desc: " + descriptor + " | Value: " + currentValue + " | Interest: " + interestRate + "%");
    }
}
class Savings extends Asset {
    double interestRate;
    String asset;
    Savings(String desc, String d, double val, double rate, String a) {
        super(desc, d, val);
        this.interestRate = rate;
        this.asset = a;
    }
    void displayDetails() {
        System.out.println("\n--- Savings Asset ---");
        System.out.println("Desc: " + descriptor + " | Rate: " + interestRate + "% | Asset Type: " + asset);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Asset obj;

        System.out.println("Enter Stock (Desc, Date, Value, Shares, Price, Asset):");
        obj = new Stock(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble(), sc.next());
        obj.displayDetails();

        System.out.println("\nEnter Bond (Desc, Date, Value, Rate, Asset):");
        obj = new Bond(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        obj.displayDetails();

        System.out.println("\nEnter Savings (Desc, Date, Value, Rate, Asset):");
        obj = new Savings(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        obj.displayDetails();
    }
}
