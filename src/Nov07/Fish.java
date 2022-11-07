package Nov07;

public class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish " + name + " goes bloop bloop");
    }
}
