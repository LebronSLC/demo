package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.forEach(System.out::println);

    }
}
