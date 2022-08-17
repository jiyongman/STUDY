package boj;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BOJ15858 { // Simple Arithmetic
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		BigDecimal c = sc.nextBigDecimal();
		
		System.out.println((a.multiply(b).divide(c, 18, RoundingMode.HALF_EVEN)));
		sc.close();
	}
}