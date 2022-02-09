package test.service.impl;

import entity.CustomArray;
import exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import parser.impl.ArrayListParserImpl;
import reader.impl.LineReaderImpl;
import service.impl.ReplaceServiceImpl;
import validator.ValidateString;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ReplaceServiceImplTest {
    static Logger logger = LogManager.getLogger();

    @Test
    public void testReplacePositiveWithZero() {
        try {
            ReplaceServiceImpl replaceService = new ReplaceServiceImpl();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int[] actual = replaceService.ReplacePositiveWithZero(customArray.getArr());
            int[] expected = {0, -3, 0, 0, 0, -4};
            assertEquals(actual, expected);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }
}