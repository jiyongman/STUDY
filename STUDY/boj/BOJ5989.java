package boj;
import java.util.*;

public class BOJ5989 { // The Robot Plow

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int I = sc.nextInt();
        boolean[][] plowed = new boolean[Y + 1][X + 1];
        
        for (int i = 0; i < I; i++) {
            int Xll = sc.nextInt();
            int Yll = sc.nextInt();
            int Xur = sc.nextInt();
            int Yur = sc.nextInt();

            for (int j = Yll; j <= Yur; j++) {
                for (int k = Xll; k <= Xur; k++) {
                    plowed[j][k] = true;
                }
            }
        }

        int cnt = 0;

        for (int i = 1; i <= Y; i++) {
            for (int j = 1; j <= X; j++) {
                if (plowed[i][j]) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}