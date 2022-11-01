package boj;
import java.util.*;

public class BOJ6565 { // Hard to Believe, but True!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] arr = sc.next().split("\\+|=");
            arr[0] = new StringBuffer(arr[0]).reverse().toString();
            arr[1] = new StringBuffer(arr[1]).reverse().toString();
            arr[2] = new StringBuffer(arr[2]).reverse().toString();

            if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) == Integer.parseInt(arr[2])) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

            if (arr[0].equals("0") && arr[1].equals("0") && arr[2].equals("0")) {
                break;
            }
        }

        sc.close();
    }
}