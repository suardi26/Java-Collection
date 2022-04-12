package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    - Sorting atau pengurutan adalah algoritma yang sudah biasa kita buat.
    - Di java Collection juga disediakan cara untuk melakukan pengurutan, jadi tidak perlu melakukan pengurutan secara manual.
    - yang bisa di sorting adalah List, untuk Set, Queue, Deque dan Map cara kerjanya sudah Khusus misalnya pada Map terdapat
      interface turunannya yaitu interface SortedMap yang dilakukan untuk melakukan sorting, jadi pengurutan hanya
      bisa dilakukan di List.

    - Method yang digunakan untuk Sorting pada List.
        - Collections.sort(list) = Mengurutkan data List dengan Comparable bawaan Seperti (String, Integer, Double, dll).
        - Collections.sort(list, comparator) = Mengurutkan List dengan Comparator.
    - Kedua method tersebut merupakan method void tanpa return value oleh sebab itu tidak membuat List baru namun
      mengubah urutan List yang sudah ada ke Ascending ataupun Descending.

*/
public class Main {

    public static void main(String[] args){

        // Sorting pada List dengan Comparable bawaan (String yang implementasi Interface Comparable).
        System.out.println("========== Sorting List dengan Comparable bawaan String (Asc) ==========");
        List<String> stringList = new ArrayList();
        stringList.addAll(List.of("Devi","Citra","Budi"));
        stringList.add("Anton");
        Collections.sort(stringList);
        System.out.println(stringList);

        System.out.println();

        // Sorting pada List dengan mengurutkan List dengan Comparator yang dibuat.
        System.out.println("========== Sorting List dengan Comparator yang dibuat (Desc) ==========");
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(stringList);


    }
}
