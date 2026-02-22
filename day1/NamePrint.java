class Name
{
    String name; 
    void PrintName()
    {
        System.out.println("My name is "+name);
    }

    public static void main(String args[])
    {
        NamePrint obj = new NamePrint();
        obj.name = "Ishita";
        obj.PrintName();
    }
}