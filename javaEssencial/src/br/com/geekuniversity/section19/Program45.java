package br.com.geekuniversity.section19;

import java.util.ArrayList;
import java.util.Collections;

public class Program45 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Maria");
        names.add("Felicity");
        names.add("Angelina");
        names.add("Geek");
        names.add("Maria");

//        names.add(44);
//        names.add(true);
//        names.add(12.4);
//        names.add('e');

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }

        Collections.sort(names);

        for (String name: names) {
            System.out.println(name);
        }
    }
}
