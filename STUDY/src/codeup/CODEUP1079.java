package codeup;
import java.util.*;

public class CODEUP1079 { // 원하는 문자가 입력될 때까지 반복 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.next().charAt(0);

            if (ch == 'q') {
                System.out.println('q');
                break;
            } else {
                System.out.println(ch);
            }
        }

        sc.close();
    }
}