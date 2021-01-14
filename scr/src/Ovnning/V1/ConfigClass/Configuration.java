package Ovnning.V1.ConfigClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Configuration {

    private String filePath = "C:\\Users\\Hamed.000\\git\\SystemArchitcotr\\scr\\src\\Ovnning\\V1\\file.cfg";
    private HashMap<String, String> conf = new HashMap<>();

    public Configuration() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (String line : lines) {
            String[] parts = line.split(":");
            conf.put(parts[0],parts[1]);
        }
    }

    private void saveConfiguration() {
        String configData = "";
        for (String key : conf.keySet()) {
            configData += key + ":" + conf.get(key) + "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter(new File(filePath), false);
            fileWriter.write(configData);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(String key, String value) {
        conf.put(key, value);
        saveConfiguration();
    }

    public String read(String key) {
        if(conf.keySet().contains(key)) {
            return conf.get(key);
        }
        return "Key not found";
    }
}
