package boj;
import java.util.*;

public class BOJ26768 { // H4x0r

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = '4';
            } else if (arr[i] == 'e') {
                arr[i] = '3';
            } else if (arr[i] == 'i') {
                arr[i] = '1';
            } else if (arr[i] == 'o') {
                arr[i] = '0';
            } else if (arr[i] == 's') {
                arr[i] = '5';
            }

            System.out.print(arr[i]);
        }

        sc.close();
    }
}