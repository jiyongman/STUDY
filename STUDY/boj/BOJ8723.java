package boj;
import java.util.*;

public class BOJ8723 { // Patyki

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // the length of the first stick
        int b = sc.nextInt(); // the length of the second stick
        int c = sc.nextInt(); // the length of the third stick

        if (a == b && b == c) {
            System.out.println(2);
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}