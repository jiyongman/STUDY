package boj;
import java.util.*;

public class BOJ21573 { // Кондиционер

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt(); // the given temperature in the room
        int t2 = sc.nextInt(); // the desired temperature
        String str = sc.next();

        if (str.equals("freeze")) {
            if (t1 > t2) {
                System.out.println(t2);
            } else {
                System.out.println(t1);
            }
        } else if (str.equals("heat")) {
            if (t1 > t2) {
                System.out.println(t1);
            } else {
                System.out.println(t2);
            }
        } else if (str.equals("auto")) {
            System.out.println(t2);
        } else {
            System.out.println(t1);
        }

        sc.close();
    }
}