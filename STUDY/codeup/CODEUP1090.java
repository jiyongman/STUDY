package codeup;
import java.util.*;

public class CODEUP1090 { // 수 나열하기2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작 값
        int r = sc.nextInt(); // 등비의 값
        int n = sc.nextInt(); // 몇 번째 인지를 나타내는 정수

        System.out.println(a * (long) (Math.pow(r, n - 1))); // 등비수열 일반항 공식, n번째 항 = a * Math.pow(r, n - 1)
        sc.close();
    }
}