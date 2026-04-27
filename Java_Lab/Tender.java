import java.util.Scanner;

class Tender {
    String name;
    double cost;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];
        int minIdx = 0;

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.print("Enter Company & Cost: ");
            t[i].name = sc.next();
            t[i].cost = sc.nextDouble();
         
            if (t[i].cost < t[minIdx].cost) minIdx = i;
        }

        System.out.println("Company with the minimum cost: " + t[minIdx].name);
    }
}
