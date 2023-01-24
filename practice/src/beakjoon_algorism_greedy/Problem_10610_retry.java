package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 30
 *  1. 숫자 N 입력받는다.
 *  2. N에 0이 포함되어있는지 확인한다.
 *  3. N의 각 숫자들을 합하여 3의 배수가 되는지 확인한다.
 *  4. 0을 맨 뒤로 보내어 출력한다.
 */
public class Problem_10610_retry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.nextLine();
		int[] number = new int[N.length()];
		int sum = 0;
		
		if(N.contains("0")) {
			for(int i = 0; i < N.length(); i++) {
				number[i] = N.charAt(i) - 48;
				sum += number[i];
			}
			
			if(sum % 3 == 0) {
				int temp = number[N.indexOf("0")];
				number[N.indexOf("0")] = number[N.length() - 1];
				number[N.length() - 1] = temp;
				for(int i = 0; i < N.length(); i++) {
					System.out.print(number[i]);
				}
			}
			else {
				System.out.println("-1");

			}
		}
		else {
			System.out.println("-1");
		}
	}

}
