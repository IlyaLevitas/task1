package reader;

import exception.CustomException;

import java.util.ArrayList;

public interface LineReaderInterface {
    ArrayList<String> readFile(String path) throws CustomException;
}
