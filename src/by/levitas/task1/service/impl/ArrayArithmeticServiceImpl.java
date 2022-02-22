package service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.ArrayArithmeticServiceInterface;

public class ArrayArithmeticServiceImpl implements ArrayArithmeticServiceInterface {
    static Logger logger = LogManager.getLogger();

    public int getArraySum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }

        logger.info("array sum - " + sum);
        return sum;
    }

    public double getArrayAverage(int[] arr) {
        double sum = 0;
        double average;
        for (int element : arr) {
            sum = sum + element;
        }
        average = sum / arr.length;

        logger.info("array average - " + average);
        return average;
    }

    public int getArrayMin(int[] arr) {
        int min = arr[0];
        for(int element : arr) {
            if (min > element) min = element;
        }

        logger.info("array min - " + min);
        return min;
    }

    public int getArrayMax(int[] arr) {
        int max = arr[0];
        for(int element : arr) {
            if (max < element) max = element;
        }

        logger.info("array max - " + max);
        return max;
    }

    public int getPositiveCount(int[] arr) {
        int positive = 0;
        for(int element : arr) {
            if (element >= 0) positive++;
        }

        logger.info("array positive count - " + positive);
        return positive;
    }

    public int getNegativeCount(int[] arr) {
        int negative = 0;
        for(int element : arr) {
            if (element < 0) negative++;
        }

        logger.info("array negative count - " + negative);
        return negative;
    }
}
