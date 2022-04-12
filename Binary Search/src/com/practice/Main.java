package com.practice;

import java.util.*;

/*
    -  Secara default List di java memiliki fitur search atau get data, namun implementasinya menggunakan sequential search,
       artinya data akan di cek satu per satu dari awal hingga akhir, sehingga dapat mengakibatkan ketika mencari data paling
       belakang akan lambat.

    - Salah satu algoritma pencarian data yang populer adalah binary search, namun binary search hanya bisa dilakukan jika datanya
      telah di sorting atau diurut.

    - Di java Collection sudah ada implementasi binary search, sehingga kita tidak perlu membuatnya secara manual.

    - Konsep Binary Search adalah membagi data menjadi 2, misalnya mencari data ke-20 dari 100 data maka 100 data tersebut dibagi 2,
      dan mimilih apakah data ke-20 ada di bagian sebelah (1-50) atau dibagian sebelah lainnnya (51-100). dan ketika data ke-20
      berada dibagian sebelah (1-50) maka bagian yang satunya di buang, dan data yang telah dibagi 2 tadi (1-50)
      akan dibagi 2 lagi, begitu seterusnya sampai datanya ditemukan, sehingga Binary Search lebih cepat dan konsisten dari
      sequential search yang bisa saja cepat ketika data yang dicari berada di depan namun ketika data yang dicari berada dibelakang
      maka akan sangat lambat.

    - Method yang digunakan untuk Binary Search pada List.
        - Collections.binarySearch(list, value) = Mencari data pada List Menggunakan binary search.
        - Collections.binarySearch(list, value, comparator) = Mencari data pada List Menggunakan binary search dengan bantuan comparator.
    - Kedua method tersebut mengembalikan nilai (return value) yaitu index dari value yang dicari.

*/
public class Main {
    public static void main(String[] args){

        List<Integer> dataList = new ArrayList<>(1000);

        for (var value = 1; value <= 1000; value++){
            dataList.add(value);
        }

        // Melakukan BinarySearch pada List dengan Comparable bawaan (Integer yang implementasi Interface Comparable).
        int index = Collections.binarySearch(dataList,200);
        System.out.println("= = = = = = = = = Melakukan BinarySearch Pada List dengan Comparable bawaan (Integer) = = = = = = = = =");
        System.out.println("Nilai 200 pada index ke : "+index);

        System.out.println();

        // Melakukan BinarySearch pada List dengan Comparator yang dibuat.
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int index2 = Collections.binarySearch(dataList,500, comparator);
        System.out.println("= = = = = = = = = Melakukan BinarySearch Pada List dengan Comparator yang dibuat = = = = = = = = =");
        System.out.println("Nilai 500 pada index ke : "+index2);
    }
}
