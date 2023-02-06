package boj;
import java.util.*;

public class BOJ27433 { // 팩토리얼 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long factorial = 1;

        for (long i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
        sc.close();
    }
}