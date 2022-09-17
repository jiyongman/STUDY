package codeup;
import java.util.*;

public class CODEUP1071 { // 0 입력될 때까지 무한 출력하기1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            } else {
                System.out.println(n);
            }
        }

        sc.close();
    }
}