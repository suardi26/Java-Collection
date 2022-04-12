package com.practice;

import java.util.*;

/*
    - Secara default, List di Java baik itu ArrayList maupun LinkedList datanya bersifat mutable (bisa dimodifikasi).
    - Pada Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi,
    - Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
    - Data Listnya yang tidak bisa diubah, bukan reference object elementnya. Misal kita membuat Immutable List berisikan
      data Product, atribut data Product tetap bisa diubah, tapi isi element dari Immutable List tidak bisa diubah lagi,
    - Ini cocok ketika tidak sembarangan code yang dapat mengubah element di List dengan sembarangan.
    - Untuk Melakukan Proteksi terhadap Data List sehingga tidak dapat dimodifikasi maka dapat menggunakan
      method static 'unmodifiableList()' dari Class Collections.
    - Membuat immutable list tidak menggunakan new object namun method method yang telah disediakan.
    - Selain 'unmodifiableList()' terdapat juga beberapa method yang digunakan untuk membuat Immutable List, seperti :

        - Collections.emptyList() = Membuat immutable list kosong, biasanya digunakan ketika membuat method dan data List tidak valid
          maka dapat mengembalikan imutable list kosong.
        - Collections.singletonList(Element) = Membuat immutable list berisi 1 element.
        - Collections.unmodifiableList(List) = Mengubah mutable list menjadi immutable.
        - List.of(Element...) = Membuat immutable list dari element - element.
*/
public class Main {
    public static void main(String[] args) {

        // Membuat Object dari class MutableList
        MutableList mutableList = new MutableList("Unilever");

        mutableList.addProduct("Pepsodent");
        mutableList.addProduct("Sunslik");
        modifDataProduct(mutableList.getProduct());

        System.out.println("= = = = = = = Mutable List = = = = = = =");
        System.out.println(mutableList.getBrand());
        System.out.println(Arrays.toString(mutableList.getProduct().toArray()));

        for (var value : mutableList.getProduct()){
            System.out.println(value);
        }

        // Membuat Object dari class ImmutableList.
        ImmutableList immmutableList = new ImmutableList("Wings Food");

        immmutableList.addProduct("Mie Sedap");
        immmutableList.addProduct("Bimoli");

        System.out.println("= = = = = = = Mutable List = = = = = = =");
        System.out.println(immmutableList.getBrand());
        System.out.println(Arrays.toString(immmutableList.getProduct().toArray()));

        // Modifikasi data Immutable List dari method getProduct() pada class 'ImmmutableList' sehingga mengakibatkan Error.
        // immmutableList.getProduct().set(1,"Tepung Bumbu Sajiku"); Erroor !!!
        // System.out.println(Arrays.toString(immmutableList.getProduct().toArray()));

        // Menambahkan data Immutable List sehingga mengakibatkan Error (Immutable List).
        // modifDataProduct(immmutableList.getProduct()); Erroor !!!
        // System.out.println(Arrays.toString(immmutableList.getProduct().toArray()));

        // Membuat Immutable List dengan menggunakan Collections.EmptyList().
        List<String> empty = Collections.emptyList();

        // Membuat Immutble List dengan menggunakan Collections.singletonList(Element).
        List<String> onlyOne = Collections.singletonList("Rinso");

        // Mengubah mutable list menjadi immutable list, dengan menggunakan Collections.unmodifiableList(List).
        List<String> mutable = new ArrayList<>();
        mutable.add("Dancow");
        mutable.add("Frisian Flag");
        List<String> immutable = Collections.unmodifiableList(mutable);

        // Membuat Immutable List dengan menggunakan List.of(Element...) dengan memasukan satu per satu element immutableList.
        List<String> immutables = List.of("Dettol","Lux","Nuvo");

        // Mencoba menambah dan mengubah data immutable List (Error).
        // immutables.add("Biore"); Error !!!
        // immutables.set(1,"Biore"); Error !!!

    }

    // Misalnya membuat method dengan parameter Object List dengan Generic parameter type dengan nilai String.
    // namun misalnya tidak disengaja menambahkan data pada List sehinnga pada saat menamplilkan data List, terdapat data
    // yang tidak diinginkan pada sebuah List, pada kasus seperti ini diperlukan Immutable List untuk menghindari data
    // dimasukan pada List.

    public static void modifDataProduct(List<String> product){
        product.add("Data !!!!");
    }
}
