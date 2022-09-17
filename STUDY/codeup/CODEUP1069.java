package codeup;
import java.util.*;

public class CODEUP1069 { // 평가 입력받아 다르게 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) { // 정수값만 가능
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default: // 케이스를 제외한 모든 경우
                System.out.println("what?");
                break;
        }

        sc.close();
    }
}