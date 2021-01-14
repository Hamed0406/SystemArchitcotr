package Ovnning.V1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Configuration configuration = new Configuration();
        configuration.save("name", "Tom");
        System.out.println(configuration.read("name"));
    }
}
