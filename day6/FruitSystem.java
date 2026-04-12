import java.util.Scanner;
interface Mango {
    void getTaste();
    void getAvailability();
}

class Winter implements Mango {
    @Override
    public void getTaste() {
        System.out.println("Taste: Sour and firm");
    }

    @Override
    public void getAvailability() {
        System.out.println("Availability: Rare");
    }
}

class Summer implements Mango {
    @Override
    public void getTaste() {
        System.out.println("Taste: Sweet and juicy");
    }

    @Override
    public void getAvailability() {
        System.out.println("Availability: Everywhere!");
    }
}

public class FruitSystem {
    public static void main(String[] args) {
        Mango myFruit;

        System.out.println("--- Summer Season ---");
        myFruit = new Summer();
        myFruit.getAvailability();
        myFruit.getTaste();

        System.out.println("\n--- Winter Season ---");
        myFruit = new Winter();
        myFruit.getAvailability();
        myFruit.getTaste();
    }
}
