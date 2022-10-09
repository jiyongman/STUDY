package boj;
import java.util.*;

public class BOJ21756 { // 지우개

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= N; i *= 2) {
            result = i;
        }

        System.out.println(result);
        sc.close();
    }
}