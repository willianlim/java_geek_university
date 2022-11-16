package br.com.geekuniversity.section21;

import java.util.LinkedList;
import java.util.List;

public class Program58 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        System.out.println(list.size());

        list.add("Felicity");
        list.add("Angelina");

        list.add(0, "Maria");
        System.out.println(list);
    }
}
