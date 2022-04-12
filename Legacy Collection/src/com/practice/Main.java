package com.practice;

import java.util.*;

/*
    - Collection sudah ada sejak Java versi 1. namun pada saat ini Java Collection semakin berkembang.
    - Sebenarnya ada beberapa legacy (collection jadul), namun jarang sekali digunakan sekarang ini.
    - Legacy Collection :
        - Vector Class
          - Vector Class adalah implementasi dari interface List.
          - Cara Kerja Vector mirip dengan ArraList, yang membedakan adalah semua method di Vector menggunakan keyword Synchroized
            yang artinya thread safe (Ketika ada 2 proses yang mengakses vector/object yang sama maka dia aman artinya data di set
            satu per satu, berbeda dengan ArrayList tidak Synchronized sehingga tidak aman diakses secara bersamaan).
          - Namun problemnya adalah, karena semua method menggunakan keyword synchronized, secara otomatis impactnya ke peformance
            yang menjadi lambat dibandingkan Menggunakan ArrayList.
          - Bagaimana jika kita ingin membuat List yang bisa digunakan di proses paralel?  pada versi java baru, sudah disediakan
            yang lebih canggih untuk itu, oleh karena itu penggunaan vector sudah jarang sekali ditemui.

      - HashTable Class
          - Hashtable adalah implementasi dari Map yang mirip dengan HashMap.
          - Cara Kerja Hashtable mirip dengan HashMap, yang membedakan adalah semua method di Hashtable menggunakan keyword Synchroized
            yang artinya thread safe (Ketika ada 2 proses yang mengakses Hashtable/object yang sama maka dia aman artinya data di set
            satu per satu, berbeda dengan HashMap tidak Synchronized sehingga tidak aman diakses secara bersamaan).
          - Sama seperti Vector, semua method di HashTable memiliki keyword synchronized, sehingga performanya lebih lambat
            dibandingkan HashMap.
          - Jika ingin membuat proses yang paralel dan datanya menggunakan Map,  di versi Java baru sudah tersedia ConcurrentHashMap,
            sehingga penggunaan HashTable sudah jarang ditemui.

      - Stack Class
          - Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out).
          - Namun fitur yang lebih komplit dan konsisten disediakan di Deque, sehingga penggunaan Class Stack sudah jarang ditemui.
*/
public class Main {
    public static void main(String[] args){

        // Membuat Object dari class Vector.
        List<String> vector = new Vector<>();
        vector.add("Suardi");
        vector.add("Daud");
        vector.add("Manda");

        System.out.println("= = = = = = = Vector Class = = = = = = = ");
        for (var value : vector){
            System.out.println(value);
        }

        // Membuat Object dari class HashTable.
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("SuardiK","SuardiV");
        hashTable.put("DaudK","DaudV");
        hashTable.put("MandaK","MandaV");

        System.out.println("= = = = = = = HashTable Class = = = = = = = ");
        for (var value : hashTable.entrySet()){
            System.out.println(value);
        }

        // Membuat Object dari class Stack.
        Stack<String> stack = new Stack<>();
        stack.push("Suardi");
        stack.push("Daud");
        stack.push("Manda");

        System.out.println("= = = = = = = Stack Class = = = = = = = ");
        try{
            for (var value = stack.pop(); value != null; value = stack.pop()){
                System.out.println(value);
            }
        }catch (EmptyStackException exception){
            System.out.println("Errornya adalah : "+exception);
        }
    }
}
