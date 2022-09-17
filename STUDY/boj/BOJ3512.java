package boj;
import java.util.*;

public class BOJ3512 { // Flat

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // the number of rooms in the flat
		int c = sc.nextInt(); // the cost of one square metre
		double[] arr = new double[n];
		String[] arr2 = new String[n]; 
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
			arr2[i] = sc.next(); // the area of room and its type
		}
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		int sum2 = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr2[i].equals("bedroom")) {
				sum2 += arr[i];
			}
		}
		
		double sum3 = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr2[i].equals("balcony")) {
				arr[i] /= 2;
			}
			sum3 += arr[i];
		}
		
		System.out.println(sum); // the total area of all rooms of the flat
		System.out.println(sum2); // the total area of bedrooms of the flat
		System.out.println(sum3 * c); // the cost of the flat
		sc.close();
	}
}