package boj;
import java.util.*;

public class BOJ27736 { // 찬반투표

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int approved = 0;
        int rejected = 0;
        int invalid = 0;

        for (int i = 0; i < N; i++) {
            int vote = sc.nextInt();

            if (vote == 1) {
                approved++;
            } else if (vote == -1) {
                rejected++;
            } else {
                invalid++;
            }
        }

        if (invalid * 2 >= N) {
            System.out.println("INVALID");
        } else if (approved > rejected) {
            System.out.println("APPROVED");
        } else {
            System.out.println("REJECTED");
        }

        sc.close();
    }
}