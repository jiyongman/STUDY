package codeup;
import java.util.*;

public class CODEUP1088 { // 3의 배수는 통과?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue; // 아래 내용 건너뛰고 다음 반복 수행
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}