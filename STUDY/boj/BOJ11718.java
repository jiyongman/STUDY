package boj;
import java.util.*;

public class BOJ11718 { // 그대로 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) { // 다음 엔터를 기준으로 문자열이 있는지 확인 후 Boolean을 리턴
            String str = sc.nextLine();

            System.out.println(str);
        }

        sc.close();
    }
}