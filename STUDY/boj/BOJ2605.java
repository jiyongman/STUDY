package boj;
import java.util.*;

public class BOJ2605 { // 줄 세우기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                list.add(i);
            } else {
                list.add(i - num - 1, i);
            }
        }

        for (int i : list) {
            System.out.printf("%d ", i);
        }

        sc.close();
    }
}