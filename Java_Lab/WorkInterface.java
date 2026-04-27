import java.util.Scanner;
interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    private double totalProcessed = 0;
    private int operationCount = 0;

    @Override
    public void processSale(double amount) {
        this.totalProcessed += amount;
        this.operationCount++;
        System.out.println("[SALES] Processing sale of $" + amount);
        System.out.println("Status: Sale Confirmed.");
    }

    @Override
    public void generateInvoice(String clientName, double amount) {
        this.operationCount++;
        System.out.println("[FINANCE] Generating invoice for: " + clientName);
        System.out.println("Details: Invoice total $" + amount + " has been finalized.");
    }

    public void showSummary() {
        System.out.println("\n--- EXECUTIVE SUMMARY ---");
        System.out.println("Total Operations Handled: " + operationCount);
        System.out.println("Total Revenue Processed:  $" + totalProcessed);
        System.out.println("--------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        CommercialExecutive executive = new CommercialExecutive();

        System.out.println("=== Commercial Executive Activity Log ===\n");
        executive.processSale(5500.75);
        System.out.println(); 
        executive.generateInvoice("Global Tech Corp", 5500.75);
        executive.showSummary();
    }
}
