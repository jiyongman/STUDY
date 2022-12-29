package boj;
import java.util.*;

public class BOJ26941 { // Pyramidbygge

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int j = 0;
        int sum = 0;
        int result = 0;

        for (int i = 1; i < 10000; i += 2)
        {
            j++;
            sum += i * i;

            if (sum > N) {
                break;
            } else {
                result = j;
            }
        }

        System.out.println(result);
        sc.close();
    }
}