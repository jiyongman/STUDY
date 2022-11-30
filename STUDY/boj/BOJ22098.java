package boj;
import java.util.*;

public class BOJ22098 { // Треугольники

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int i = 0; i < T; i++) {
            int[] arr = new int[4];

            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt(); // the lengths of the given segments
            }

            Arrays.sort(arr);
            int r = 0; // the number of right-angled triangle
            int a = 0; // the number of acute-angled triangle
            int o = 0; // the number of obtuse-angled triangle

            for (int j = 0; j < 2; j++) {
                for (int k = j + 1; k < 3; k++) {
                    for (int l = k + 1; l < 4; l++) {
                        if (arr[j] + arr[k] > arr[l]) {
                            if (arr[j] * arr[j] + arr[k] * arr[k] == arr[l] * arr[l]) {
                                r++;
                            } else if (arr[j] * arr[j] + arr[k] * arr[k] > arr[l] * arr[l]) {
                                a++;
                            } else {
                                o++;
                            }
                        }
                    }
                }
            }

            System.out.printf("%d %d %d\n", r, a, o);
        }

        sc.close();
    }
}