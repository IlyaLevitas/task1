package service.impl;

import service.ReplaceServiceInterface;

public class ReplaceServiceImpl implements ReplaceServiceInterface {
    public int[] ReplacePositiveWithZero(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) arr[i] = 0;
        }
        return arr;
    }
}
