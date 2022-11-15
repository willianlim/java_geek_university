package br.com.geekuniversity.section21;

public class Program56 {
    public static void main(String[] args) {
        Vector list = new Vector();
        for (int i = 0; i < 300; i++) {
            Student student = new Student("Maria " + i);
            list.add(student);
        }
        System.out.println(list);
        System.out.println(list.size_());
    }
}
