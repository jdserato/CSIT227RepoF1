package Nov07;

public abstract class Fish extends Animal implements Swimmer, EggLayers {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish " + name + " goes bloop bloop");
    }

    @Override
    public int type_of_eggs() {
        return SOFT_EGGS;
    }
}
