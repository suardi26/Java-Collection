package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    - Pada Saat menyimpan data di Map, data disimpan dalam pair (key-value).
    - Pada Java Collection, implementasi Pair di Map bernama Entry (Ada inner Interface pada interface Map yaitu interface Entry).
    - Interface Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value, dan merupakan inner interface
      pada class Map.
    - jadi pada saat memasukan data (Key & Value) maka data disimpan pada Interface Entry yang ada didalam interface Map.
*/
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("AntonK","AntonV");
        map.put("CalvinK", "CalvinV");
        map.put("BudiK","BudiV");

        Set<Map.Entry<String,String>> entries = map.entrySet();

        for(var value : entries){
            System.out.println("= = = = = = = = =");
            System.out.println("Key   :" + value.getKey());
            System.out.println("Value :" + value.getValue());
        }
    }
}
