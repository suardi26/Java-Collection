package com.practice;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
    - Spliterator adalah interface yang bisa digunakan untuk melakukan partisi data yang ada di collection.
    - Biasanya ini digunakan ketika kita akan memproses collection dalam jumlah besa, supaya lebih cepat di split menjadi beberapa
      dan diproses secara paralel agar lebih cepat.
    - Penggunaan Spliterator biasanya erat kaitannya dengan Java Thread atau Java Concurrency.
    - Ada banyak method-method yang ada pada interface Spliterator.

*/
public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Suardi", "Daud", "Manda", "Java","Kotlin", "PHP", "Dart", "Golang", "JS", "RDBMS");

        // Data List di salin ke 'spliterator 1' sebanyak 10 element.
        Spliterator<String> spliterator1 = names.spliterator();

        // Membagi 2 data yang ada pada 'spliterator 1' sebanyak 10, sehingga 'spliterator 2' memiliki 5 data begitu juga dengan
        // 'spliterator 1' memiliki 5 data.
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        
        System.out.println("Spliterator 1 : "+spliterator1.estimateSize());
        System.out.println("Spliterator 2 : "+spliterator2.estimateSize()+"\n");

        System.out.println("= = = = = = = = Spliterator 1 = = = = = = = =");
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("\n= = = = = = = = Spliterator 2 = = = = = = = =");
        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println(names);
    }
}
