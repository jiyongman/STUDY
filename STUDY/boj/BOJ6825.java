package boj;
import java.util.*;

public class BOJ6825 { // Body Mass Index

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble(); // the patient’s weight
        double h = sc.nextDouble(); // the patient’s height
        double BMI = w / (h * h);

        if (BMI > 25) {
            System.out.println("Overweight");
        } else if (BMI < 18.5) {
            System.out.println("Underweight");
        } else {
            System.out.println("Normal weight");
        }

        sc.close();
    }
}