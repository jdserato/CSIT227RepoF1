package Nov07;

public abstract class Mammal extends Animal{
    static int number_of_mammals = 0;
    public Mammal(String name, int age) {
        super(name, age);
        number_of_mammals++;
    }

    static void print_no_of_mammals() {
        System.out.println("The number of mammals is " + number_of_mammals);
    }
}
