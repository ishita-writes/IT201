public class InnerClass 
{
    int x = 6;
    public class InnerCheck
    {
        int y = 7;
        void checking_in()
        {
            System.out.println("Outer x = "+x);
            System.out.println("Inner y = "+y);
        }
    }

    public static void main(String args[])
    {
        InnerClass inn = new InnerClass();
        InnerClass.InnerCheck obj = inn.new InnerCheck();
        System.out.println("Accessed from main : "+(inn.x + obj.y));
        obj.checking_in();
    }
}
