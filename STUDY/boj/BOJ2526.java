package boj;
import java.util.*;

public class BOJ2526 { // 싸이클

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int tmp = N;
        int i = 0;
        int cnt = 0;
        int[] arr = new int[98];

        while (cnt == 0) {
            tmp = tmp * N % P;

            for (int j = 0; j < i; j++) {
                if (arr[j] == tmp) {
                    System.out.println(i - j);
                    cnt++;
                    break;
                }
            }

            arr[i] = tmp;
            i++;
        }

        sc.close();
    }
}