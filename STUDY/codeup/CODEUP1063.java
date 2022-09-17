package codeup;
import java.util.*;

public class CODEUP1063 { // 두 정수 입력받아 큰 수 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a > b ? a : b); // 3항 연산자
        sc.close();
    }
}