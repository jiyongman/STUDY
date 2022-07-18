package boj;
import java.util.*;

public class BOJ15964 { // 이상한 기호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println((A + B) * (A - B));
        sc.close();
    }
}