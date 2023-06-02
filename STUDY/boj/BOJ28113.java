package boj;
import java.util.*;

public class BOJ28113 { // 정보섬의 대중교통

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < B) {
            System.out.println("Bus");
        } else if (A > B) {
            System.out.println("Subway");
        } else {
            System.out.println("Anything");
        }

        sc.close();
    }
}