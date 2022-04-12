package com.practice;

import java.util.Queue;

/*
    - Struktur data collection di java selalu berkembang, namun biasanya algoritma dasarnya selalu sama antar jenis Collection.
    - Hampir semua interface collection di Java sudah disediakan abstract classnya sebagai dasar algoritmanya, dan hampir semua
      implementasi class konkritnya selalu extends abstract class collection
    - Hal ini mempermudah kita, jika ingin membuat collection manual, kita tidak perlu membuat dari awal, kita bisa menggunakan
      abstract class yang sudah disediakan.
    - Berikut contoh-contoh Abstract class dari interface collections dan turunannya :
        - AbstractCollection untuk interface Collection.
        - AbstractList untuk interface List.
        - AbstractMap untuk interface Map.
        - AbstractQueue untuk interface Queue.
        - AbstractSet untuk interface Set.

    - interface collection dan turunannya serta Map bisa saja di implementasi namun harus implementasi semua methodnya
      maka dari itu sebaiknya menggunakan abstract classnya.
*/
public class Main {
    public static void main(String[] args){

        Queue<String> queue = new SingleQueue<>();

        System.out.println("Data 1 apakah diterima : "+queue.offer("Suardi"));
        System.out.println("Data 2 apakah diterima : "+queue.offer("Daud"));
        System.out.println("Data 3 apakah diterima : "+queue.offer("Manda"));
        System.out.println("Jumlah Data : "+queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
