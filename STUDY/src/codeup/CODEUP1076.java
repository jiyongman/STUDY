package codeup;
import java.util.*;

public class CODEUP1076 { // 문자 1개 입력받아 알파벳 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0); // 아스키 코드
        char ch = 'a';

        while (ch <= c) {
            System.out.print(ch + " ");
            ch++;
        }

        sc.close();
    }
}