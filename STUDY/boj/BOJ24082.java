package boj;
import java.util.*;

public class BOJ24082 { // 立方体 (Cube)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        System.out.println((int) Math.pow(X, 3)); // Math.pow 함수는 double형으로 출력
        sc.close();
    }
}