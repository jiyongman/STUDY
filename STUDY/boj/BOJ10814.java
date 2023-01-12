package boj;
import java.util.*;

public class BOJ10814 { // 나이순 정렬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] age = new int[N];
        String[] name = new String[N];

        for (int i = 0; i < N; i++) {
            age[i] = sc.nextInt();
            name[i] = sc.next();
        }

        for (int i = 1; i <= 200; i++) {
            for (int j = 0; j < N; j++) {
                if (age[j] == i) {
                    System.out.printf("%d %s\n", age[j], name[j]);
                }
            }
        }

        sc.close();
    }
}