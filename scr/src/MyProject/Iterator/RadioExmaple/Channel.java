package MyProject.Iterator.RadioExmaple;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/22/2021
 */
public class Channel {

    //Define Behavior of Class All private ; it is POJO Class
    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double freq, ChannelTypeEnum type){
        this.frequency=freq;
        this.TYPE=type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString(){
        return "Frequency="+this.frequency+", Type="+this.TYPE;
    }

}
