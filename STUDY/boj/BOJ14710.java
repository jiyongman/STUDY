package boj;
import java.util.*;

public class BOJ14710 { // 고장난 시계

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 시침의 각도
        int t2 = sc.nextInt(); // 분침의 각도
        int result = t % 30 * 12;

        if (result == t2) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

        sc.close();
    }
}