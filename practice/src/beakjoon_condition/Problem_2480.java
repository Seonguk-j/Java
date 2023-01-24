package beakjoon_condition;

import java.util.Random;

/*
 * 주사위 세개
 *  1. 1~6 의 숫자를 랜덤으로 3개를 뽑는다.
 *  2. 3개의 숫자를 비교한다.
 *  3. 3개의 숫자가 모두 동일할 경우 상금을 계산한다.
 *  4. 2개의 숫자가 동일할 경우 상금을 계산한다.
 *  5. 3개의 숫자 모두 다를 경우 상금을 계산한다.
 *  6. 결과를 출력한다.
 */
public class Problem_2480 {

	public static void main(String[] args) {
		Random random = new Random();
		int dice[] = new int[3];
		for(int i =0; i < dice.length; i++) {
			dice[i] = Math.abs(random.nextInt())%6+1;
			System.out.print(dice[i] + " ");
		}
		
		int count = 0;
		for(int i = 0; i < dice.length-1; i++) {
			for(int j = 1; i + j < dice.length; j++) {
				if(dice[i] == dice[i+j]) {
					count++;
				}
			}
		}
		
		int price =0;
		if(count > 1) {
			price = 10000 + dice[0] * 1000;
		}
		else if(count == 1) {
			for(int i = 0; i < dice.length-1; i++) {
				for(int j = 1; i + j < dice.length; j++) {
					if(dice[i] == dice[i+j]) {
						price = 1000 + dice[i]*100;
					}
				}
			}
		}
		else {
			if(dice[0] < dice[1]) {
				if(dice[1] < dice[2]) {
					price = dice[2] * 100;
				}
				else {
					price = dice[1] * 100;
				}
			}
			else{
				if(dice[0] < dice[2]) {
					price = dice[2] * 100;
				}
				else {
					price = dice[0] *100;
				}
			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println(price);
	}

}
