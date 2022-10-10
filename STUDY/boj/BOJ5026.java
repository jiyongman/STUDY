package boj;
import java.util.*;

public class BOJ5026 { // 박사 과정

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문제의 개수

        for (int i = 0; i < N; i++) {
            String[] arr = sc.next().split("\\+");

            if (arr[0].equals("P=NP")) {
                System.out.println("skipped");
            } else {
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);

                System.out.println(a + b);
            }
        }

        sc.close();
    }
}