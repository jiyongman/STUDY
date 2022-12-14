package boj;
import java.util.*;

public class BOJ26392 { // Desni klik

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of NFPs
        int r = sc.nextInt(); // the number of rows of the matrices
        int s = sc.nextInt(); // the number of columns of the matrices

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = r; j >= 1; j--) {
                String str = sc.next();

                for (int k = 0; k < s; k++) {
                    char ch = str.charAt(k);

                    if (ch == '#') {
                        max = Math.max(max, j);
                        min = Math.min(min, j);
                    }
                }
            }

            int result = max - min;

            System.out.println(result);
        }

        sc.close();
    }
}