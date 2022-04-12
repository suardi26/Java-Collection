package com.practice;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {

    public static void main(String[] args){
        Map<Integer,Integer>  weakHashMap = new WeakHashMap<>();
        for (var number = 0; number < 1000000; number++){
            weakHashMap.put(number,number);
        }

        // Running Garbage Collector.
        System.gc();

        System.out.println("Jumalah Data : "+weakHashMap.size());
    }
}
