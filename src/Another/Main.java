package Another;
import Main.Human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(90);
        ints.add(13);
        ints.add(69);
        ints.add(0);
        Collections.sort(ints);
        for (Integer i : ints) {
            System.out.print(i + " ");
        }
    }
}
