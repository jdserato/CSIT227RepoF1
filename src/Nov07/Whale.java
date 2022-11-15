package Nov07;

public class Whale extends Mammal implements Swimmer{
    public Whale(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {

    }

    @Override
    public void swim() {
        System.out.println("Go swim whale");
    }

    @Override
    public void dive() {
        System.out.println("Whale dives");
    }
}
