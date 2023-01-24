package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 뒤집기
 * 1. 0, 1을 입력받는다.
 * 2. 첫번째 수와 마지막 수의 일치여부를 확인한다.
 * 3. 첫번째 수와 마지막 수가 일치할경우, 일치하지 않을경우에 따른 식을 작성한다.
 * 4. 결과를 계산하여 출력한다.
 */
public class Problem_01439_retry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String arr[] = S.split("");
		
		int count = 0;
		
		
		for(int i = 1; i < arr.length; i++) {
			if(!arr[i -1].equals(arr[i])) {
				if(!(arr[i]).equals(arr[0])) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		}

}
