package Nov07;

import Main.Human;

public abstract class Cat extends Animal{
    String breed;
    String fav_food;
    String color;
    boolean gender_male;
    Human owner;

    public Cat(String name, int age) {
        super(name,age);
    }


    public void purr() {
        System.out.println(name + ": prrrrrrr");
    }
}
