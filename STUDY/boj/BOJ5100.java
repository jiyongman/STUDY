package boj;
import java.util.*;

public class BOJ5100 { // Jean and Joe’s Clothes

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt(); // the total number of clothes found strewn round the house

            if (N == 0) {
                break;
            }

            int joe = 0;
            int jean = 0;
            int jane = 0;
            int james = 0;
            int x = 0;

            for (int i = 0; i < N; i++) {
                String str = sc.next(); // the size of an item of clothing

                if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                    if (str.charAt(0) == 'M' || str.charAt(0) == 'L') {
                        joe++;
                    } else if (str.charAt(0) == 'S') {
                        james++;
                    } else {
                        x++;
                    }
                } else {
                    if (Integer.parseInt(str) >= 12) {
                        jean++;
                    } else {
                        jane++;
                    }
                }
            }

            System.out.printf("%d %d %d %d %d\n", joe, jean, jane, james, x);
        }

        sc.close();
    }
}