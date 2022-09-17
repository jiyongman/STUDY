package codeup;
import java.util.*;

public class CODEUP1082 { // 16진수 구구단?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(16); // 16진수로 입력받기

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", n, i, n * i);
        }

        sc.close();
    }
}