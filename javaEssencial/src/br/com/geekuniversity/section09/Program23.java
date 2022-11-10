package br.com.geekuniversity.section09;

public class Program23 {
    public static void main(String[] args) {
        People people1 = new People();

        people1.name = "Felicity Jones";
        people1.email = "felicity@gmail.com";
        people1.birth_date = 1986;
        people1.print_information();

        System.out.println();

        People people2 = new People("Angelina Jolie", "angenlina@gmail.com", 1976);
        people2.print_information();
    }
}
