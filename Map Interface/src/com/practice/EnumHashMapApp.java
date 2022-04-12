package com.practice;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

    public static enum Level{
        PLATINUM,
        MASTERCLASS,
        VIP

    }
    public static void main(String[] args) {

        Map<Level,String> enumHashMap = new EnumMap<Level, String>(Level.class);
        enumHashMap.put(Level.PLATINUM,"Suardi");
        enumHashMap.put(Level.MASTERCLASS,"Daud");
        enumHashMap.put(Level.VIP,"Manda");

        for (var value : enumHashMap.keySet()){
            System.out.println(enumHashMap.get(value));
        }
    }
}
