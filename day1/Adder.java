class Adder
{
    int a,b;
    void Add()
    {
        System.out.println("Sum = "+(a+b));
    }

    public void static void(String args[])
    {
        Adder obj = new Adder();
        obj.a = 5;
        obj.b = 6;
        obj.Add();
    }
}