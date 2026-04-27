class AP
{
    int length, breadth;
    void calc()
    {
        System.out.println("Area = "+(length * breadth));
        System.out.println("Perimeter = "+(2*(length + breadth)));
    }

    public static void main(String args[])
    {
        AP obj = new AP();
        obj.length = 8;
        obj.breadth = 4;
        obj.calc();
    }
}
