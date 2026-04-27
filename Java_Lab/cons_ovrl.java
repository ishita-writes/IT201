public class cons_ovrl // constructor overloading
{
    String name;
    int age;
    cons_ovrl()
    {
        name = "Sam";
        age = 5;
    }
    
    cons_ovrl(int num)
    {
        name = "John";
        age = num;
    }
    
    cons_ovrl(String str, int num)
    {
        name = str;
        age = num;
    }
    
    void display()
    {
        System.out.println("Name : "+name+" |  Age : "+age);
    }
    
    public static void main(String[]args)
    {
        cons_ovrl obj = new cons_ovrl(35);
        cons_ovrl obj1 = new cons_ovrl();
        cons_ovrl obj2 = new cons_ovrl("Dean", 9);
        obj.display();
        obj1.display();
        obj2.display();
    }
}
