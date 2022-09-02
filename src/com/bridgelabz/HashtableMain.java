package com.bridgelabz;

import java.util.Hashtable;
import java.util.Map;

public class HashtableMain {
    public static void main(String[] args) {
        System.out.println("Welcome to hashtable program ");
            Hashtable<String, Integer> hashtable = new Hashtable<>();
            String input = "To be or not to be";
            String[] inputArray = input.toLowerCase().split(" ");
            for (String str : inputArray) {
                if (hashtable.containsKey(str)) {
                    hashtable.put(str, hashtable.get(str) + 1);
                } else {
                    hashtable.put(str, 1);
                }
            }
            for (Map.Entry entry : hashtable.entrySet()) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
        }
    }
