import java.util.Scanner;
class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
        sc.close();
    }
}
