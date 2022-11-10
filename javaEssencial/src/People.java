/**
 * Class
 */

public class People {
    String name, email;
    int birth_date;

    public People() {

    }

    public People(String name, String email, int birth_date) {
        this.name = name;
        this.email = email;
        this.birth_date = birth_date;
    }

    void print_information() {
        System.out.println("Name: " + this.name);
        System.out.println("E-mail: " + this.email);
        System.out.println("Birth Date: " + this.birth_date);
    }
}
