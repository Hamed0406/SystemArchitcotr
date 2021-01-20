package Ovnning.V1.FasadeDemo;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/20/2021
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
@Override
    public String toString() {
        return this.name;
    }
}
