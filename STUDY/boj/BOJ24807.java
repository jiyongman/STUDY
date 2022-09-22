package boj;
import java.util.*;

public class BOJ24807 { // Math Homework

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(); // the numbers of legs the first type of animal has
        int d = sc.nextInt(); // the numbers of legs the second type of animal has
        int c = sc.nextInt(); // the numbers of legs the third type of animal has
        int l = sc.nextInt(); // the total number of legs
        int cnt = 0;

        for (int i = 0; i <= l / b; i++) {
            for (int j = 0; j <= l / d; j++) {
                for (int k = 0; k <= l / c; k++) {
                    if (b * i + d * j + c * k == l) {
                        System.out.println(i + " " + j + " " + k);
                        cnt++;
                    }
                }
            }
        }

        if (cnt == 0) {
            System.out.println("impossible");
        }

        sc.close();
    }   
}