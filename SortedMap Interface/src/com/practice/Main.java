package com.practice;

import java.util.*;

/*
    - SortedMap Interface adalah implementasi Map dengan data key diurut sesuai dengan Comparable key
      (ketika keynya implement Comparable seperti String, Double, dll) atau bisa menggunakan Comparator ketika keynya tidak
      implement Comparable.
    - SortedMap Interface  cocok untuk kasus yang posisi key pada Map harus berurut sesuai dengan Comparable atau Comparator.
    - Interface SortedMap adalah turunan dari interface Map (Map => SortedMap).
    - Implementasi konkret class dari Interface SortedMap adalah TreeMap.

    - Method Immutable SortedMap.
        - Collections.emptySortedMap() = Membuat immutable SortedMap kosong, biasanya digunakan ketika membuat method dan data
          SortedMap tidak valid maka dapat mengembalikan immutable SortedMap kosong.
        - Collections.unmodifiableSortedMap(map) = Mengubah mutable SortedMap menjadi immutable.
*/
public class Main {
    public static void main(String[] args){

        // Anonymous Class (Comparator).
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Desc
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Molto1","Molto");
        sortedMap.put("Sunslik1","Sunslik");
        sortedMap.put("Lux1","Lux");

        for (var value : sortedMap.keySet()){
            System.out.println(value);
        }

        // Immutable SortedMap

        // Membuat Immutable SortedMap dengan menggunakan Collections.emptySortedMap().
        SortedMap<String,String> empty = Collections.emptySortedMap();

        // Mengubah mutable SortedMap menjadi immutable SortedMap, dengan menggunakan Collections.unmodifiableSortedMap(map).
        SortedMap<String,String> mutable = new TreeMap<>();
        mutable.put("product1","Nike");
        mutable.put("product2","Adidas");
        mutable.put("product3","NB");

        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(mutable);

        // Mencoba menambah / mengubah data immutable Map (Error).
        // immutable.put("car4","Rush"); Error !!!
        // immutable.put("car1","Brio"); Error !!!
    }
}
