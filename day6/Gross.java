import java.util.Scanner;
interface Gross
{
    double TA = 10.0;
    double DA = 15.0;
    void calculate_GrossSalary();
}

class Employee
{
    protected String name;
    protected int EmpID;

    public void getData()
    {
        System.out.println("Enter the name of the employee : ");
        name = sc.nextLine();
        System.out.println("Enter the Employee ID : ");
        EmpID = sc.nextInt();
    }

    public void displayProfile()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee ID : "+EmpID);
    }
}

class Salary extends Employee implements Gross
{
    private double BasicPay;
    private double GrossPay;

    public void SalaryData()
    {
        System.out.println("Basic Pay : "+BasicPay);
        System.out.println("Gross Pay : "+GrossPay);
    }

    @Override
    public void calculate_GrossSalary()
    {
        double ta = ()
    }
}

public class Gross
{
    
}
