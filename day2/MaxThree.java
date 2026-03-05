class MaxThree
{
    int l, m, n;
    MaxThree(int a, int b, int c)
    {
        l = a;
        m = b;
        n = c;
    }

    void Find()
    {
        if (l >= m && l >= n)
            System.out.println("The greatest value = "+l);
        if (m >= l && m >= n)
            System.out.println("The greatest value = "+m);
        else
            System.out.println("The greatest value = "+n);    
    }

    public static void main(String args[])
    {
        MaxThree obj1 = new MaxThree(5, 2, 8);
        obj1.Find();
        MaxThree obj2 = new MaxThree(11, 55, 65);
        obj2.Find();
    }
}
