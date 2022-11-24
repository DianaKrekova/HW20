package ru.mirea.krekova20;

import java.util.*;

public class MinMax<T>{

    private T[] arr;


    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T min(){
        Arrays.sort(arr);
        return arr[0];
    }
    public T max(){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
