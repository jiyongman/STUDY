package boj;
import java.util.*;

public class BOJ11104 { // Fridge of Your Dreams

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of test cases

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int result = Integer.parseInt(str, 2);

            System.out.println(result);
        }

        sc.close();
    }
}