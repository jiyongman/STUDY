package boj;
import java.util.*;

public class BOJ18142 { // Tapioka

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("bubble") || arr[i].equals("tapioka")) {
                cnt++;
            } else {
                System.out.printf("%s ", arr[i]);
            }
        }

        if (cnt == 3) {
            System.out.println("nothing");
        }

        sc.close();
    }
}