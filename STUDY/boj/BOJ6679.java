package boj;

public class BOJ6679 { // 싱기한 네자리 숫자

    public static void main(String[] args) {

        for (int i = 2992; i < 10000; i++) {
            int sum = 0;
            int sum2 = 0;
            int sum3 = 0;
            int tmp = i;
            int tmp2 = i;
            int tmp3 = i;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            while (tmp2 > 0) {
                sum2 += tmp2 % 12;
                tmp2 /= 12;
            }

            while (tmp3 > 0) {
                sum3 += tmp3 % 16;
                tmp3 /= 16;
            }

            if (sum == sum2 && sum2 == sum3) {
                System.out.println(i);
            }
        }
    }
}
