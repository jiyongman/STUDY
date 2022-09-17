package codeup;
import java.util.*;

public class CODEUP1062 { // 비트단위로 XOR 하여 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a ^ b); // XOR 연산
        sc.close();
    }
}