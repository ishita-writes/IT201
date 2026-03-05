class Swap
{
    int a, b;
    Swap(int x, int y)
    {
        a = x;
        b = y;
    }

    void Swapper()
    {
        System.out.println("Before Swapping = "+a+" "+b);
        System.out.println("After Swapping = "+b+" "+a);
    }

    public static void main(String args[])
    {
        Swap obj1 = new Swap(5,6);
        obj1.Swapper();
        Swap obj2 = new Swap(7,6);
        obj2.Swapper();
    }
}
