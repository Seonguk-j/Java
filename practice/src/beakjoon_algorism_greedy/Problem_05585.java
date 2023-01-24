package beakjoon_algorism_greedy;

import java.util.Scanner;

/*
 * 거스름돈
 *  1. 지불해야할 돈을 입력받는다.
 *  2. 거스름돈 = 1000 - 지불해야할 돈
 *  3. 거스름돈을 500, 100, 50, 10, 5, 1의 단위로 잔돈의 수를 계산한다.
 *  4. 잔돈의 수를 합한다.
 */
public class Problem_05585 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int remain = 1000 - input;
		int count = 0;
		
		while(true) {
			if(remain / 500 != 0) {
				count += remain / 500;
				remain = remain % 500;
			}
			else if(remain / 100 != 0) {
				count += remain / 100;
				remain = remain % 100;
			}
			else if(remain / 50 != 0) {
				count += remain / 50;
				remain = remain % 50;
			}
			else if(remain / 10 != 0) {
				count += remain / 10;
				remain = remain % 10;
			}
			else if(remain / 5 != 0) {
				count += remain / 5;
				remain = remain % 5;
			}
			else if(remain != 0){
				count += remain;
				break;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

}
