package boj;
import java.util.*;

public class BOJ27239 { // Шахматная доска

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = (n + 7) / 8;
        char col = (char) (((n - 1) % 8) + 'a');

        System.out.printf("%c%d", col, row);
        sc.close();
    }
}