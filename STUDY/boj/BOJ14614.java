package boj;
import java.util.*;

public class BOJ14614 { // Calculate!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String C = sc.next();
        char ch = C.charAt(C.length() - 1);

        if ((ch - '0') % 2 > 0) {
            System.out.println(A ^ B);
        } else {
            System.out.println(A);
        }

        sc.close();
    }
}