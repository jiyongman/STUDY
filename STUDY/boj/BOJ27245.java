package boj;
import java.util.*;

public class BOJ27245 { // Комната

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (Math.min(l, w) >= 2 * h && Math.max(l, w) <= 2 * Math.min(l, w)) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

        sc.close();
    }
}