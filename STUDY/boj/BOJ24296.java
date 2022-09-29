package boj;
import java.util.*;

public class BOJ24296 { // ЛИНИЯ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of students

        while (true) {
            if (N % 2 > 0) {
                N = N / 2 + 1;
            } else {
                System.out.println(N);
                break;
            }
        }

        sc.close();
    }
}