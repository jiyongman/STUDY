package boj;
import java.util.*;

public class BOJ5356 { // Triangles

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // the number of data sets

        for (int i = 0; i < num; i++) {
            int h = sc.nextInt();
            String str = sc.next();
            char ch = str.charAt(0);

            for (int j = 1; j <= h; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(ch);
                }

                ch++;

                if (ch > 'Z') {
                    ch -= 26;
                }

                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}