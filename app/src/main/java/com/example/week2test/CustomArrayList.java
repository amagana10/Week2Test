package com.example.week2test;

import java.util.Arrays;

public class CustomArrayList<T> {
    private int index;
    private Object[] array;
    private T t;

    public CustomArrayList() {
        array = new Object[1];
        index = 0;
    }
    public void add(T t){
        this.t = t;

        if (index == array.length - 1){
            array = Arrays.copyOf(array,array.length*2);
            System.out.println("list size: " + array.length);
        }
        array[index] = this.t;
        index++;
    }

    public void printSize(){
        System.out.println("list size: " + array.length);
    }
}
