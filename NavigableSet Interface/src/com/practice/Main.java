package com.practice;

import java.util.*;

/*
     - Sorted Set Memiliki turunan lagi yaitu NavigableSet.  (Iterable => Collection => Set => SortedSet => NavigableSet).
     - NavigableSet Interface terdapat method-method yang digunakan untuk navigasi pencarian element, seperti mencari element yang
       lebih besar dari, kurang dari, membalikkan urutan set, dll.
     - NavigableSet dan superclass nya memmiliki konkret implementasi classnya yaitu TreeSet, artinya class TreeSet implementasi
       interface NavigableSet dan superclassnya sehingga dapat menggunakan method-method dari interface tersebut.
     - Immutable NavigableSet dengan menggunakan method :
        - Collections.emptyNavigableSet() => Digunakan untuk membuat immutable navigable set kosong.
        - Collections.unmodifiableNavigableSet(Set) => Digunakan untuk mengubah mutable navigable set menjadi immutable.
     - Untuk  dokumentasi lengkapnya seperti method-method yang ada pada NavigableSet Interface
       silahkan kunjungi oracle tentang NavigableSet Interface.
*/
public class Main {
    public static void main(String[] args){

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Suardi","Daud","Manda","Java"));

        System.out.println("= = = = = = = Data Set = = = = = = =");
        System.out.println(Arrays.toString(names.toArray()));

        System.out.println("= = = = = = = Data Set (Descending)= = = = = = =");
        NavigableSet<String> namesDescending = names.descendingSet();
        System.out.println(Arrays.toString(namesDescending.toArray()));

        // Mengambil Data Dari Element paling depan sampai element yang ditentukan 'Java' dengan menggunakan method 'headSet()'
        // dan parameternya yaitu element pembatas 'Java' dan inclusive nya itu apakah pembatas 'Java' masuk ke dalam element
        // yang dipilih, kalau ingin dimasukan maka dapat memasukan true kalau tidak berarti false.
        System.out.println("= = = = = = = Mengambil Data Dari Element paling depan sampai element yang ditentukan 'Java'" +
                " = = = = = = =");
        NavigableSet<String> elementsHead = namesDescending.headSet("Java",true);
        for (var value : elementsHead){
            System.out.println(value);
        }

        // Mengambil Data Dari Element paling belakang sampai element yang ditentukan 'Java' dengan menggunakan method 'headSet()'
        // dan parameternya yaitu element pembatas 'Java' dan inclusive nya itu apakah pembatas 'Java' masuk ke dalam element
        // yang dipilih, kalau ingin dimasukan maka dapat memasukan true kalau tidak berarti false.
        System.out.println("= = = = = = = Mengambil Data Dari Element paling belakang sampai sebelum element yang ditentukan 'Java'" +
                ", jadi element pembatas 'Java' tidak termasuk = = = = = = =");
        NavigableSet<String> elementsTail = namesDescending.tailSet("Java",false);
        for (var value : elementsTail){
            System.out.println(value);
        }
        // Membuat Immutable NavigableSet dengan menggunakan Collections.emptyNavigableSet().
        NavigableSet<String> empty = Collections.emptyNavigableSet();

        // Mengubah mutable NavigableSet menjadi immutable NavigableSet, dengan menggunakan
        // Collections.unmodifiableNavigableSet(Set).
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(namesDescending);

        // Mencoba menambah dan menghapus data immutable NavigableSet (Error).
        // immutable.add("Golang"); Error !!!
        // immutable.remove("Java"); Error !!!
    }
}
