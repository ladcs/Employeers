package projedata.Employeer;

/**
 *  main class
 */
public class App 
{
    public static void main( String[] args )
    {
        new Seed();
        UtilToMapAndInc util = new UtilToMapAndInc(); 
        util.incRemuneration();
    }
}
