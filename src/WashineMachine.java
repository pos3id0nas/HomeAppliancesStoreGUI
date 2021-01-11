public class WashineMachine{
    static int WashingsCounter = 0;


    public WashineMachine()
    {
        super();

        { WashingsCounter +=1;}

    }
    public static void Counter () {System.out.println("THE WASHINE MACHINES ARE : " + WashineMachine.WashingsCounter);}

}
