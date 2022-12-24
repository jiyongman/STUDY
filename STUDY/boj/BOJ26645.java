package boj;
import java.util.*;

public class BOJ26645 { // 성장의 비약 선택권

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N <= 209 - 4) {
            System.out.println(1);
        } else if (N <= 219 - 2) {
            System.out.println(2);
        } else if (N <= 229 - 1) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

        sc.close();
    }
}