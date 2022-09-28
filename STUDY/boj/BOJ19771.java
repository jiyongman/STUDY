package boj;
import java.util.*;

public class BOJ19771 { // Сапсан

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of seats in the Sapsan car
        int max = n / 6 * 4;

        System.out.println(max);
        sc.close();
    }
}