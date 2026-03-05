public class Area // using method overloading
{
    void area(int len, int bread, int dummy)
    {
        System.out.println("Area of a rectangle = "+(len*bread));
    }

    void area(int side)
    {
        System.out.println("Area of a square = "+(side * side));
    }

    void area(int length, int base)
    {
        System.out.println("Area of a triangle = "+(0.5*length*base));
    }

    public static void main(String[]args)
    {
        Area obj = new Area();
        obj.area(5, 6, 1);
        obj.area(5);
        obj.area(3, 4);
    }
}
