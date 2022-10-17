package boj;
import java.util.*;

public class BOJ16462 { // '나교수' 교수님의 악필

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생의 수
        double sum = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next(); // ‘나교수’교수님이 적으신 학생들의 성적

            for (int j = 0; j < str.length(); j++) {
                if (str.length() <= 2) {
                    str = str.replaceAll("0", "9");
                    str = str.replaceAll("6", "9");
                }
            }

            sum += Integer.parseInt(str);
        }

        double avg = (Math.round(sum / N));

        System.out.println((int) avg);
        sc.close();
    }
}