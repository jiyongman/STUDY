package boj;
import java.util.*;

public class BOJ6888 { // Terms of Office

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = X % 60;

        for (int i = X; i <= Y; i++) {
            if (i % 60 == Z) {
                System.out.printf("All positions change in year %d\n", i);
            }
        }

        sc.close();
    }
}