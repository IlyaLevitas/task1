package entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray extends AbstractCustomArray {
    private static final Logger logger = LogManager.getLogger();
    private int[] array;

    public CustomArray() {
        super();
    }

    public CustomArray(long id, int[] array) {
        super(id);
        this.array = array.clone();
    }


    public int[] getArr() {
        return array.clone();
    }

    public void setArr(int... arr) {
        this.array = arr.clone();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
