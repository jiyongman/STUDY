package boj;
import java.util.*;

public class BOJ9151 { // Starship Hakodate-maru

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int max = 0;

            for (int i = 0; i < 55; i++) {
                int a = i * i * i; // the number of fuel balls for the container #1

                if (n < a) {
                    break;
                }

                for (int j = 0; j < 97; j++) {
                    int b = a + j * (j + 1) * (j + 2) / 6; // the number of fuel balls for the container #2

                    if (n < b) {
                        break;
                    } else {
                        if (max < b) {
                            max = b;
                        }
                    }
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}