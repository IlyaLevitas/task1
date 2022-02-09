package test.service.impl;

import entity.CustomArray;
import exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import parser.impl.ArrayListParserImpl;
import reader.impl.LineReaderImpl;
import service.impl.ArrayArithmeticServiceImpl;
import validator.ValidateString;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ArrayArithmeticServiceImplTest {
    static Logger logger = LogManager.getLogger();

    @Test
    public void testGetArraySum() {
        try {
            ArrayArithmeticServiceImpl arrayArithmeticService = new ArrayArithmeticServiceImpl();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int actual = arrayArithmeticService.getArraySum(customArray.getArr());
            int expected = 45;
            assertEquals(actual, expected);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }

    @Test
    public void testGetArrayAverage() {
        try {
            ArrayArithmeticServiceImpl arrayArithmeticService = new ArrayArithmeticServiceImpl();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            double actual = arrayArithmeticService.getArrayAverage(customArray.getArr());
            double expected = 7.5;
            assertEquals(actual, expected, 0.01);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }

    @Test
    public void testGetArrayMin() {
        try {
            ArrayArithmeticServiceImpl arrayArithmeticService = new ArrayArithmeticServiceImpl();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int actual = arrayArithmeticService.getArrayMin(customArray.getArr());
            int expected = -4;
            assertEquals(actual, expected, 0);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }

    @Test
    public void testGetArrayMax() {
        try {
            ArrayArithmeticServiceImpl arrayArithmeticService = new ArrayArithmeticServiceImpl();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int actual = arrayArithmeticService.getArrayMax(customArray.getArr());
            int expected = 42;
            assertEquals(actual, expected);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }

    @Test
    public void testGetPositiveCount() {
        try {
            ArrayArithmeticServiceImpl arrayArithmeticService = new ArrayArithmeticServiceImpl();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int actual = arrayArithmeticService.getPositiveCount(customArray.getArr());
            int expected = 4;
            assertEquals(actual, expected);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }

    @Test
    public void testGetNegativeCount() {
        try {
            ArrayArithmeticServiceImpl arrayArithmeticService = new ArrayArithmeticServiceImpl();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int actual = arrayArithmeticService.getNegativeCount(customArray.getArr());
            int expected = 2;
            assertEquals(actual, expected);
        }
        catch (CustomException e){
            logger.error("readFile exception, file not found");
        }
    }
}