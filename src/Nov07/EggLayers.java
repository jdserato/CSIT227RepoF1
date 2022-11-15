package Nov07;

public interface EggLayers {
    int HARD_EGGS = 1;
    int SOFT_EGGS = 2;

    Animal lay_eggs();
    int type_of_eggs();

    static void labor() {
        System.out.println("This animal is in labor");
    }
}
