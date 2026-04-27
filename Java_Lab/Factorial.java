class Factorial
{
    int num;
    Factorial(int n)
    {
        num = n;
    }    
    int fact()
    {
        int facto = 1;
        for (int i = 2; i <= num; i++)
            facto *= i;
        return facto;
    }

    public static void main(String args[])
    {
        Factorial obj = new Factorial(10);
        int result = obj.fact();
        System.out.println("Factorial = "+result);
    }
}
