package Main;

import java.util.Date;

public class Human {
    // FIELDS / Instance Variables
    public static int human_count = 0;
    private String name;
    private int age;
    private boolean gender_male;
    public static final int AGE_OF_DEATH = 80;
    public static final String SPECIES = "Homo Sapiens";

    public Human() {
        this("Juan Dela Cruz", 18);
//        name = "Juan Dela Cruz";
//        age = 18;
//        gender_male = true;
    }

    public Human(String name, int age) {
        this(name, age, true);
    }

    public Human(int age, String name) {
        this(name, age, true);
    }

    public Human(String name, int age, boolean gender_male) {
        this.name = name;
        this.age = age;
        this.gender_male = gender_male;
        human_count++;
    }

    void say_hi() {
        System.out.println(name + ": Hi");
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
