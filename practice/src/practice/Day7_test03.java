package practice;

import java.util.Scanner;

/*
 * 장바구니 할인
 * 1. 입력을 받는다.
 * 2. 0을 입력받으면 종료가 된다.
 * 3. 반복문을 세어준다.
 * 4. 입력값별로 가격을 책정한다.
 * 5. 가격을 합산한다.
 * 6. 금액별 할인율을 적용한다.
 * 7. 할인이 적용된 금액을 출력한다.
 */
public class Day7_test03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int list[] = new int[1000];
		int count = 0;
		
		while(true) {
			int kind = scanner.nextInt();
			if(kind != 0) {
				list[count] = kind;
				count++;
			}
			else {
				break;
			}
		}
		
		int price[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			if(list[i] == 1) {
				price[i] = 5000;
			}
			else if(list[i] == 2) {
				price[i] = 7000;
			}
			else if(list[i] == 3) {
				price[i] = 10000;
			}
			else {
				System.out.println("입력에러");
			}
		}
		
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum = price[i] + sum;
		}
		
		if(sum >= 100000) {
			sum = (int) (sum*0.8);
		}
		else if(sum >= 50000) {
			sum = (int) (sum * 0.9);
		}
		else if(sum >= 10000) {
			sum = (int) (sum * 0.95);
		}
		
		System.out.println(sum);
	}

}
