package boj;
import java.util.*;

public class BOJ4072 { // Words

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("#")) {
                break;
            }

            String[] arr = str.split(" ");

            for (int i = 0; i < arr.length; i++) {
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    System.out.print(arr[i].charAt(j));
                }

                System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}