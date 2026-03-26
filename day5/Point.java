public class Point
{
    double x,y;
    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}

class Circle
{
    Point Centre;
    double rad;
    Circle(double x, double y, double r)
    {
        Centre = new Point(x,y);
        rad = r;
    }

    void print()
    {
        System.out.println("Area of the circle = "+(3.14 * rad * rad));
        System.out.println("Centre points : ("+Centre.x+","+Centre.y+")");
    }

    public static void main(String[] args)
        {
            Circle c = new Circle(2,3,4);
            c.print();
        }
}

