package MyProject.Singleton;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/17/2021
 */
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}