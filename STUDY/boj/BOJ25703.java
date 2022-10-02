package boj;
import java.util.*;

public class BOJ25703 { // 포인터 공부

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("int a;");
        System.out.println("int *ptr = &a;");

        for (int i = 2; i <= N; i++) {
            System.out.print("int ");

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            if (i == 2) {
                System.out.println("ptr" + i + " = &ptr;");
            } else {
                System.out.println("ptr" + i + " = &ptr" + (i - 1) + ";");
            }
        }

        sc.close();
    }
}