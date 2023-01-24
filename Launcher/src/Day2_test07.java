import java.util.Scanner;

public class Day2_test07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		int min = 0;
		int cut = 60;
		int max = 100;
		
		
		if(score >= min && score < cut) {
			System.out.println("불합격");
		}
		else if(score >= cut && score < max) {
			System.out.println("합격");
		}
		else {
			System.out.println("입력값을 확인하세요.");
		}
	}

}
