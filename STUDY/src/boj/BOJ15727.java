package boj;
import java.util.*;

public class BOJ15727 { // 조별과제를 하려는데 조장이 사라졌다

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 성우의 현재 위치와 민건이의 집까지의 거리

        if (L % 5 == 0) {
            System.out.println(L / 5);
        } else {
            System.out.println(L / 5 + 1);
        }

        sc.close();
    }
}