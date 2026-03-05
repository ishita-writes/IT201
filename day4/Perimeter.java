public class Perimeter // to demonstrate method overloading
{
    void peri(int len, int bread, int dummy)
    {
        System.out.println("Perimeter of a rectangle = "+(2*(len+bread)));
    }

    void peri(int side)
    {
        System.out.println("Perimeter of a square = "+(4*side));
    }

    void peri(double rad)
    {
        System.out.println("Perimeter of a circle = "+(6.28*rad));
    }

    public static void main(String[]args)
    {
        Perimeter obj = new Perimeter();
        obj.peri(5, 6, 1);
        obj.peri(5);
        obj.peri(2.0);
    }
}
