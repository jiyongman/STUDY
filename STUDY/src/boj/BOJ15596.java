package boj;

public class BOJ15596 { // 정수 N개의 합

	long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
			ans += a[i];
        }
        return ans;
    }
}