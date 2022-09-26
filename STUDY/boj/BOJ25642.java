package boj;
import java.util.*;

public class BOJ25642 { // 젓가락 게임

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 용태가 한 손에 펴고 시작할 손가락의 개수
        int B = sc.nextInt(); // 유진이가 한 손에 펴고 시작할 손가락의 개수
        int cnt = 0;

        while (true) {
            B += A;

            if (B >= 5) {
                cnt++;
                break;
            }

            A += B;

            if (A >= 5) {
                cnt--;
                break;
            }
        }

        if (cnt > 0) {
            System.out.println("yt");
        } else {
            System.out.println("yj");
        }

        sc.close();
    }
}