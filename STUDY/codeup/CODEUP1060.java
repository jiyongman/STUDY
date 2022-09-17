package codeup;
import java.util.*;

public class CODEUP1060 { // 비트단위로 AND 하여 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a & b);
        sc.close();
    }
}