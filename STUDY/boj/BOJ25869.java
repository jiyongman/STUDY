package boj;
import java.util.*;

public class BOJ25869 { // Window on the Wall

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); // the wall’s width
        int h = sc.nextInt(); // the wall’s height
        int d = sc.nextInt(); // the minimum windowborder gap amount needed
        int result = (w - (2 * d)) * (h - (2 * d));

        if (w > 2 * d && h > 2 * d) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}