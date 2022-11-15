package Nov07;

public abstract class Bird extends Animal implements EggLayers{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird " + name + ": Tweet tweet");
    }

    @Override
    public int type_of_eggs() {
        return HARD_EGGS;
    }
}
