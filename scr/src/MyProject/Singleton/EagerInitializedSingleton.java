package MyProject.Singleton;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/17/2021
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}