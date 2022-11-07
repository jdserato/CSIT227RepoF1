package Main;

public class Main {
    public static void main(String[] args) {
        Human h; // did not create a Main.Human object yet
        h = new Human("Jay Vince Serato", 23, true);
        h.say_hi();
        System.out.println(Human.human_count);
        Human h1 = new Human();
        System.out.println(Human.AGE_OF_DEATH);
        System.out.println(h1.getName());

        Human h2 = h1;
        System.out.println(h2.human_count);
//        h2.name
        System.out.println(h2.getName());
        System.out.println(h1.getName()); // ???
//        h1.setName("Juan Dela Cruz");
        System.out.println(h2.getName());
        System.out.println(h1.getName()); // ???
        System.out.println(Human.human_count);

        Rectangle r = new Rectangle();
        r.x1 = 5;
        r.x2 = 7;
        System.out.println(r.x1 + " and " + r.x2);
        Rectangle r1 = new Rectangle(1,2,3,4);
        System.out.println(r1.y1 + " ug " + r1.y2);
//        Rectangle r2 = new Rectangle(3, 6);
    }
}