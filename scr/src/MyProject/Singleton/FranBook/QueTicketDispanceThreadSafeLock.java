package MyProject.Singleton.FranBook;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/22/2021
 */
public class QueTicketDispanceThreadSafeLock {
    private int nr;
    private static QueTicketDispanceThreadSafeLock theOne;
    public static QueTicketDispanceThreadSafeLock getInstance()
    {
        if(theOne==null)
        {
            theOne=new QueTicketDispanceThreadSafeLock();
        }
        return theOne;
    }
    private QueTicketDispanceThreadSafeLock()
    {
        nr=1;
    }
    public  int getNr()
    {
        return nr++;
    }
}
