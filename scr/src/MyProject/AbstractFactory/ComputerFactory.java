package MyProject.AbstractFactory;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/18/2021
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
