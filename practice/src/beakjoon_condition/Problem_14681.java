package beakjoon_condition;

import java.util.Scanner;

public class Problem_14681 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner. nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("1");
			}
			else if(y < 0) {
				System.out.println("4");
			}
			else {
				System.out.println("입력에러");
			}
		}
		else if(x < 0) {
			if(y > 0) {
				System.out.println("2");
			}
			else if(y < 0) {
				System.out.println("3");
			}
			else {
				System.out.println("입력에러");
			}
		}
		else {
			System.out.println("입력에러");
		}
	}

}
