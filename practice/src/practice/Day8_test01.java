package practice;

import java.util.Scanner;

/*
 * 배열 정렬
 * 1. 입력값을 받는다(오름차순, 내림차순)
 * 2. 배열을 입력받는다.
 * 3. 두 변수의 값을 서로 교체하기
 * 4. 배열의 수 서로 비교하면서 제일 큰 값을 맨 뒤로 보내기.
 * 5. 4번 로직을 여러번 반복한다.
 */

//퀵정렬, 합병정렬, Array.sort

public class Day8_test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int type = scanner.nextInt();
		int arr[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			arr[i] = scanner.nextInt();
		}
		
		if(type == 1) {
			for(int j = arr.length; j > 0; j--) {
				for(int i = 0; i < j - 1; i++) {
					if(arr[i]> arr[i+1]) {
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
				}
			}
		}
		
		else if(type ==2){
			for(int j = arr.length; j > 0; j--) {
				for(int i = 0; i < j - 1; i++) {
					if(arr[i] < arr[i+1]) {
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
				}
			}
		}
		
		else {
			System.out.println("error");
		}
		
		//출력
		System.out.println(type);
		for(int i = 0; i<6; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
