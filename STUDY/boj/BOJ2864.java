package boj;
import java.util.*;

public class BOJ2864 { // 5와 6의 차이

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        A = A.replace("6", "5");
        B = B.replace("6", "5");
        int min = Integer.parseInt(A) + Integer.parseInt(B);
        A = A.replace("5", "6");
        B = B.replace("5", "6");
        int max = Integer.parseInt(A) + Integer.parseInt(B);

        System.out.printf("%d %d", min, max);
        sc.close();
    }
}