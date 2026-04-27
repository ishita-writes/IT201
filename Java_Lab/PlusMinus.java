class PlusMinus
{
    int val;
    PlusMinus(int n)
    {
        val = n;
    }

    void check()
    {
        if (val > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

    public static void main(String args[])
    {
        PlusMinus obj = new PlusMinus(7);
        obj.check();
    }
}
