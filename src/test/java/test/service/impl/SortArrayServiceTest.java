package test.service.impl;

import entity.CustomArray;
import org.testng.annotations.Test;
import parser.impl.ArrayListParserImpl;
import reader.impl.LineReaderImpl;
import service.impl.SortArrayService;
import validator.ValidateString;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class SortArrayServiceTest {

    @Test
    public void testSelectionSort() {
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

    @Test
    public void testBubbleSort() {
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

    @Test
    public void testInsertionSort() {
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
}