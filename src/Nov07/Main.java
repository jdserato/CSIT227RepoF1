package Nov07;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dog nova = new Dog("Nova", 5, "Chihuahua");
        nova.eat();
        nova.makeSound();
        nova.bark();
        System.out.println(nova);
        System.out.println(nova.dog_breed);

        Cat nyeko = new Wildcat("Nyeko", 2);
        nyeko.purr();
        nyeko.eat();
        nyeko.makeSound();

        Fish nemo = new Clownfish("Nemo", 1);
        Animal anim = new Dog("Meowy", 5);
        nemo.eat();
        Whale whale = new Whale("Whale", 70);
        nemo.makeSound();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(nyeko);
        animals.add(nova);
        animals.add(nemo);
        animals.add(anim);
        animals.add(whale);
        Bird pangu = new Penguin("Pangu", 7);
        animals.add(pangu);

        Mammal perry = new Platypus("Perry", 8);
        animals.add(perry);
        Mammal.print_no_of_mammals();
        Collections.sort(animals);
        for (Animal a : animals) {
            System.out.println(a);
//            a.makeSound();
//            if (a instanceof Dog) {
//                Dog dog = (Dog) a;
//                dog.bark();
//            }
//            if (a instanceof Swimmer) {
//                Swimmer f = (Swimmer) a;
//                f.swim();
//            }
//            if (a instanceof EggLayers) {
//                EggLayers e = (EggLayers) a;
//                EggLayers.labor();
//                Animal n_anim = e.lay_eggs();
//                n_anim.makeSound();
//            }
        }

        Animal.AnimalAgeComparator comp = new Animal.AnimalAgeComparator();
        Collections.sort(animals, comp);
        for(Animal a : animals) {
            System.out.println(a);
        }

        Animal arianne = new Wildcat("Arianne", 20);
        arianne.eat();
        arianne.makeSound();
    }
}
