package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 잃어버린 괄호
 *  1. 계산식을 입력받는다.
 *  2. - 를 기준으로 입력값을 나눈다.
 *  3. 
 */
public class Problem_01541 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int total = 0;

		
		if(input.contains("-")) {
			String arr[] = input.split("-");
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].contains("+")) {
					String subArr[] = arr[i].split("\\+");
					int sum = 0;
					
					for(int j = 0; j < subArr.length; j++) {
						sum += Integer.parseInt(subArr[j]);
					}
					arr[i] = Integer.toString(sum);
				}
			}
			for(int i = 1; i < arr.length; i++) {
				total = Integer.parseInt(arr[0]);
				total -= Integer.parseInt(arr[i]);
			}
		}
		else {
			String arr[] = input.split("\\+");
			for(int i = 0; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
		}
		System.out.println(total);
	}

}
