package Nov07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog nova = new Dog("Nova", 5, "Chihuahua");
        nova.eat();
        nova.makeSound();
        nova.bark();
        System.out.println(nova);
        System.out.println(nova.dog_breed);

        Cat nyeko = new Cat("Nyeko", 2);
        nyeko.purr();
        nyeko.eat();
        nyeko.makeSound();

        Fish nemo = new Fish("Nemo", 1);
        nemo.eat();
        nemo.makeSound();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(nyeko);
        animals.add(nova);
        animals.add(nemo);

        for (Animal a : animals) {
            a.makeSound();
        }

//        Animal arianne = new Animal("Arianne", 20);
//        arianne.eat();
//        arianne.makeSound();
    }
}
