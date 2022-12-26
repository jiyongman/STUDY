package boj;
import java.util.*;

public class BOJ26863 { // Absolutely Flat

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int b = sc.nextInt();

        if (a[0] == a[1] && a[1] == a[2] && a[2] == a[3]) {
            System.out.println(1);
        } else if (a[0] + b == a[1] && a[1] == a[2] && a[2] == a[3]) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}