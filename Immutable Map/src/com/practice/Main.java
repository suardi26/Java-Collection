package com.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    - Sama seperti List dan Set, Map pun punya tipe data Immutable artinya tidak bisa diubah.
    - Ada beberapa static method yang digunakan untuk membuat Immutable Map, seperti :
        - Collections.emptyMap() = Membuat immutable Map kosong, biasanya digunakan ketika membuat method dan data Map tidak valid
          maka dapat mengembalikan imutable Map kosong.
        - Collections.singletonMap(key,value) = Membuat immutable Map berisi 1 data (key,value).
        - Collections.unmodifiableMap(map) = Mengubah mutable map menjadi immutable.
        - Map.of(...) = Membuat immutable Map dari beberapa data (key-value).
*/
public class Main {
    public static void main(String[] args){

        // Membuat Immutable Map dengan menggunakan Collections.emptyMap().
        Map<String,String> empty = Collections.emptyMap();

        // Membuat Immutble Map dengan menggunakan Collections.singletonMap(key,value).
        Map<String,String> onlyOne = Collections.singletonMap("Name1","Suardi Duad Manda");

        // Mengubah mutable Map menjadi immutable Map, dengan menggunakan Collections.unmodifiableMap(map).
        Map<String,String> mutable = new HashMap<>();
        mutable.put("product1","Nike");
        mutable.put("product2","Adidas");
        mutable.put("product3","NB");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        // Membuat Immutable Map dengan menggunakan Map.of(...) dengan memasukan satu per satu key & value.
        Map<String, String> immutables = Map.of(
                "car1","Pajero",
                "car2","Fortuner",
                "car3","Avanza"
                // dan seterusnya ...
        );

        // Mencoba menambah / mengubah data immutable Map (Error).
        // immutables.put("car4","Rush"); Error !!!
        // immutables.put("car1","Brio"); Error !!!

        for (var value : immutables.keySet()){
            System.out.println(immutables.get(value));
        }

    }
}
