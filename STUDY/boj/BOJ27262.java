package boj;
import java.util.*;

public class BOJ27262 { // Лифт

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int elevator = (k - 1) * b + (n - 1) * b;
        int stair = (n - 1) * a;
        System.out.printf("%d %d", elevator, stair);

        sc.close();
    }
}