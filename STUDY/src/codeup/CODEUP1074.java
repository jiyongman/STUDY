package codeup;
import java.util.*;

public class CODEUP1074 { // 정수 1개 입력받아 카운트다운 출력하기1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}