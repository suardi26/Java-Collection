package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/*
    - Di java 8 ada fitur bernama Default Method, dimana kita bisa menambahkan konkrit method interface.
    - Fitur ini banyak sekali digunakan di Java Collection, karena kita bisa tahu semua collection di Java memiliki kontrak
      interface, sehingga dengan mudah di Java bisa meng-improve kemampuan semua collection hanya dengan menambahkan default method
      di interface collectionnya.

    - Contoh beberapa default method di Collection :
        - iterable.forEach(consumer) digunakan untuk melakukan iterasi seluruh data di collection.
        - List.removeIf(predicate) digunakan untuk menghapus data di Collection menggunakan predicate/kondisi.
        - List.replaceAll(operator) digunakan untuk mengubah selurun data di collection.

    - Contoh beberapa default method di Map :
        - getOrDefault(key, defaultValue) digunakan untuk mengambil data berdasarkan key, jika tidak ada, return defaultValue.
        - forEach(consumer) digunakan untuk melakukan iterasi seluruh data key-value.
        - replaceAll(function) digunakan untuk mengubah seluruh data value.
        - putIfAbsent(key, value) digunakan untuk menyimpan data ke map jika belum ada.
        - remove(key,value) digunakn untuk menghapus data jika key-value nya sama.
        - replace(key, oldValue, newValue) digunakan untuk mengubah key jika new value sama dengan old value.
        - computeIfAbsent(key, function) digunakan untuk mengubah key dengan value hasil function jika belum ada.
        - computeIfPresent(key, function) digunakan untuk mengubah key dengan value hasil function jika sudah ada.
        - dan masih banyak lagi defult method yang dapat digunakan.

    - Ada banyak default method yang digunakan pada Collection dan Map beserta turunannya Untuk dokumentasi lengkapnya
      silahkan kunjungi oracle tentang interface Collection dan Map beserta turunan-turunannya.

*/
public class Main {
    public static void main(String[] args){

        // Collections default method.
        System.out.println("= = = = = = = Collections default method = = = = = = =");
        List<Integer> numbers = new ArrayList<>();
        for (var i = 1; i <= 100;i++){
            numbers.add(i);
        }
        System.out.println(numbers);

        // Menggunakan default method 'replaceAll()'.
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {

                // mengubah tiap data dikalikan 10.
                return integer * 10;
            }
        });
        System.out.println("\n"+numbers+"\n");

        // Menggunakan default method 'forEach()' untuk melakukan perulangan.
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // Menggunakan default method 'removeIf()', menghapus data yang lebih dari 200.
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 200;
            }
        });
        System.out.println("\n"+numbers);

        // Map default method.
        System.out.println("\n= = = = = = = Map default method = = = = = = =");
        Map<String, String> map = new HashMap<>();
        map.put("SuardiK","SuardiV");
        map.put("DaudK","DaudV");
        map.put("MandaK","MandaV");

        // Menggunakan default method 'forEach()' untuk melakukan perulangan.
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println("Key : "+key+", Value : "+value+".");
            }
        });


        // Menggunakan default method 'replaceAll()'.
    }
}
