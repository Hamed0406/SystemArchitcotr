package Ovnning.V1.Singelton;

public class SequenceNumberProviderStatic {

    private static int number = 1;

    public static int getNextNumber() {
        return number++;
    }

}
