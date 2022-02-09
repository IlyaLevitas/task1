package test.service.impl;

import entity.CustomArray;
import exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import parser.impl.ArrayListParserImpl;
import reader.impl.LineReaderImpl;
import service.impl.SortArrayService;
import validator.ValidateString;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class SortArrayServiceTest {
    static Logger logger = LogManager.getLogger();

    @Test
    public void testSelectionSort() {
        try {
            SortArrayService sortArrayService = new SortArrayService();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int[] actual = sortArrayService.selectionSort(customArray.getArr());
            int[] expected = {-4, -3, 1, 4, 5, 42};
            assertEquals(actual, expected);
        }
        catch (CustomException e){

        }
    }

    @Test
    public void testBubbleSort() {
        try {
            SortArrayService sortArrayService = new SortArrayService();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int[] actual = sortArrayService.bubbleSort(customArray.getArr());
            int[] expected = {-4, -3, 1, 4, 5, 42};
            assertEquals(actual, expected);
        }
        catch (CustomException e){

        }
    }

    @Test
    public void testInsertionSort() {
        try {
            SortArrayService sortArrayService = new SortArrayService();
            LineReaderImpl lineReader = new LineReaderImpl();
            ArrayListParserImpl arrayListParser = new ArrayListParserImpl();

            ArrayList<String> temp = lineReader.readFile("file/txt/info.txt");
            int index = 0;
            while(!ValidateString.IsContainOnlyNumbers(temp.get(index))) index++;
            int[] array = arrayListParser.ParseStringToIntArr(temp.get(index));
            CustomArray customArray = new CustomArray(array);

            int[] actual = sortArrayService.insertionSort(customArray.getArr());
            int[] expected = {-4, -3, 1, 4, 5, 42};
            assertEquals(actual, expected);
        }
        catch (CustomException e){

        }
    }
}