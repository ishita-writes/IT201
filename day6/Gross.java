import java.util.Scanner;
interface Gross 
{
    double TA_PERCENT = 10.0; 
    double DA_PERCENT = 15.0; 
    void calculate_GrossSalary();
}

class Employee {
    protected String name;
    protected int EmpID;
    Scanner sc = new Scanner(System.in);
    public void getData() {
        System.out.print("Enter the name of the employee: ");
        name = sc.nextLine();
        System.out.print("Enter the Employee ID: ");
        EmpID = sc.nextInt();
    }

    public void displayProfile() {
        System.out.println("\n--- Employee Profile ---");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + EmpID);
    }
}

class Salary extends Employee implements Gross {
    private double BasicPay;
    private double GrossPay;

    public void getSalaryInput() {
        System.out.print("Enter Basic Pay: ");
        BasicPay = sc.nextDouble();
    }

    @Override
    public void calculate_GrossSalary() {
        double ta_amount = (TA_PERCENT / 100) * BasicPay;
        double da_amount = (DA_PERCENT / 100) * BasicPay;
        GrossPay = BasicPay + ta_amount + da_amount;
    }

    public void displaySalaryData() {
        System.out.println("Basic Pay     : Rs." + BasicPay);
        System.out.println("TA (" + TA_PERCENT + "%)    : Rs." + (TA_PERCENT / 100 * BasicPay));
        System.out.println("DA (" + DA_PERCENT + "%)    : Rs." + (DA_PERCENT / 100 * BasicPay));
        System.out.println("Gross Pay     : Rs." + GrossPay);
    }
}

public class Main {
    public static void main(String[] args) {
        Salary empSalary = new Salary();
        empSalary.getData();
        empSalary.getSalaryInput();
        empSalary.calculate_GrossSalary();
        empSalary.displayProfile();
        empSalary.displaySalaryData();
    }
}
