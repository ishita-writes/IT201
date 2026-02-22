class OddEven
{
    int num;
    void check()
    {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    public static void main(String args[])
    {
        OddEven obj = new OddEven();
        obj.num = 45;
        obj.check;
    }
}