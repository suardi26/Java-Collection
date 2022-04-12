package com.practice;

import java.util.Iterator;
import java.util.List;

/*
    - Iterable adalah parent untuk semua collection di java, kecuali bagian lain yaitu map.
    - Iterable sangat sederhana, hanya digunakan agar mendukung for-each loop.
    - Iterable dilakukan untuk mengambil sekumpulan data dengan melakukan perulangan (Iterasi) secara berurutan (sequential).
    - Karena semua collection implement iterable kecuali bagian lain yaitu map, secara otomatis maka semua collection
      kecuali bagian map di java mendukung perulangan for-each, jadi bukan cuma Array.
    - Sebenarnya for-each di Iterable bisa terjadi karena ada method 'iterator()' yang mengembalikan object Iterator.
    - Iterator adalah interface yang mendefenisikan cara kita mengakses element di collection secara sequential.
    - For-each hadir sejak Java 5, sebelum java 5 untuk melakukan iterasi collection, biasanya dilakukan manual
      menggunakan Iterator Object.
*/
public class Main {

    public static void main(String[] args) {

        System.out.println("+ + + + + Iterable + + + + +");
        Iterable<String> names = List.of("Suardi","Daud","Manda");

        for (var name : names){
            System.out.println(name);
        }

        System.out.println("+ + + + + Iterator + + + + +");
        Iterator<String> stringIterator = names.iterator();
        while(stringIterator.hasNext()){
            String name = stringIterator.next();
            System.out.println(name);
        }
    }
}
