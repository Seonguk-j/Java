package beakjoon_repeat;

import java.util.Scanner;

/*
 * 더하기 사이클
 *  1. 숫자를 입력받는다.
 *  2. 조합논리를 만든다.
 *  	- 1~9사이의 수가있을경우 앞에 0을 추가하여 조합논리를 만든다.
 *  	- 10~99사이의 수가있을경우 조합논리를 만든다.
 *  	- AB라는 수가 있을 경우 B 와 A + B의 결과값의 1의자리 수를 조합한다.
 *  3. 처음수와 조합논리의 수를 비교한다.
 *  4. 사이클 타임을 count한다.
 *  5. 결과를 출력한다.
 */
public class Problem_1110 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A[] = new int[9999];
		int B[] = new int[9999];
		
		if(N < 10) {
			A[0] = 0;
			B[0] = N;
		}
		else {
			A[0] = N / 10;
			B[0] = N % 10;
		}
		
		int count = 1;
		int x[] = new int [9999];
		while(true) {
				x[count] = (10 * B[count - 1]) + ((A[count - 1] + B[count - 1]) % 10);
				
				A[count] = x[count] / 10;
				B[count] = x[count] % 10;
				
				if(N == x[count]){
				break;
				}
				count++;
		}

		System.out.println(count);
	}

}
