package boj;
import java.util.*;

public class BOJ5940 { // Math Practice

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;

        for (int E = A + 1; E <= 62; E++) {
            long tmp = (long) Math.pow(2, E);

            while (tmp >= 10) {
                tmp /= 10;
            }

            if (tmp == B) {
                result = E;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}