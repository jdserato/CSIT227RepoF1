package Nov07;

public class Clownfish extends Fish{
    public Clownfish(String name, int age) {
        super(name, age);
    }

    @Override
    public void dive() {
        System.out.println("Clownfish dives");
    }

    @Override
    public Animal lay_eggs() {
        return new Clownfish("Another", 0);
    }
}
