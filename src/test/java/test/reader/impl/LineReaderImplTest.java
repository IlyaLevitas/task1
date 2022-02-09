package test.reader.impl;

import exception.CustomException;
import org.testng.annotations.Test;
import reader.impl.LineReaderImpl;

import java.util.ArrayList;

import static org.testng.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LineReaderImplTest {
    static  Logger logger = LogManager.getLogger();

    @Test
    public void testReadFile() {
        try {
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayList<String> actual = lineReader.readFile("file/txt/testt.txt");
            ArrayList<String> expected = new ArrayList<String>();
            expected.add("1 2 3 4 5222");
            expected.add("adadad");
            expected.add("314141x x x");
            assertEquals(actual, expected);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }
}