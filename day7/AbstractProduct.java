import java.util.Scanner;

abstract class AbstractProduct {
    int id;
    String name, desc;

    AbstractProduct(int id, String name, String desc) {
        this.id = id; this.name = name; this.desc = desc;
    }
    abstract void display();
}

class Product extends AbstractProduct {
    double price;
    Product(int id, String name, String desc, double p) {
        super(id, name, desc); this.price = p;
    }
    void display() {
        System.out.print("ID: " + id + " | Name: " + name + " | Price: " + price);
    }
}

class Book extends Product {
    String isbn, auth, title;
    Book(int id, String n, String d, double p, String i, String a, String t) {
        super(id, n, d, p); this.isbn = i; this.auth = a; this.title = t;
    }
}

class TravelGuide extends Book {
    String country;
    TravelGuide(int id, String n, String d, double p, String i, String a, String t, String c) {
        super(id, n, d, p, i, a, t); this.country = c;
    }
    void display() {
        super.display();
        System.out.println(" | Country: " + country + " | Title: " + title);
    }
}

class CompactDisc extends Product {
    String artist, title;
    CompactDisc(int id, String n, String d, double p, String a, String t) {
        super(id, n, d, p); this.artist = a; this.title = t;
    }
    void display() {
        super.display();
        System.out.println(" | Artist: " + artist + " | Title: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AbstractProduct obj;

        System.out.println("Enter Guide (ID, Name, Desc, Price, ISBN, Auth, Title, Country):");
        obj = new TravelGuide(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.next(), sc.next());
        obj.display();

        System.out.println("\nEnter CD (ID, Name, Desc, Price, Artist, Title):");
        obj = new CompactDisc(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
        obj.display();
    }
}
