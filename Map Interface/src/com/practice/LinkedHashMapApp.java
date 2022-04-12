package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {

    public static void main(String[] args) {

        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name1","Suardi");
        linkedHashMap.put("name2","Daud");
        linkedHashMap.put("name3","Manda");

        System.out.println("+++++++++++++++ daftar key LinkedHashMap +++++++++++++++");
        Set<String> keys = linkedHashMap.keySet();
        for(var value : keys){
            System.out.println(value);
        }


        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("name1","Suardi");
        hashMap.put("name2","Daud");
        hashMap.put("name3","Manda");

        System.out.println("+++++++++++++++ daftar key HashMap +++++++++++++++");
        Set<String> keys1 = hashMap.keySet();
        for(var value : keys1){
            System.out.println(value);
        }
        // jadi LinkedHashMap akan mengambil key dan mengurutkannya dari urutan masuk sedangkan HashMap akan mengambil key
        // namun tidak mengurutkan sesuai urutan masuk keynya dikarenakan HashMap melakukan distribusi key menggunakan
        // hashCode() function.
    }
}
