package boj;
import java.util.*;

public class BOJ26057 { // Большой удой

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // the number of liters of milk milked by the finalists
        int T = sc.nextInt(); // the time during which milk flowed
        int tmp = T;

        while (L >= tmp) {
            tmp += T;
        }

        int result = tmp - L;

        System.out.println(result);
        sc.close();
    }
}