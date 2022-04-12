package com.practice;

import java.util.*;

/*
    - Set Interface adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh ada data yang duplicate.
    - Set tidak memiliki index seperti di List, Maka dari itu tidak ada jaminan data yang ada di Set itu akan terurut sesuai dengan
      waktu kita memasukan data ke Set.
    - Set tidak memiliki method baru, jadi hanya menggunakan method yang ada pada interface parentnya yaitu Iterable dan Collection.
    - Karena tidak memiliki index, untuk mengambil data di Set,  kita harus melakukan iterasi satu per satu.
    - Interface Set adalah turunan dari interface Collection. (Iterable => Collection => Set).
    - Class yang implementasi interface Set : EnumSet, HashSet, LinkedHashSet. dimana Class LinkedHashSet adalah turunan dari
      Class HashSet.
    - EnumSet adalah Collections atau struktur data yang digunakan Khusus untuk Enum, ketika kita menggunakan Enum dan bersifat unik
      maka kita menggunkan class EnumSet.
    - EnumSet adalah Set yang elemen datanya harus Enum, Karena data Enum itu unique, sehingga sangat cocok menggunakan Set dibanding
      List.
    - Di Belakang HashSet dan LinkedHashSet sebenarnya sama-sama ada hash table, dimana data disimpan dalam sebuah hash table dengan
      mengkalkulasi hashCode() function.
    - Perbedaan HashSet dan LinkedHashSet adalah kalau HashSet tidak menjamin data terurut sesuai dengan waktu kita menambahkan data,
      sedangkan LinkedHashSet menjamin data terurut sesuai dengan waktu kita menambahkan data.
    - Urutan data LinkedHashSet bisa dijaga karena dibelakangnya menggunakan double linked list.
    - Jadi pada saat ingin membuat data yang birisi data yang duplikat dapat menggunakan List sedangkan Set digunakan pada saat
      ingin membuat data namun data tersebut tidak ada yang duplikat atau unique.
*/
public class Main {
    public static void main(String[] args){

        System.out.println("= = = = = = =  HashSet = = = = = = =");
        // Membuat Object dari class HashSet.
        Set<String> Cars = new HashSet<>();
        Cars.add("Pajero");
        Cars.add("Avanza");
        Cars.add("Creta");

        // Mencoba memasukan data yang duplikat.
        Cars.add("Pajero");
        Cars.add("Avanza");
        Cars.add("Creta");

        // Datanya cuma 3 saja dikarenakan pada interface Set tidak bisa mengandung data yang duplicate, dan datanya
        // tidak dijamin terurut sesuai waktu dimasukan pada Object HashSet.
        for(var value:Cars){
            System.out.println(value);
        }

        System.out.println("= = = = = = =  LinkedHashSet = = = = = = =");
        // Membuat Object dari class LinkedHashSet.
        Set<String> motorcycle = new LinkedHashSet<>();
        motorcycle.add("Supra X");
        motorcycle.add("Jupiter MX");
        motorcycle.add("Beat");

        // Mencoba memasukan data yang duplikat.
        motorcycle.add("Supra X");
        motorcycle.add("Jupiter MX");
        motorcycle.add("Beat");

        // Datanya cuma 3 saja dikarenakan pada interface Set tidak bisa mengandung data yang duplicate, dan datanya
        // dijamin terurut sesuai waktu dimasukan pada Object LinkedHashSet.
        for(var value:motorcycle){
            System.out.println(value);
        }

        System.out.println("= = = = = = =  EnumSet = = = = = = =");

        // Membuat Object dari class EnumSet dengan memasukan Generic parameter type dari Enum 'EnumSetEx'.
        // Ketika ingin memasukan semua field dari class 'EnumSetEx' dapat menggunakan Method static 'allOf' dari Class 'EnumSet'.

        System.out.println("= = = = = = =  Menggunakan Method static 'allOf' dari Class 'EnumSet'. = = = = = = =");
        Set<EnumSetEx> gender = EnumSet.allOf(EnumSetEx.class);

        for (var value : gender){
            System.out.println(value);
        }

        // Namun Ketika ingin memasukan sebagian field dari class 'EnumSetEx' dapat menggunakan Method static 'of'
        // dari Class 'EnumSet'.
        System.out.println("= = = = = = =  Menggunakan Method static 'of' dari Class 'EnumSet'. = = = = = = =");

        // Ketika memasukan data yang sama (duplikat) maka data yang keluar cuma 1.
        EnumSet<EnumSetEx> g = EnumSet.of(EnumSetEx.MALE, EnumSetEx.MALE);

        for (var value : g){
            System.out.println(value);
        }

        // Untuk mendapatkan semua nilai Enum dari 'EnumSetEx'.
        System.out.println("= = = = = = =  Untuk mendapatkan semua nilai Enum dari 'EnumSetEx' = = = = = = =");
        EnumSetEx[] values = EnumSetEx.values();
        System.out.println(Arrays.toString(values));
    }
}
