public class Temp 
{
    double ctemp;
    void convert()
    {
        System.out.println("The temperature in Farenheit = "+((ctemp * 9/5) + 32));
    }

    public static void main(String args[])
    {
        Temp obj = new Temp();
        obj.ctemp = 67;
        obj.convert();
    }
}
