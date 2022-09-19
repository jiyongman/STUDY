package boj;
import java.util.*;

public class BOJ20017 { // Топот котов

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of floors
        int m = sc.nextInt(); // the number of apartments on each floor
        int a = sc.nextInt(); // the amount of fine
        int[][] b = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt(); // the number of cats in apartment
            }
        }

        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (2 * b[i][j] < b[i + 1][j]) {
                    cnt++;
                }
            }
        }
        
        System.out.println(a * cnt);
        sc.close();
    }   
}