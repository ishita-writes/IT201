class Leap
{
    int year;
    void count()
    {
        if (year % 4 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap year");
    }

    public static void main (String args[])
    {
        Leap obj = new Leap();
        obj.year = 2019;
        obj.count();
    }
}