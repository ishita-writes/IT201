import java.util.Scanner;
abstract class MotorVehicle
{
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int num, double price)
    {
        this.modelName = name;
        this.modelNumber = num;
        this.modelPrice = price;
    }

    abstract void display();
}

class Car extends MotorVehicle
{
    double discountRate;
    Car(String name, int num, double price, double rate)
    {
        super(name, num, price);
        this.discountRate = rate;
    }

    double discount()
    {
        return (modelPrice * discountRate) / 100;
    }

    @Override
    void display()
    {
        System.out.println("Model Name : "+modelName);
        System.out.println("Model Number : "+modelNumber);
        System.out.println("Original Price : "+modelPrice);
        System.out.println("Discount : "+discount());
        System.out.println("Final Rate : "+(modelPrice - discount()));
    }
}

public class Motor
{
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter model name : ");
       String name = sc.next();
       System.out.println("Enter model number : ");
       int num = sc.nextInt();
       System.out.println("Enter the price of the vehicle : ");
       double price = sc.nextDouble();
       System.out.println("Enter the rate of discount : ");
       double rate = sc.nextDouble();
       MotorVehicle Mycar = new Car(name, num, price, rate);
       Mycar.display();
    }
}
