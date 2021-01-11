public class Fridge{

    public static int FridgeCounter=0;


    Fridge()
    {
        { FridgeCounter +=1;}
    }
    public static void Counter(){System.out.println("THE FRIDGES ARE : "+Fridge.FridgeCounter);}
}
