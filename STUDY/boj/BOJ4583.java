package boj;
import java.util.*;

public class BOJ4583 { // 거울상

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = {'b', 'd', 'i', 'o', 'p', 'q', 'v', 'w', 'x'};
        char[] arr2 = {'d', 'b', 'i', 'o', 'q', 'p', 'v', 'w', 'x'};

        while (true) {
            char[] arr3 = sc.next().toCharArray();

            if (arr3[0] == '#') {
                break;
            }

            int cnt = 0;

            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr3[i] == arr[j]) {
                        arr3[i] = arr2[j];
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt == arr3.length) {
                for (int i = arr3.length - 1; i >= 0; i--) {
                    System.out.print(arr3[i]);
                }

                System.out.println();
            } else {
                System.out.println("INVALID");
            }
        }
        
        sc.close();
    }
}