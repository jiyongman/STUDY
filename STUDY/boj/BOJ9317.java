package boj;
import java.util.*;

public class BOJ9317 { // Monitor DPI
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			double D = sc.nextDouble(); // the Diagonal size of screen in inches
			double RH = sc.nextDouble(); // the Resolution Horizontal
			double RV = sc.nextDouble(); // the Resolution Vertical
			
			if (D == 0 && RH == 0 && RV == 0) {
				break;
			}
			
			double W = 16 * D / Math.sqrt(337); // the idth of the screen in inches
			double H = 9 * W / 16; // the height of the screen in inches
			double HD = RH / W; // the Horizontal DPI
			double VD = RV / H; // the Vertical DPI
			
			System.out.printf("Horizontal DPI: %.2f\nVertical DPI: %.2f\n", HD, VD);
		}
		
		sc.close();
	}
}