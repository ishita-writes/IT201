import java.util.Scanner;

class Item {
    int code;
    double price;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.print("Enter code and price: ");
            items[i].code = sc.nextInt();
            items[i].price = sc.nextDouble();
            total += items[i].price;
        }

        System.out.println("\nCode\tPrice");
        for (Item it : items) 
            System.out.println(it.code + "\t" + it.price);
        
        System.out.println("Total: " + total);
    }
}
