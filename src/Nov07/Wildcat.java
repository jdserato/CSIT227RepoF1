package Nov07;

public class Wildcat extends Cat {
    public Wildcat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("RAWR");
    }
}
