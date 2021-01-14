package Ovnning.V1.Singelton;

public class SequenceNumberProviderEager {
    private int number;
    private static SequenceNumberProviderEager instance = new SequenceNumberProviderEager();

    private SequenceNumberProviderEager() {
        number = 1;
    }

    public static SequenceNumberProviderEager getInstance() {
        return instance;
    }

    public int getNextNumber() {
        return number++;
    }

}
