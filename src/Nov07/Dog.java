package Nov07;

import Main.Human;

public class Dog extends Animal {
    String dog_breed;
    String fav_food;
    String color;
    boolean gender_male;
    Human owner;

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, String dog_breed) {
        super(name, age);
        this.dog_breed = dog_breed;
    }

    public void bark() {
        System.out.println(super.name + ": AWW AWW");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + " goes arf arf");
    }
}
