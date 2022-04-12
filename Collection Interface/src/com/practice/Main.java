package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
    - Selain Iterable, parent class semua collection di java adalah Collection.
    - Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential.
    - Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, mengubah, menghapus serta
      melakukan cek isi data Collection.
    - Tidak ada direct implementation untuk Collection, karena collection nanti akan dibagi lagi menjadi List, Set, Queue.
    - Collection Interface adalah turunan dari interface Iterable.(Iterable => Collection).

    - Untuk mengkonversi Collection menjadi array dapat menggunakan Method berikut :
        - Object[] toArray() digunakan untuk mengubah collection menjadi array.
        - T[] toArray(T[]) mengubah collection menjadi array T (sesuai dengan tipe data yang diinginkan).

*/
public class Main {
    public static void main(String[] args) {

        // Interface Collection dengan implementasi List.
        // Dimana class ArrayList men-implement interface List dan interface List turunan dari interface Collection.
        // Menambahkan Data pada ArrayList.
        Collection<String> names = new ArrayList<>();
        names.add("Suardi");
        names.add("Daud");
        names.add("Manda");
        names.addAll(List.of("Java","Kotlin","Dart"));
        names.addAll(List.of("Golang","Ruby","PHP"));
        for (var name : names ) {
            System.out.println(name);
        }

        // Menghapus Data pada ArrayList.
        System.out.println("= = = = = = = Remove = = = = = = =");
        names.remove("Dart");
        names.removeAll(List.of("Golang","Ruby","PHP"));
        for (var name : names ) {
            System.out.println(name);
        }
        // ketika menggunakan method 'remove()' maka akan menghasilkan return value boolean, sehingga pada saat
        // menghapus data yang ada pada ArrayList maka akan maka return valuenya 'true' sedangkan ketika menghapus
        // data yang tidak ada pada ArrayList dengan kata lain menghapus data gagal maka return valuenya adalah 'false'.

        // Melakukan pengecekan apakah suatu data ada pada ArrayList.
        System.out.println("= = = = = = = Contains = = = = = = =");
        System.out.println(
                "Apakah Data 'Suardi' ada pada ArrayList : "+names.contains("Suardi")
        );
        System.out.println(
                "Apakah Data 'Suardi' & 'JavaScript' ada pada ArrayList : "+names.containsAll(List.of("Suardi","JavaScript"))
        );
        System.out.println(
                "Apakah Data 'Java' & 'Kotlin' ada pada ArrayList : "+names.containsAll(List.of("Java","Kotlin "))
        );

        // Melakukan pengecekan jumlah data pada ArrayList.
        System.out.println("= = = = = = = Size = = = = = = =");
        for (var name : names ) {
            System.out.println(name);
        }
        System.out.println(
                "Berapa jumlah Data pada ArrayList : "+names.size()
        );

        // Mengkonversi Collection menjadi array dengan menggunakan method Object[] toArray().
        System.out.println("\n= = = = = = = Mengkonversi Collection menjadi array " +
                "dengan menggunakan method Object[] toArray() = = = = = = =");
        List<String> products = List.of("Antangin", "Dancow","Nutrisari");
        Object[] objects = products.toArray();
        System.out.println(Arrays.toString(objects));

        // Mengkonversi Collection menjadi array dengan menggunakan method T[] toArray(T[])
        // (sesuai dengan tipe data yang diinginkan).
        System.out.println("\n= = = = = = = Mengkonversi Collection menjadi array dengan menggunakan " +
                "method T[] toArray(T[]) (sesuai dengan tipe data yang diinginkan) = = = = = = =");
        String[] strings = products.toArray(new String[]{});
        System.out.println(Arrays.toString(strings));

        // Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang interface Collection.
        // dan Informasi dari interface Collection dapat dilihat juga pada interface Collection.
    }
}
