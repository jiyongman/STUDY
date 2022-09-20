package boj;
import java.util.*;

public class BOJ15179 { // Golf Croquet

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String team = sc.nextLine(); // the name of a first team
        String team2 = sc.nextLine(); // the name of a second team
        int S = sc.nextInt(); // how many strokes are recorded, for a game
        String str = sc.next();

        int score = 0;
        int score2 = 0;

        for (int i = 0; i < S; i++) {
            if (str.charAt(i) == 'H') {
                if (i % 2 == 0) {
                    score++;
                } else {
                    score2++;
                }
            } else if (str.charAt(i) == 'D') {
                if (i % 2 == 0) {
                    if (score == 6) {
                        score++;
                    } else {
                        score += 2;
                    }
                } else {
                    if (score2 == 6) {
                        score2++;
                    } else {
                        score2 += 2;
                    }
                }
            } else if (str.charAt(i) == 'O') {
                if (i % 2 == 0) {
                    score2++;
                } else {
                    score++;
                }
            }

            if (score >= 7 || score2 >= 7) {
                break;
            }
        }

        System.out.print(team + " " + score + " " + team2 + " " + score2 + ". ");

        if (score >= 7 || score2 >= 7) {
            if (score > score2) {
                System.out.println(team + " has won.");
            } else {
                System.out.println(team2 + " has won.");
            }
        } else if (score != score2) {
            if (score > score2) {
                System.out.println(team + " is winning.");
            } else {
                System.out.println(team2 + " is winning.");
            }
        } else {
            System.out.println("All square.");
        }

        sc.close();
    }
}