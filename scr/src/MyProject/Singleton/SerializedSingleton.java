package MyProject.Singleton;

import java.io.Serializable;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/17/2021
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){

        return SingletonHelper.instance;
    }
    protected Object readResolve() {
        return getInstance();
    }

}
