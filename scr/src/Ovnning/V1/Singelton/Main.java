package Ovnning.V1.Singelton;

public class Main {

    public static void main(String[] args) {
	    for(int i=0;i<10;i++) {
	        System.out.println(SequenceNumberProviderLazy.getInstance().getNextNumber());
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(SequenceNumberProviderEager.getInstance().getNextNumber());

        }
    }
}
