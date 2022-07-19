package codeup;
import java.util.*;

public class CODEUP1089 { // 수 나열하기1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작 값
        int d = sc.nextInt(); // 등차의 값
        int n = sc.nextInt(); // 몇 번째 인지를 의미하는 정수

        System.out.println(a + (n - 1) * d); // 등차수열의 일반항 공식
        sc.close();
    }
}