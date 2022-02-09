package reader.impl;

import exception.CustomException;

import java.io.*;
import java.util.ArrayList;

public class LineReaderImpl {
    public ArrayList<String> readFile(String path) throws CustomException {
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
            throw new CustomException(e);
        } catch (IOException e) {
            throw new CustomException(e);
        }
        return readenInfo;
    }
}
