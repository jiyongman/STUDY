package boj;
import java.io.*;
import java.math.BigInteger;

public class BOJ1247 { // 부호

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			BigInteger S = new BigInteger("0");
			int N = Integer.parseInt(br.readLine());
			
			for (int j = 0; j < N; j++) {
				BigInteger bi = new BigInteger(br.readLine());
				S = S.add(bi);
			}
			
			if (S.compareTo(BigInteger.ZERO) == 0) {
				System.out.println(0);
			} else if (S.compareTo(BigInteger.ZERO) == 1) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
	}
}