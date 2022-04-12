package com.practice;


import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/*
    - SortedSet Interface adalah Interface turunan dari Set, namun di Sorted elmement-element yang dimasukan kedalam SortedSet akan
      otomatis diurutkan bukan pada saat kita memasukan data namun sesuai dengan Ascending atau Descending ataupun sesuai dengan
      keinginan kita.
    - Jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersebut.
      Contoh class yang implementasi interface Comparable seperti String, Integer, Double, dll.
    - Jika element bukan turunan dari interface Comparable, maka kita bisa menggunakan Comparator untuk memberi tahu SortedSet
      bagaimana cara mengurutkan element-elementnya.
    - Interface SortedSet adalah turunan dari interface Set. (Iterable => Collection => Set => SortedSet).
    - Sorted Set Memiliki turunan lagi yaitu interface NavigableSet.  (Iterable => Collection => Set => SortedSet => NavigableSet).
    - NavigableSet dan superclass nya memmiliki konkret implementasi classnya yaitu TreeSet, artinya class TreeSet implementasi
      interface NavigableSet dan superclassnya sehingga dapat menggunakan method-method dari interface tersebut.

    - Immutable SortedSet dengan menggunakan method :
        - Collections.emptySortedSet() => Digunakan untuk membuat immutable sorted set kosong.
        - Collections.unmodifiableSortedSet(set) => Digunakan untuk mengubah mutable sorted set menjadi immutable.

*/
public class Main {
    public static void main(String[] args) {

        // Melakukan Sorted Asscending atau Descending dengan membuat Comparator pada Class ProductComparator.

        // Misalkan class Product adalah class orang lain yang tidak bisa diubah dan kita hanya menggunakan library dari orang lain.
        // sehingga kita tidak bisa melakukan Sorting pada Class Product karena tidak implementasi Comparable. sehingga kita harus
        // membuat Comparator pada class ProductComparator.

        // Data akan terurut Ascending namun ketika ingin dibalik (Descending) maka dapat menambahkan method 'reversed' dari
        // interface Comparator.
        System.out.println("= = = = =  Sorted Dengan Membuat Comparator = = = = =");
        SortedSet<Product> products = new TreeSet<>(new ProductComparator().reversed());
        products.add(new Product("Rinso"));
        products.add(new Product("Bimoli"));
        products.add(new Product("Antangin"));

        for ( var value : products){
            System.out.println(value.getName());
        }

        // Menggunakan class implementasi dari Comparable misalnya class String.
        System.out.println("= = = = =  Sorted Dengan Menggunkan Class Implement Comparable  (String) = = = = =");
        SortedSet<String> values = new TreeSet<>();
        values.add("Avanza");
        values.add("Brio");
        values.add("Pajero");

        for (var value : values){
            System.out.println(value);
        }

        // Membuat Immutable SortedSet dengan menggunakan Collections.emptySortedSet().
        SortedSet<String> empty = Collections.emptySortedSet();

        // Mengubah mutable SortedSet menjadi immutable SortedSet, dengan menggunakan Collections.unmodifiableSortedSet(Set).
        SortedSet<Product> immutable = Collections.unmodifiableSortedSet(products);

        // Mencoba menambah dan menghapus data immutable SortedSet (Error).
        // immutable.add(new Product("Dettol")); Error !!!
        // immutable.remove(new Product("Dettol")); Error !!!

        // Untuk  dokumentasi lengkapnya seperti method-method yang ada pada SortedSet Interface
        // silahkan kunjungi oracle tentang SortedSet Interface.
    }
}
