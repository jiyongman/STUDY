package boj;
import java.util.*;

public class BOJ11282 { // 한글

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N번째 글자

        System.out.println((char) (44031 + N));
        sc.close();
    }
}