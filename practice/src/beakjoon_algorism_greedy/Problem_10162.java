package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 전자레인지
 *  1. 조리시간 T 초 입력받는다.
 *  2. A = 5분 = 300초, B = 1분 = 60초, C = 10초
 *  3. 조리시간 T의 최소 버튼 조작 수 A, B, C를 구한다.
 */
public class Problem_10162 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = 300;
		int B = 60;
		int C = 10;
		int T = scanner.nextInt();
		int arr[] = new int[3];
		
		
		if(T % 10 != 0) {
			System.out.println("-1");
		}
		else {
			while(true) {
	
					if(T / 300 != 0) {
						arr[0] = T / 300;
						T = T %300;
					}
					else if(T / 60 != 0) {
						arr[1] = T / 60;
						T = T % 60;
					}
					else if(T / 10 != 0) {
						arr[2] = T / 10;
						break;
					}
					else {
						break;
				}
			}
			for(int i = 0; i < 3; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
