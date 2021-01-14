package Ovnning.V1.ConfigClass;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Configuration configuration = new Configuration();
        configuration.save("name", "Tom");
        configuration.save("Adress","Global");
        System.out.println(configuration.read("name"));
        System.out.println(configuration.read("Adress"));


    }
}
