package beakjoon_condition;

import java.util.Scanner;

public class Problem_9498 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score <= 100 && score >=90) {
			System.out.println("A");
		}
		else if(score < 90 && score >= 80) {
			System.out.println("B");
		}
		else if(score < 80 && score >= 70) {
			System.out.println("C");
		}
		else if(score < 70 && score >= 60) {
			System.out.println("D");
		}
		else if(score < 60 && score >= 0) {
			System.out.println("F");
		}
		else {
			System.out.println("입력에러");
		}
	}

}
