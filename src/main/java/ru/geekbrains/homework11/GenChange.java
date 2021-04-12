package ru.geekbrains.homework11;

import java.util.ArrayList;
import java.util.Arrays;

public class GenChange {

    public static void changeThem(Object[] arr, int first, int second) {
        Object remember = arr[first];
        arr[first] = arr[second];
        arr[second] = remember;
    }

    public static <E> ArrayList<E> arrayToList(E[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

}
