package br.com.geekuniversity.section12;

public class Program28 {
    public static void main(String[] args) {
        People people1 = new People("Pedro da Silva", 1987, "pedro@gmail.com");
        System.out.println(people1.getName());
        System.out.println(people1);
        System.out.println();

        Student student1 = new Student("Vanessa da Silva", 2001, "vanessa@gmail.com", "123456");
        System.out.println(student1.getName());
        System.out.println(student1);
        System.out.println();

        Teacher teacher1 = new Teacher("Augusto da Silva", 1976, "augusto@gmail.com", "ABC987");
        System.out.println(teacher1.getName());
        System.out.println(teacher1);
        System.out.println();
    }
}
