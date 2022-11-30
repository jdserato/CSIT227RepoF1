package Another;
import Main.Human;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean finished = true;
        do {
            try {
//                ensurePositive(5);
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a: ");
                int a = sc.nextInt();
                System.out.print("Enter b: ");
                int b = sc.nextInt();
                System.out.println("Enter string: ");
                sc.nextLine();
                String sample = sc.nextLine();
                int samp = Integer.parseInt(sample);
                double answer = a / b + samp;
                System.out.println(answer);
                finished = true;
            }catch (ArithmeticException | NumberFormatException | InputMismatchException e) {

            } catch (Exception e) {
                System.out.println("An error has occurred");
                e.printStackTrace();
                finished = false;
            }
        } while (!finished);
    }

    public static void ensurePositive(int num) throws Exception {
        ensurePositive(num);
        if (num < 0) {
            throw new Exception(num + " is not positive");
        }
    }
}
