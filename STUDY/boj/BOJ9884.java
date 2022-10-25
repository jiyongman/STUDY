package boj;
import java.util.*;

public class BOJ9884 { // Euclid

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        while (A != B) {
            int tmp = Math.max(A, B) - Math.min(A, B);
            B = Math.min(A, B);
            A = tmp;
        }

        System.out.println(B);
        sc.close();
    }
}