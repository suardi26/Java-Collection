package com.practice;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        // Mengurutkan nama secara Ascending.
        return o1.getName().compareTo(o2.getName());

        // Mengurutkan nama secara Descending.
        // return o2.getName().CompareTo(o1.getName());
    }

}
