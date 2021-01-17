package MyProject.Singleton;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/17/2021
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
