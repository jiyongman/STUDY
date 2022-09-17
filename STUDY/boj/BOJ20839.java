package boj;
import java.util.*;

public class BOJ20839 { // Betygsättning

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble(); // the number of A-criteria present 
		double y1 = sc.nextDouble(); // the number of C-criteria present
		double z1 = sc.nextDouble(); // the number of E-criteria present
		double x2 = sc.nextDouble(); // the number of A-criteria that the student has fulfilled
		double y2 = sc.nextDouble(); // the number of C-criteria that the student has fulfilled
		double z2 = sc.nextDouble(); // the number of E-criteria that the student has fulfilled
		
		if (x2 >= x1 && y2 >= y1 && z2 >= z1) {
			System.out.println("A");
		} else if (x2 >= x1 / 2 && y2 >= y1 && z2 >= z1) {
			System.out.println("B");
		} else if (y2 >= y1 && z2 >= z1) {
			System.out.println("C");
		} else if (y2 >= y1 / 2 && z2 >= z1 / 2) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
		sc.close();
	}
}