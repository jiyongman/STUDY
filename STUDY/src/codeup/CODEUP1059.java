package codeup;
import java.util.*;

public class CODEUP1059 { // 비트단위로 NOT 하여 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(~a);
        sc.close();
    }
}