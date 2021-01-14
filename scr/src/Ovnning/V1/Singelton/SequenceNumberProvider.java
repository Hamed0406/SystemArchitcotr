package Ovnning.V1.Singelton;

public class SequenceNumberProvider {

    private int number = 1;

    public int getNextNumber() {
        return number++;
    }

}
