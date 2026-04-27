class StepOne // to demonstrate method overriding
{
    void Drive()
    {
        System.out.println("Ishita drives a car");
    }
}

class StepTwo extends StepOne
{
    @Override
    void Drive()
    {
        System.out.println("Ishita drives a Camry");
    }
}

class StepThree extends StepOne 
{
    @Override
    void Drive()
    {
        System.out.println("Ishita drives an Impala");
    }
}

public class Main
{
    public static void main(String[]args)
    {
        StepOne car = new StepOne();
        StepOne Camry = new StepTwo();
        StepOne Impala = new StepThree();
        
        car.Drive();
        Camry.Drive();
        Impala.Drive();
    }
}
