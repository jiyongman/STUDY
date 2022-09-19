package boj;
import java.util.*;

public class BOJ5753 { // Pascal Library

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt(); // the number of alumni
            int D = sc.nextInt(); // the number of dinners organized

            if (N == 0 && D == 0) {
                break;
            }

            int[][] X = new int[D][N];
            
            for (int i = 0; i < D; i++) {
                for (int j = 0; j < N; j++) {
                    X[i][j] = sc.nextInt();
                }
            }

            int result = 0;

            for (int j = 0; j < N; j++) {
                int cnt = 0;
                
                for (int i = 0; i < D; i++) {
                    if (X[i][j] == 1) {
                        cnt++;
                    }

                    if (cnt == D) {
                        result++;
                    }
                }
            }

            if (result > 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}