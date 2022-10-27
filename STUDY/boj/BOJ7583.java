package boj;
import java.util.*;

public class BOJ7583 { // Jumbled Words

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] arr = sc.nextLine().split(" ");

            if (arr[0].equals("#")) {
                break;
            }

            for (int i = 0; i < arr.length; i++) {
                char[] arr2 = arr[i].toCharArray();

                for (int j = 1; j < arr2.length / 2; j++) {
                    char tmp = arr2[j];
                    arr2[j] = arr2[arr2.length - 1 - j];
                    arr2[arr2.length - 1 - j] = tmp;
                }

                for (int j = 0; j < arr2.length; j++) {
                    System.out.print(arr2[j]);
                }

                System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}