package com.practice;

import java.util.Deque;
import java.util.LinkedList;

/*
    - Deque adalah singkatan dari double ended queue, artinya queue yang bisa beroprasi dari depan atau belakang.
    - Jika pada queue, operasi yang didukung ada FIFO, namun pada deque, tidak hanya FIFO misalnya pada kasus antrian,
      namun juga mendukung LIFO (Last In First Out) contohnya pada stack (tumpukan) dimana yang terakhir di masukan akan
      akan dikeluarkan terlebih dahulu.
    - Jadi Kesimpulannya adalah deque adalah implementasi struktur data antrian (Queue) dan tumpukan (Stack).
    - Interface Deque adalah turunan dari interface Queue. (Iterable => Collection => Queue => Deque).
    - Interface Deque memiliki konkret implementasi classnya yaitu LinkedList & ArrayDeque.
*/
public class Main {
    public static void main(String[] args) {

        // Membuat Object dari class LinkedList dan variabel referancenya dari interface Deque.
        Deque <String> deque1 = new LinkedList<>();
        Deque <String> deque2 = new LinkedList<>();

        // Memasukan data dari depan.
        deque1.offerFirst("Suardi");
        deque1.offerFirst("Daud");
        deque1.offerFirst("Manda");
        // jadi urutannya Manda-Daud-Suardi

        // Mengambil Data dari Depan.
        System.out.println(deque1.pollFirst());
        System.out.println(deque1.pollFirst());
        System.out.println(deque1.pollFirst());
        System.out.println("Jumlah Data :  " +deque1.size());

        System.out.println("====================================");
        // Memasukan data dari Belakang.
        deque2.offerLast("Suardi");
        deque2.offerLast("Daud");
        deque2.offerLast("Manda");
        // jadi urutannya Suardi-Daud-Manda

        // Mengambil Data dari Belakang maka mirip seperti tumpukan (stack).
        System.out.println(deque2.pollLast());
        System.out.println(deque2.pollLast());
        System.out.println(deque2.pollLast());
        System.out.println("Jumlah Data :  " +deque2.size());

        System.out.println("==================== Queue (Antrian) ====================");
        Deque<String> queue = new LinkedList<>();

        // Memasukan data dari Belakang.
        queue.offerLast("Suardi");
        queue.offerLast("Daud");
        queue.offerLast("Manda");

        // Mengambil Data dari Depan (FIFO)  maka mirip seperti Antrian (Queue).
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.size());

        System.out.println("==================== Stack (Tumpukan) ====================");
        Deque<String> stack = new LinkedList<>();

        // Memasukan data dari Belakang.
        stack.offerLast("Suardi");
        stack.offerLast("Daud");
        stack.offerLast("Manda");

        // Mengambil Data dari Belakang (LIFO) maka mirip seperti Stack (Tumpukan).
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.size());

    }
}
