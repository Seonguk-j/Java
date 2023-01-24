package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 단어수학
 *  1. 숫자 N입력받는다.
 *  2. 문자열 입력받는다.
 *  3. 문자의 길이가 가장 긴 배열을 찾는다.
 *  4. 
 */
public class Problem_01339 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String arr[] = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		char[][] abc = new char[N][10];
		for(int i = 0; i < N; i++) {
			for(int j = 1; j <= arr[i].length(); j++) {
				abc[i][j - 1] = arr[i].charAt(arr[i].length() - j);
			}
		}
		
		int[][] count = new int [10][26];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				for(int k = 0; k < 26; k++) {
					if(Character.getNumericValue(abc[i][j]) - 10 == k) {
						count[j][k]++;
					}
				}
			}
		}
		
		int[] compare = new int[26];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 26; j++) {
				compare[j] += count[i][j] * Math.pow(10, i);
			}
		}
		
		int[] grade = new int[26];
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				if(i != j) {
					if(compare[i] > compare[j]) {
						if(compare[j] != 0) {
							grade[i]++;
						}
					}
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			if(compare[i] != 0) {
				grade[i]++;
			}
		}
		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < arr[i].length(); j++) {
//				System.out.print(abc[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 26; j++) {
//				System.out.print(count[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		
		for(int i = 0; i < 26; i++) {
			System.out.print(compare[i] + " ");
		}
		System.out.println();
		System.out.println("a b c d e f g h i j k l m n o p q r s t u v w x y z");
		System.out.println();
		for(int i = 0; i < 26; i++) {
			System.out.print(grade[i] + " ");
		}
		
		
		
	}

}
}
//포기
