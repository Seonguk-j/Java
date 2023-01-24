package practice;

import java.util.Scanner;

/*
 * 불량학생찾기
 * 1. 총인원을 설정한다.
 * 2. 순서를 입력받는다.
 * 3. 자리와 순서를 비교한다.
 * 4. 제자리가 아닌 학생의 수를 센다.
 * 5. 값을 출력한다.
 */
public class Day7_test04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		int num[] = new int[sum];
		int count = 0;
		
		for(int i = 0; i < sum; i++) {
			num[i] = scanner.nextInt();
			if(num[i] != i +1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
