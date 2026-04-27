import java.util.Scanner;
interface Gross {
    double HRA_PERCENT = 15.0; // Constants
    double DA_PERCENT = 10.0;
    
    double calculateGross(double base);
}

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayBasicInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}

class Salary extends Employee implements Gross {
    double basicSalary;

    Salary(String name, int id, double basicSalary) {
        super(name, id); // Call parent constructor
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateGross(double base) {
        double hra = (HRA_PERCENT / 100) * base;
        double da = (DA_PERCENT / 100) * base;
        return base + hra + da;
    }

    void displaySalarySheet() {
        displayBasicInfo();
        double total = calculateGross(basicSalary);
        System.out.println("Basic: $" + basicSalary);
        System.out.println("Gross Salary (inc. HRA/DA): $" + total);
        System.out.println("-----------------------------------");
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        double base = sc.nextDouble();
        Salary empSalary = new Salary(name, id, base);
        System.out.println("\n--- Payroll Details ---");
        empSalary.displaySalarySheet();
    }
}
