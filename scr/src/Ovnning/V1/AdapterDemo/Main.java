package Ovnning.V1.AdapterDemo;

public class Main {

    public static void main(String[] args) {
	    StringProducer stringProducer = new StringProducer();
	    Client client = new Client(stringProducer);
        System.out.println(client.getString());

        // Test of new StringProducer
        StringProducerAdapter stringProducerAdapter = new StringProducerAdapter();
        Client clientTest = new Client(stringProducerAdapter);
        System.out.println(clientTest.getString());
    }
}
