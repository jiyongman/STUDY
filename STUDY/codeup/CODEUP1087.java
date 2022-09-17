package codeup;
import java.util.*;

public class CODEUP1087 { // 여기까지! 이제 그만~

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (n <= sum) {
                System.out.println(sum);
                break;
            }
        }

        sc.close();
    }
}