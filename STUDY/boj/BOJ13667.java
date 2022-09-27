package boj;
import java.util.*;

public class BOJ13667 { // Leitura Ótica

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt(); // the number of questions in the answer sheet

            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                int[] arr = new int[5];
                int cnt = 0;

                for (int j = 0; j < 5; j++) {
                    int A = sc.nextInt(); // the average gray level values for each of the answer alternatives

                    if (A <= 127) {
                        arr[j] = 1;
                        cnt++;
                    }
                }

                if (cnt == 1) {
                    for (int j = 0; j < 5; j++) {
                        if (arr[j] == 1) {
                            System.out.println((char) ('A' + j));
                        }
                    }
                } else {
                    System.out.println("*");
                }
            }
        }

        sc.close();
    }
}