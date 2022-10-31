package boj;
import java.util.*;

public class BOJ18884 { // New Year and Naming

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int y = sc.nextInt(); // the year we want to know the name for

            System.out.printf("%s%s\n", arr[(y - 1) % n], arr2[(y - 1) % m]);
        }

        sc.close();
    }
}