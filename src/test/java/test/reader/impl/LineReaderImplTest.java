package test.reader.impl;

import org.testng.annotations.Test;
import reader.impl.LineReaderImpl;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class LineReaderImplTest {

    @Test
    public void testReadFile() {
        LineReaderImpl lineReader = new LineReaderImpl();
        ArrayList<String> actual = lineReader.readFile("file/txt/test.txt");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1 2 3 4 5222");
        expected.add("adadad");
        expected.add("314141x x x");
        assertEquals(actual, expected);
    }
}