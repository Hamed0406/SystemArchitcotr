package MyProject.AbstractFactory;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/18/2021
 */
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}