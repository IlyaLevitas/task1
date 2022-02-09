package service.impl;

import service.ArrayArithmeticServiceInterface;

public class ArrayArithmeticServiceImpl implements ArrayArithmeticServiceInterface {
    public int getArraySum(int[] arr) {
        int sum = 0;
        for (int j : arr) sum = sum + j;
        return sum;
    }

    public double getArrayAverage(int[] arr) {
        double sum = 0;
        double average;
        for (int j : arr) sum = sum + j;
        average = sum / arr.length;
        return average;
    }

    public int getArrayMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
            if (min > arr[i]) min = arr[i];
        return min;
    }

    public int getArrayMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
            if (max < arr[i]) max = arr[i];
        return max;
    }

    public int getPositiveCount(int[] arr) {
        int positive = 0;
        for(int i = 0; i < arr.length; i++)
            if (arr[i] >= 0) positive++;
        return positive;
    }

    public int getNegativeCount(int[] arr) {
        int negative = 0;
        for(int i = 0; i < arr.length; i++)
            if (arr[i] < 0) negative++;
        return negative;
    }
}
