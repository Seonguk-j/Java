package practice;

import java.util.Scanner;

public class Teacher_03 {

	/*
	 * √1. 반복문을 돌면서 0을 만나기 전까지는 모든 숫자들을 저장해라
	 * √2. 반복문을 돌면서 숫자들은 arr에 저장한다
	 * √3. 반복문을 돌면서 몇번 반복했는지 횟수를 세어준다. (count)
	 * √4. 모든 숫자들을 각각 가격으로 변경해준다
	 * √5. 합계를 낸다.
	 * √6. 합계에 따라 할인을 적용해준다.
	 * √7. 출력해준다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[1000];
		int count = 0;
		
		while(true) {
			int num = scanner.nextInt();
			if(num == 0) {
				break;
			}
			else {
				arr[count] = num;
				count++;
			}
		}
		
		int price[] = new int[count];
		
		for(int i=0; i<count; i++) {
			if(arr[i] == 1) {
				price[i] = 5000;
			}
			else if(arr[i] == 2) {
				price[i] = 7000;
			}
			else if(arr[i] == 3) {
				price[i] = 10000;
			}
			else {
				System.out.println("에러");
			}
		}
		
		int sum = 0;
		for(int i=0; i<price.length; i++) {
			sum = sum + price[i];
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
