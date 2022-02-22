package parser.impl;

public class ArrayListParserImpl {
    public int[] ParseStringToIntArr(String stringToParse) {
        String[] chunks = stringToParse.split(" ");
        int[] array = new int[chunks.length];

        int i = 0;
        for (String chunk : chunks) {
            array[i++] = Integer.parseInt(chunk);
        }

        return array;
    }
}
