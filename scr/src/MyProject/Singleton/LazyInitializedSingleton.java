package MyProject.Singleton;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/17/2021
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

