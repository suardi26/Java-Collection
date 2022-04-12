package com.practice;

/*
    - Sama seperti List, Set pun memmiliki tipe data immutable seperti Immutable Set.
    - Dan cara pembuatan immutable Set mirip dengan pembuatan immutable List dengan menggunakan static method yang telah
      disediakan oleh java.
    - Method-method tersebut adalah :
        - Collections.emptySet() = Membuat immutable Set kosong, biasanya digunakan ketika membuat method dan data Set tidak valid
          maka dapat mengembalikan imumtable Set kosong.
        - Collections.singleton(Element) = Membuat immutable Set berisi 1 element.
        - Collections.unmodifiableSet(Set) = Mengubah mutable Set menjadi immutable.
        - Set.of(Element...) = Membuat immutable Set dari element - element.

*/

import java.util.*;

public class Main {

    public static void main(String[] args){

        // Membuat Immutable Set dengan menggunakan Collections.EmptySet().
        Set<String> empty = Collections.emptySet();
        System.out.println(Arrays.toString(empty.toArray()));

        // Membuat Immutable Set dengan menggunakan Collections.singleton(Element).
        Set<String> onlyOne = Collections.singleton("Rinso");
        System.out.println(Arrays.toString(onlyOne.toArray()));

        // Mengubah mutable Set menjadi immutable Set, dengan menggunakan Collections.unmodifiableSet(Set).
        Set<String> mutable = new HashSet<>();
        mutable.add("Lenovo");
        mutable.add("Asus");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        // Membuat Immutable Set dengan menggunakan Set.of(Element...) dengan memasukan satu per satu element immutable Set.
        Set<String> immutables = Set.of("Samsung","Oppo","Xioami");

        // Mencoba menambah dan menghapus data immutable Set (Error).
        // immutables.add("Oppo"); Error !!!
        // immutables.remove("Oppo"); Error !!!

    }
}
