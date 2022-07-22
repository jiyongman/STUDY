package boj;
import java.util.*;

public class BOJ1541 { // 잃어버린 괄호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\-"); // 뺄셈을 기준으로 입력값을 나눔
        int sum = Integer.MAX_VALUE; // 초기 값 확인

        for (int i = 0; i < arr.length; i++) {
            String[] str = arr[i].split("\\+"); // 뺄셈으로 나눈 입력값을 덧셈으로 분리하여 더함
            int tmp = 0;

            for (int j = 0; j < str.length; j++) {
                tmp += Integer.parseInt(str[j]); // 덧셈으로 나눈 입력값을 모두 더함
            }

            if (sum == Integer.MAX_VALUE) { // 첫 번째 토큰의 경우 tmp 값이 첫 번째 수가 됨
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}