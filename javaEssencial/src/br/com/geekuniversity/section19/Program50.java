package br.com.geekuniversity.section19;

import java.util.*;

public class Program50 {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<Integer, String>();

        people.put(21, "Felicity Jones");
        people.put(31, "Maria Antonieta");
        people.put(41, "Angelina Jolie");

        System.out.println("Keys: " + people.keySet());
        System.out.println("Values: " + people.values());
        System.out.println("Associations: " + people.entrySet());
        System.out.println();

        // Iterate through the key collection
        // Form 1
        people.keySet().forEach(age -> {
            System.out.println(people.get(age));
        });
        System.out.println();

        // Form 2
        Set<Integer> keys = people.keySet();
        for (Integer age: keys) {
            System.out.println(people.get(age));
        }
        System.out.println();

        // Iterate through the collection of values
        // Form 1
        Collection<String> values = people.values();
        for (String name: values) {
            System.out.println(name);
        }
        System.out.println();

        // Form 2
        people.values().forEach(name -> {
            System.out.println(name);
        });
        System.out.println();

        // Iterate through the collection of values
        // Form 1
        Set<Map.Entry<Integer, String>> associations = people.entrySet();
        for (Map.Entry<Integer, String> association: associations) {
            System.out.println(association.getKey() + " - " + association.getValue());
        }
        System.out.println();

        // Form 2
        people.entrySet().forEach(association -> {
            System.out.println(association.getKey() + " - " + association.getValue());
        });
        System.out.println();

        people.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });
    }
}
