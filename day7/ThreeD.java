import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();

    void display(String name) {
        System.out.println("\n--- " + name + " Details ---");
        System.out.printf("Surface Area : %.2f\n", wholeSurfaceArea());
        System.out.printf("Volume       : %.2f\n", volume());
    }
}

class Box extends ThreeDObject {
    double l, w, h;
    Box(double l, double w, double h) { this.l = l; this.w = w; this.h = h; }
    double wholeSurfaceArea() { return 2 * (l * w + w * h + h * l); }
    double volume() { return l * w * h; }
}

class Cube extends ThreeDObject {
    double s;
    Cube(double s) { this.s = s; }
    double wholeSurfaceArea() { return 6 * s * s; }
    double volume() { return s * s * s; }
}

class Cylinder extends ThreeDObject {
    double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    double wholeSurfaceArea() { return 2 * Math.PI * r * (r + h); }
    double volume() { return Math.PI * r * r * h; }
}

class Cone extends ThreeDObject {
    double r, h;
    Cone(double r, double h) { this.r = r; this.h = h; }
    double wholeSurfaceArea() { 
        return Math.PI * r * (r + Math.sqrt(r * r + h * h)); 
    }
    double volume() { return (Math.PI * r * r * h) / 3; }
}

public class ThreeD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        System.out.print("Enter Box l, w, h: ");
        (obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble())).display("Box");

        System.out.print("Enter Cube side: ");
        (obj = new Cube(sc.nextDouble())).display("Cube");

        System.out.print("Enter Cylinder r, h: ");
        (obj = new Cylinder(sc.nextDouble(), sc.nextDouble())).display("Cylinder");

        System.out.print("Enter Cone r, h: ");
        (obj = new Cone(sc.nextDouble(), sc.nextDouble())).display("Cone");
    }
}
