package boj;
import java.util.*;

public class BOJ27267 { // Сравнение комнат

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a * b > c * d) {
            System.out.println("M");
        } else if (a * b < c * d) {
            System.out.println("P");
        } else {
            System.out.println("E");
        }

        sc.close();
    }
}