package com.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
    - Interface List adalah turunan dari interface Collection. (Iterable => Collection => List).
    - List adalah struktur data collection yang memiliki sifat sebagai berikut :
      - Element di list bisa duplikat, artinya bisa memasukan data yang sama.
      - Data list berurut sesuai dengan posisi kita memasukan data.
      - List memiliki index seperti array. Sehingga kita bisa menggunakan nomor index untuk mendapatkan element di List.
      - List seperti Array namun yang membedakan yaitu List jumlah nilainya dinamis dapat berubah-ubah sesuai
        dengan kebutuhan sedangkan array jumlah nilainya tetap sesuai pada saat pembuatan object atau pada saat pemberian
        nilai pertama (Assignment).
    - Ada 2 class yang implementasi List yaitu Class ArrayList dan Class LinkedList.
    - Array List :
        - ArrayList adalah implementasi dari List menggunakan array.
        - Default kapasitas array di ArrayList adalah 10.
        - Akan tetapi pada saat kita memasukan data dan Array sudah penuh, maka secara otomatis ArrayList akan
          membuat array baru dan memasukan nilai lama ke array baru dengan kapasitas baru (ukuran kapasitas lama + data baru).
          dan akan berulang terus menerus sampai data selesai ditambahkan.
    - LinkedList Class :
        - LinkedList adalah implementasi List dengan struktur data Double Linked List.
        - Double Linked List adalah data disimpan dalam bentuk node yang terurut linear dengan 2 pointer yaitu next dan
          preveous dan ketika mencapai data terakhir maka nextnya adalah null dan prev data pertama adalah null.
        - LinkedList tidak seperti ArrayList, LinkedList tidak menggunakan array namun mirip seperti node.
    - Beberapa Perbedaan ArrayList dengan LinkedList :

        Operasi     ArrayList                                       LinkedList

        - add       Cepat jika kapasitas Array Masih cukup,         cepat karena hanya menambah node akhir.
                    namun lambat jika sudah penuh karena harus
                    menyalin data lama ke array baru.

        - get       Cepat karena tinggal menggunakan                Lambat karena harus di cek dari node awal sampai ketemu
                    index array                                     data yang dicari.

        - set       Cepat karena tinggal menggunakan index          Lambat karena harus di cek dari node awal sampai ketemu
                    array.                                          data yang dicari.

        - remove    Lambat karena harus menggeser data              Cepat karena tinggal ubah prev dan next di node sebelah
                    dibelakang index yang akan dihapus ki kiri.     yang dihapus.
                    jadi semakin ke kiri data yang dihapus maka
                    akan semakin lambat karena data semakin
                    banyak yang digeser.

*/
public class Main {
    public static void main(String[] args) {

        // Membuat ArrayList.
        // Initial Capacity defaultnya 10 artinya ketika datanya mencapai 10 maka akan membuat array dan mengcopy data array lama
        // ke array baru, sehinnga nilai initialCapacity itu dapat disesuaikan dengan data yang diperlukan misalnya data yang
        // akan dimasukan sekitar 40 maka nilai initialCapacity adalah 50 sehingga tidak lambat dikarenakan ketika jumlah
        // initialCapacity penuh dan menambahkan data lagi maka akan lambat kerena akan menyalin data lama ke array baru.
        System.out.println("= = = = = = = ArrayList = = = = = = =");
        List<String> names = new ArrayList<>(100);
        names.add("Suardi");
        names.add("Daud");
        names.add("Manda");
        names.add("Java");
        names.add("Kotlin");

        names.add(3,"Dev");
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(Arrays.toString(names.toArray()));

        names.set(5,"Dart");
        System.out.println(Arrays.toString(names.toArray()));

        System.out.println("Nilai Index ke-4 adalah "+names.get(4));

        for (var name : names){
            System.out.println(name);
        }

        // Membuat LinkedList
        System.out.println("= = = = = = = LinkedList = = = = = = =");
        List<String> os = new LinkedList<>();
        os.add("Windows");
        os.add("Macintosh");

        os.add(0,"Centos");
        System.out.println("Nilai Index ke-0 adalah "+os.get(0));
        System.out.println(Arrays.toString(os.toArray()));

        os.set(0,"Debian");
        System.out.println(Arrays.toString(os.toArray()));

        for (var value : os){
            System.out.println(value);
        }

        // Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang interface List, ataupun 2 class yang implementasi
        // interface List yaitu class ArrayList dan LinkedList.
    }
}
