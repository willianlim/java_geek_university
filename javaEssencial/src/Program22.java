public class Program22 {
    public static void main(String[] args) {
        int number = 4;
        Product p0;

        Product p1 = new Product();

        System.out.println(p1);

        p1.name = "Notebook";
        p1.price = 2.367f;
        p1.discount = 15.0f;

        System.out.println("======== PRODUCTS ========");
        System.out.println(p1.name);
        System.out.println("R$ " + p1.price);
        System.out.println(p1.discount + "%\n");

        p0 = new Product();
        p0.name = "Pencil Bic";
        p0.price = 2.43f;
        p0.discount = 5;

        System.out.println(p0.name);
        System.out.println("R$ " + p0.price);
        System.out.println(p0.discount + "%\n");

        People people = new People();
        people.name = "Angelina Jolie";
        people.email = "Jolie@gmail.com";
        people.birth_date = 1976;

        System.out.println("======== PEOPLE ========");
        System.out.println("Name: " + people.name);
        System.out.println("Email: " + people.email);
        System.out.println("Birth Date: " + people.birth_date);
    }
}
