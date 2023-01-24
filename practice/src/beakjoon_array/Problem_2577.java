package beakjoon_array;

import java.util.Scanner;

/*
 * 숫자의 개수
 *  1. 자연수 3개 입력받음
 *  2. 입력받은 수의 곱을 구함
 *  3. 1~9까지 각각 몇번씩 사용되었는지 구함.
 */
public class Problem_2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int multi = A * B * C;
		
		String str = Integer.toString(multi);
		
		int arr[] = new int[10];
		
		for(int i = 0; i<str.length(); i++) {
			arr[(int)str.charAt(i)-48] += 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		int N = 1;
//		while(true) {
//			if(multi/((int)Math.pow(10, N)) == 0) {
//				break;
//			}
//			N++;
//		}
//		
//		int num[] = new int[10];
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < N; j++) {
//				if(i == (int)(multi%Math.pow(10, j+1))/(int)Math.pow(10, j)) {
//					num[i]++;
//					System.out.println(i);
//				}
//			}
//			System.out.println(num[i]);
//		}

	}

}
