package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 문서검색
 *  1. 문자열 입력받는다.
 *  2. 검색하고자하는 단어 입력받는다.
 *  3. 중복되는 단어를 count하고 삭제한다.
 *  4. count값을 출력한다.
 */
public class Problem_01543 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		String B = scanner.nextLine();
		int count = 0;
		
		while(true) {
			if(A.contains(B)) {
				count++;
				A = A.replaceFirst(B, "-");
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

}
