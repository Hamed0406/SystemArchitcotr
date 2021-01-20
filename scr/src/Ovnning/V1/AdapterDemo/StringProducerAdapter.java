package Ovnning.V1.AdapterDemo;

public class StringProducerAdapter implements CurrentlyUsedInterface {
    @Override
    public String createString() {
        CandidateStringProducer candidateStringProducer = new CandidateStringProducer();
        return candidateStringProducer.makeString(25);
    }
}
