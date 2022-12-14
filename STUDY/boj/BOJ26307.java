package boj;
import java.util.*;

public class BOJ26307 { // Correct

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int HH = sc.nextInt();
        int MM = sc.nextInt();
        int result = HH * 60 + MM - 540;

        System.out.println(result);
        sc.close();
    }
}