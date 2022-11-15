package br.com.geekuniversity.section21;

public class Program55 {
    public static void main(String[] args) {
        Student student1 = new Student("Angelina");
        Student student2 = new Student("Felicity");

        Vector list = new Vector();

        System.out.println("Total students: " + list.size_());

        list.add(student1);
        System.out.println("Total students: " + list.size_());

        list.add(student2);
        System.out.println("Total students: " + list.size_());

        System.out.println(list);
        System.out.println(list.contain(student1));

        try {
            System.out.println(list.take(101));
        } catch (IllegalArgumentException e) {
            System.out.println("The student at position 101 does not exist.");
            System.out.println(e.getMessage());
        }

        Student student3 = new Student("Maria");

        try {
            list.add(101,  student3);
        } catch (IllegalArgumentException e) {
            System.out.println("Position 101 is invalid.");
        }

        list.remove(0);
        System.out.println(list);
    }
}
