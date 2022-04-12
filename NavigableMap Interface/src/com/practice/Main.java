package com.practice;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;


/*
    - NavigableMap adalah turunan dari SortedMap (Map => SortedMap => NavigableMap).
    - Namun NavigableMap memiliki kemampuan navigasi berdasarkan operasi kurang dari, lebih dari dan sejenisnya.
    - Misalnya ingin mengambil data yang lebih dari key x ataupun kurang dari key y, ini bisa dilakukan di NavigableMap.
    - Implementasi konkret class dari Interface NavigableMap sama seperti interface SortedMap adalah TreeMap.

    - Method Immutable NavigableMap.
        - Collections.emptyNavigableMap() = Membuat immutable NavigableMap kosong, biasanya digunakan ketika membuat method dan data
          NavigableMap tidak valid maka dapat mengembalikan immutable NavigableMap kosong.
        - Collections.unmodifiableNavigableMap(map) = Mengubah mutable NavigableMap menjadi immutable.
*/
public class Main {
    public static void main(String[] args){
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("Suardi1","Suardi");
        navigableMap.put("Daud1","Daud");
        navigableMap.put("Manda1","Manda");

        System.out.println("= = = = = = Data Ascending = = = = = =");
        for (var value : navigableMap.keySet()){
            System.out.println(value);
        }

        // Mengambil key yang kurang dari 'Manda1' setelah di Sorted Asc.
        System.out.println(
                "Mengambil key yang kurang dari 'Manda1' setelah di Sorted Asc : " +
                        ""+navigableMap.lowerKey("Manda1")
        );

        // Mengambil key yang  lebih dari 'Manda1' setelah di Sorted Asc.
        System.out.println(
                "Mengambil key yang lebih dari 'Manda1' setelah di Sorted Asc : " +
                        ""+navigableMap.higherKey("Manda1")
        );

        // Mengambil key yang kurang dari atau sama dengan 'Manda1' setelah di Sorted Asc.
        System.out.println(
                "Mengambil key yang kurang dari atau sama dengan 'Manda1' setelah di Sorted Asc : " +
                        ""+navigableMap.floorKey("Manda1")
        );

        // Mengambil key yang lebih dari atau sama dengan 'Suardi1' setelah di Sorted Asc.
        System.out.println(
                "Mengambil key yang lebih dari atau sama dengan 'Suardi1' setelah di Sorted Asc : " +
                        ""+navigableMap.ceilingKey("Suardi1")
        );

        // Membalikan NavigableMap Asc ke Desc.
        NavigableMap<String, String> navigableMapDesc = navigableMap.descendingMap();
        System.out.println("= = = = = = Data Descending = = = = = =");
        for (var value : navigableMapDesc.keySet()){
            System.out.println(value);
        }

        // Immutable NavigableMap

        // Membuat Immutable NavigableMap dengan menggunakan Collections.emptyNavigableMap().
        NavigableMap<String,String> empty = Collections.emptyNavigableMap();

        // Mengubah mutable NavigableMap menjadi immutable NavigableMap, dengan menggunakan Collections.unmodifiableNavigableMap(map).
        NavigableMap<String,String> mutable = new TreeMap<>();
        mutable.put("product1","Nike");
        mutable.put("product2","Adidas");
        mutable.put("product3","NB");

        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mutable);

        // Mencoba menambah / mengubah data immutable Map (Error).
        //immutable.put("car4","Rush"); Error !!!
        //immutable.put("car1","Brio"); Error !!!
    }
}
