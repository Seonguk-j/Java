package beakjoon_repeat;

import java.util.Scanner;

/*
 * A + B를 출하는 프로그램
 * 1. test할 수량을 입력받아
 * 2. test할 숫자를 입력받아라
 * 3. 결과를 출력하라
 */
public class Problem_10950 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int A[] = new int [num];
		int B[] = new int [num];
		
		for(int i = 0; i < num; i++) {
			A[i] = scanner.nextInt();
			B[i] = scanner.nextInt();
		}
		
		
		for(int i = 0; i < num; i++) {
			if(A[i] > 0 && B[i] > 0 && A[i] < 10 && B[i] < 10) {
				System.out.println(A[i] + B[i]);
			}
			else {
				System.out.println("범위초과 입니다.");
			}
		}
	}

}
