package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        // HashMap
        // Keynya adalah String dan valuenya adalah String.
        Map<String,String> hashMap= new HashMap<>();

        // Ketika menggunakan method put maka ketika mengisi nama key yang sama maka akan mengganti nilai dari key tersebut,
        // akan tetapi ketika nama key tersebut baru maka mengisi nilai baru.
        hashMap.put("first-name","Suardi");
        hashMap.put("middle-name","Daud");
        hashMap.put("last-name","Manda");
        hashMap.put("object", "Java");

        hashMap.put("object", "Kotlin");

        System.out.println(hashMap.get("first-name"));
        System.out.println(hashMap.get("middle-name"));
        System.out.println(hashMap.get("last-name"));
        System.out.println(hashMap.get("object"));
    }
}
