package Nov07;

import java.util.Comparator;

public abstract class Animal implements Comparable<Animal> {
    protected String name;
    private int age;
    public static final int SAMPLE = 5;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + ": yumyum");
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return name + " (" +age + ")";
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    static class AnimalAgeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            if (o1.age < o2.age) {
                return -1;
            }
            if (o1.age == o2.age) {
                return 0;
            }
            return 1;
        }
    }
}