package boj;
import java.util.*;

public class BOJ3622 { // 어떤 호박의 할로윈 여행

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 두 고리의 바깥 반지름
        int a = sc.nextInt(); // 두 고리의 안쪽 반지름
        int B = sc.nextInt(); // 두 고리의 바깥 반지름
        int b = sc.nextInt(); // 두 고리의 안쪽 반지름
        int P = sc.nextInt(); // 판의 반지름

        if (P >= A + B || (P >= A && a >= B) || (P >= B && b >= A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}