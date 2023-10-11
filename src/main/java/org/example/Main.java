package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String string = "Я программист";
        int partSize = 2;
        for (String e : separate(string, partSize)) {
            System.out.println(e);
        }
    }

    public static List<String> separate(String string, int partSize) {
        List<String> parts = new ArrayList<>();
        for (int i = 0; i < string.length(); i += partSize) {
            int end = Math.min(string.length(), i + partSize);
            parts.add(string.substring(i, end));
        }
        return parts;
    }
}