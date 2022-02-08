package reader.impl;

import java.io.*;
import java.util.ArrayList;

public class LineReaderImpl {
    public ArrayList<String> readFile(String path) {
        ArrayList<String> readenInfo = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                readenInfo.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readenInfo;
    }
}
