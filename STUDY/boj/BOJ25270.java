package boj;
import java.util.*;

public class BOJ25270 { // 99 Problems

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the price of a product

        if (N % 100 >= 49) {
            System.out.println(N / 100 * 100 + 99);
        } else {
            if (N < 49) {
                System.out.println(99);
            } else {
                System.out.println(N / 100 * 100 - 1);
            }
        }
        
        sc.close();
    }
}