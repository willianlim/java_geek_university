package br.com.geekuniversity.section21;

import br.com.geekuniversity.section11.Client;

public class Program57 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println(list);

        list._add("Angelina");
        System.out.println(list);

        list._add("Roberto");
        list._add("Felicity");
        System.out.println(list);
        list.removeFromBeginning();
        System.out.println(list);
    }
}
