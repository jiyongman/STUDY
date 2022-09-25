package boj;
import java.util.*;

public class BOJ5087 { // Card Cutting

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("#")) {
                break;
            }

            String[] arr = str.split(" ");
            int cheryl = 0;
            int tania = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].equals("A")) {
                    cheryl++;
                } else {
                    int n = Integer.parseInt(arr[i]);

                    if (n % 2 > 0) {
                        cheryl++;
                    } else {
                        tania++;
                    }
                }
            }

            if (cheryl > tania) {
                System.out.println("Cheryl");
            } else if (cheryl < tania) {
                System.out.println("Tania");
            } else {
                System.out.println("Draw");
            }
        }

        sc.close();
    }
}