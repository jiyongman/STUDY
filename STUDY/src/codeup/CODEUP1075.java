package codeup;
import java.util.*;

public class CODEUP1075 { // 정수 1개 입력받아 카운트다운 출력하기2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0) {
            n -= 1;
            System.out.println(n);
        }

        sc.close();
    }
}