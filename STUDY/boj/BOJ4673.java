package boj;

public class BOJ4673 { // 셀프 넘버

	public static void main(String[] args) {
		
		boolean[] bl = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if (n < 10001) {
				bl[n] = true;
			}
		}
		
		for (int i = 1; i < 10001; i++) {
			if (!bl[i]) {
				System.out.println(i);
			}
		}
	}
	
	static int d(int n) { // d(n) 함수(n과 n의 각 자리 수를 더하는 함수)
		
		int sum = n;
		
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
