public class Oven{
    public static int OvensCounter = 0;


    public Oven()
    {
        super();
        // Counter
        {OvensCounter +=1;}
    }

    public static void Counter(){System.out.println("THE OVENS ARE : "+Oven.OvensCounter);}
}
