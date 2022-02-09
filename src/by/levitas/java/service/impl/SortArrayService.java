package service.impl;

public class SortArrayService {
    public int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) min_idx = j;
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort (int[] arr)
    {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
