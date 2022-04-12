package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    - Collections adalah class yang berisikan utility static method untuk memanipulasi Java Collections, method-method tersebut
      seperti yang digunakan untuk membuat immutable collection, sorting, binarySearch, dll.
    - Ada banyak static method yang ada pada Class Collections, Untuk dokumentasi lengkapnya silahkan kunjungi oracle
      tentang Class Collections atau dapat membuka Class Collections pada IDE maka terdapat dokumentasi terkait method-method
      yang ada pada Class Collections.
    - Ada beberapa method pada Class Collections yang biasa digunakan :
        - void copy(listTo, listFrom) = digunakan untuk menyalin semua data dari listFrom ke listTo.
        - int frequency(collection, object) = mengambil beberapa banyak element yang sama dalam sebuah collection.
        - max(collection) dan max(collection, comparator) = mengambil element paling tinggi di list.
        - min(collection) dan min(collection, comparator) = mengabil element paling kecil di list.
        - void reverse(list) = membalikkan seluruh elementdi list.
        - void shuffle(list) = mengacak posisi element di list.
        - void swap(list, from, to) = menukar posisi dari 'from' ke 'to' di list.
        - dan masih banyak method-method yang ada pada Class Collections...
*/
public class Main {
    public static void main(String[] args){

        List<String> products = new ArrayList<>();
        products.addAll(List.of("Bimoli","Antangin","Energen","Dancow","Cha-Cha"));

        System.out.println("\n= = = = = = = = Data List = = = = = = = =");
        System.out.println(products);

        // Sorting data List menggunakan comparable dari String.
        System.out.println("\n= = = = = = = = Sort Data List = = = = = = = =");
        Collections.sort(products);
        System.out.println(products);

        // Menggunakan method reverse untuk membalikan posisi element dari belakang ke depan.
        System.out.println("\n= = = = = = = =  Reverse Data List = = = = = = = =");
        Collections.reverse(products);
        System.out.println(products);

        // Menggunakan method shuffle untuk mengacak posisi element pada List.
        System.out.println("\n= = = = = = = =  Shuffle Data List = = = = = = = =");
        Collections.shuffle(products);
        System.out.println(products);
    }
}
