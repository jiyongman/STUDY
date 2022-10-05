package boj;
import java.util.*;

public class BOJ10822 { // 더하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split(",");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
        sc.close();
    }
}