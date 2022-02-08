package test.service.impl;

import entity.CustomArray;
import org.testng.annotations.Test;
import parser.impl.ArrayListParserImpl;
import reader.impl.LineReaderImpl;
import service.impl.ArrayArithmeticServiceImpl;
import validator.ValidateString;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ArrayArithmeticServiceImplTest {

    @Test
    public void testGetArraySum() {
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

    @Test
    public void testGetArrayAverage() {
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

    @Test
    public void testGetArrayMin() {
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

    @Test
    public void testGetArrayMax() {
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

    @Test
    public void testGetPositiveCount() {
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

    @Test
    public void testGetNegativeCount() {
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
}