package boj;
import java.util.*;

public class BOJ26209 { // Intercepting Information

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] N = new int[9];

        for (int i = 1; i <= 8; i++) {
            N[i] = sc.nextInt();

            if (N[i] == 9) {
                System.out.println("F");
                return;
            }
        }

        System.out.println("S");
        sc.close();
    }
}