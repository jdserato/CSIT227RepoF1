package Nov07;

public class Platypus extends Mammal implements EggLayers{
    public Platypus(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Platypus "+ name + ": KKKkkkkkkKKK");
    }

    @Override
    public Animal lay_eggs() {
        return new Platypus("Another Platypus", 0);
    }

    @Override
    public int type_of_eggs() {
        return HARD_EGGS;
    }

//    @Override
//    public void labor() {
//        System.out.println("Platypus " + name + ": LLLLLL");
//    }
}
