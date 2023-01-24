package beakjoon_condition;

import java.util.Scanner;

/*알람시
 * 1. H와 M을 입력받는다.
 * 2. H와 M의 범위를 지정한다.
 * 3. 45분의 차이를 계산한다.
 * 4. 결과를 출력한다.
 */
public class Problem_2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if(H <= 23 && H>=0 && M <= 59 && M >= 0) {
			if(M < 45) {
				if(H > 0) {
					H = H -1;
				}
				else {
					H = 23;
				}
				M = 15 + M; 
			}
			else {
				M = M - 45;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println("입력에러");
		}
	}

}
