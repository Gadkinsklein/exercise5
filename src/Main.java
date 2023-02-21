import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Please enter your Email");
        String email = input.nextLine();
        System.out.println("What is your Street Name?");
        String streetName = input.nextLine();
        System.out.println("What is your House Number?");
        int houseNumber = input.nextInt();
        System.out.println("What is your zipcode?");
        int zipcode = input.nextInt();

        Person person1 = new Person(name, email);

       /* Book book1 = new Book("Goosebumps","R.L. Stine","Thriller",200);
        System.out.println(book1);
        person1.read(book1);
*/


        System.out.println(person1);
      

    }
}