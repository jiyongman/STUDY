package boj;
import java.util.*;

public class BOJ4483 { // “Robot Roll Call – Cambot...Servo...Gypsy...Croooow”

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            String[] names = new String[n];
            boolean[] present = new boolean[n];

            for (int j = 0; j < n; j++) {
                names[j] = sc.nextLine();
            }

            int d = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < d; j++) {
                String[] data = sc.nextLine().split(" ");

                for (int k = 0; k < data.length; k++) {
                    for (int l = 0; l < n; l++) {
                        if (names[l].equals(data[k])) {
                            present[l] = true;
                        }
                    }
                }
            }

            System.out.printf("Test set %d:\n", i);

            for (int j = 0; j < n; j++) {
                if (present[j]) {
                    System.out.printf("%s is present\n", names[j]);
                } else {
                    System.out.printf("%s is absent\n", names[j]);
                }
            }

            System.out.println();
        }

        sc.close();
    }
}