package boj;
import java.util.*;

public class BOJ23854 { // The Battle of Giants

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // the number of points scored by the first team
        int b = sc.nextInt(); // the number of points scored by the second team

        if (a % 3 == b % 3) {
            System.out.printf("%d %d %d", a / 3, a % 3, b / 3);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}