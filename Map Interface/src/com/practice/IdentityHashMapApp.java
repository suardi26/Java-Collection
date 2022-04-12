package com.practice;

import java.sql.SQLOutput;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        String key1 = "product.101";

        String string1 = "product";
        String string2 = "101";

        String key2 = string1+"."+string2;

        Map<String,String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, "SUARDI DAUD MANDA");
        identityHashMap.put(key2, "SUARDI DAUD MANDA");

        // 'key1' dan 'key2' sama maka seharusnya menimpa data 'key1' dan jumlah data seharusnya 1. namun
        // pada class 'IdentityHashMap' yang menjadi acuan adalah nilai address memory dari key, ketika address memory key sama
        // maka key dianggap sama tapi ketika address memory berbeda maka key dianggap berbeda, meskipun value dari key nya sama.
        System.out.println("Nilai dari 'key1' adalah "+key1);
        System.out.println("Adderess Memory 'key1' adalah "+System.identityHashCode(key1));
        System.out.println();
        System.out.println("Nilai dari 'key2' adalah "+key2);
        System.out.println("Adderess Memory 'key2' adalah "+System.identityHashCode(key2));
        System.out.println();
        System.out.println("'key1' di compare dengan 'key2' menggunakan method equals (Membandingkan value) : "+key1.equals(key2));
        System.out.println("'key1' di compare dengan 'key2' menggunakan '=='(Membandingkan address memory/reference equality)" +
                " : "+(key1 == key2));
        System.out.println();
        System.out.println("Jumlah Data : "+identityHashMap.size());
    }

}
