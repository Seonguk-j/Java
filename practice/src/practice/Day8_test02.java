package practice;

import java.util.Scanner;

/*
 * 윤년
 * 1. 년도를 입력받는다.
 * 2. 4의 배수 = 윤년이다.
 * 3. 4의 배수면서 100의 배수라면 =윤년x
 * 4. 4의 배수면서, 100의 배수면서, 400의 배수라면 = 윤년
 */
public class Day8_test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
		
	}

}
