package boj;
import java.util.*;

public class BOJ19604 { // Art

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of drops of paint
        int min = 100;
        int min2 = 100;
        int max = 0;
        int max2 = 0;

        for (int i = 0; i < N; i++) {
            String[] arr = sc.next().split(",");
            int X = Integer.parseInt(arr[0]);
            int Y = Integer.parseInt(arr[1]);
            min = Math.min(min, X);
            min2 = Math.min(min2, Y);
            max = Math.max(max, X);
            max2 = Math.max(max2, Y);
        }

        System.out.printf("%d,%d\n", min - 1, min2 - 1);
        System.out.printf("%d,%d", max + 1, max2 + 1);
        sc.close();
    }
}