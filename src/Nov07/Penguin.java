package Nov07;

public class Penguin extends Bird implements Swimmer{
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims");
    }

    @Override
    public void dive() {
        System.out.println("Penguin dives");
    }

    @Override
    public Animal lay_eggs() {
        return new Penguin("Another Penguin", 0);
    }
}
