package br.com.geekuniversity.section19;

import java.util.ArrayList;
import java.util.Collections;

public class Program46 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(42);
        numbers.add(24);
        numbers.add(12);
        numbers.add(2);
        numbers.add(91);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
