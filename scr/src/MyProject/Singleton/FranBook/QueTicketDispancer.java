package MyProject.Singleton.FranBook;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/22/2021
 */
public class QueTicketDispancer {
    private  int nr;//Global variable
    //Eager implementation
    private static QueTicketDispancer theOne= new QueTicketDispancer();
    //TODO define access to instance of the the object
    public static QueTicketDispancer getInstance()
    {
        return  theOne;
    }
    private QueTicketDispancer()
    {
        nr=1;
    }
    public  int getNextNumber()
    {
        return nr++;
    }
}
