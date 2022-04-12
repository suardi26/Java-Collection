package com.practice;

import java.util.Map;

/*
    - Map adalah struktur data collection yang berisikan mapping antara key dan value.
    - Dimana key di map harus unik, tidak boleh duplikat, kalau duplikat maka akan replace data yang ada pada di dalam mapnya,
      dan satu key hanya boleh mapping ke satu value artinya 1 key untuk 1 value, namun valuenya boleh sama atau duplikat.
    - Map sebenarnya mirip dengan array, pada array, keynya adalah index bertipe data (integer), sedangkan di Map, keynya bebas
      sesuai keinginan kita.

    - Interface Map memiliki implementasi classnya yaitu :
        - HashMap
            - HashMap adalah sebuah class implementasi Map yang melakukan distribusi key menggunakan hashCode() function.
            - HashMap sangat bergantung dengan hashCode() function, jadi pastikan kita harus membuat function hashCode seunik
              mungkin, karena jika terlalu banyak nilai hashCode() yang sama, maka pendistrubusian key tidak akan optimal sehingga
              proses get data di Map akan semakin lambat.
            - Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals.

        - WeakHashMap
            - WeakHashMap adalah implemnentasi Map yang mirip dengan HashMap.
            - Yang membedakan adalah WeakHashMap menggunakan weak key, dimana ketika tidak digunakan lagi maka secara otomatis
              data di WeakHashMap akan dihapus (ketika data lama tidak digunakan maka key akan dihapus sehingga valuenya juga
              terhapus).
            - Di java tidak dilakukan maintance memory secara manual tapi akan menjalankan secara regular garbage collections
              (pada saat data-data jarang digunakan bahkan data-data yang tidak lagi digunakan akan dihapus), dan saat terjadi
              garbage Collections bisa memungkinkan data WeakHashMap akan dihapus.
            - WeakHashMap cocok digunakan untuk menyimpan data cache (data sementara di memory).

        - IdentityHashMap
            - IdendtityHashMap adalah implementasi Map sama seperti HashMap, WeakHashMap.
            - Yang membedahkan adalah cara pengecekan kesamaan datanya, tidak menggunakan function equals, namun
              menggunakan operator == (reference equality) yang berarti key sama ketika lokasi di memorinya (address memory) sama,
              namun ketika address memorinya berbeda maka key dianggap berbeda, meskipun value dari key nya sama.

        - LinkedHashMap
            - LinkedHashMap adalah implementasi Map dengan menggunakan double linked list.
            - Data pada LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan dalam linked list sesuai urutan
              kita menyimpan data.
            - Namun perlu diperhatikan, proses get data di LinkedHashMap akan semakin lambat karena harus melakukan iterasi data
              linked list terlebih dahulu.
            - Maka dari itu gunakanlah LinkedHashMap dengan baik bisa digunakan untuk iterasi data Map-nya dibanding mengambil
              datanya berdasarkan key karena akan lambat terutama ketika datanya berada di bagian belakang maka dengan menggunakan
              LinkedHashMap perlu melakukan iterasi dari depan ke belakang sampai data ketemu.

        - EnumHashMap
            - EnumMap adalah implementasi Map dimana keynya adalah enum.
            - Karena data enum sudah pasti unik, oleh karena itu cocok dijadikan key di Map.
            - Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibandingkan menggunakan
              hashCode() method.

*/
public class Main {
    public static void main(String[] args){




        // Untuk  dokumentasi lengkapnya silahkan kunjungi oracle tentang interface Map.
        // dan Informasi dari interface Map dapat dilihat juga pada interface Map.
    }
}
