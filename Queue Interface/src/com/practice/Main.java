package com.practice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
    - Queue adalah implementasi dari struktur data antrian atau FIFO (First In First Out).
    - Interface Queue adalah turunan dari interface Collection. (Iterable => Collection => Queue).
    - Queue memiliki turunan lagi yaitu interface Deque (Iterable => Collection => Queue => Deque).
    - Interface Queue memmiliki konkret implementasi classnya yaitu PriorityQueue.
    - Sedangkan Interface Deque memiliki konkret implementasi classnya yaitu LinkedList & ArrayDeque.
    - Sebenarnya Class LinkedList implement interface List dan juga interface Deque yang merupakan interface turunan dari Queue.
    - ArrayDeque menggunakan Array sebagai implementasi queue nya.
    - LinkedList menggunakan double linked list sebagai implementasi queue nya.
    - PriorityQueue menggunakan array sebagai implementasi queue nya, namun diurutkan menggunakan Comparable atau Comparator
      (Sorting Ascending/Descending).

*/
public class Main {
    public static void main(String[] args) {

        // Membuat antrian data menggunakan Class ArrayDeque.
        System.out.println("= = = = = = = =  ArrayDeque = = = = = = = =");
        Queue<String> queue = new ArrayDeque<>(10);
        queue.add("Google");
        queue.add("Microsoft");
        queue.add("Apple");

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());

        // Membuat antrian data menggunakan Class PriorityQueue Berurut Asc.
        System.out.println("= = = = = = = =  PriorityQueue = = = = = = = =");
        Queue<String> products = new PriorityQueue<>();

        products.add("Samsung");
        products.add("Iphone");
        products.add("Huawey");

        for (String next = products.poll(); next != null; next = products.poll()){
            System.out.println(next);
        }

        System.out.println(products.size());

        // Membuat antrian data menggunakan Class LinkedList Berurut Asc.
        System.out.println("= = = = = = = =  LinkedList = = = = = = = =");
        Queue<String> values = new LinkedList<>();

        values.add("Honda");
        values.add("Yamaha");
        values.add("Ducati");

        for (String next = values.poll(); next != null; next = values.poll()){
            System.out.println(next);
        }

        System.out.println(values.size());

    }
}
