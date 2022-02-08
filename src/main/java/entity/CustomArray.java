package entity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {

    }

    public CustomArray(int[] array) {
        this.array = array;
    }


    public int[] getArr() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArr(int[] arr) {
        this.array = arr;
    }
}
