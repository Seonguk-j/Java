package beakjoon_condition;

import java.util.Scanner;

/*
 * 오븐시계
 *  1. 시간과 분을 입력받는다.
 *  2. 요리하는데 걸리는 시간(단위 분)을 입력받는다.
 *  3. 요리하는데 걸리는 시간을 시간과 분으로 나눈다.
 *  4. 요리가 종료되는 시간을 계산후 출력한다.
 */
public class Problem_2525 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time[]= new int[2];
		
		for(int i = 0; i < 2; i++) {
			time[i] = scanner.nextInt();
		}
		int cooking = scanner.nextInt();
		int hour = cooking / 60;
		int minute = cooking % 60;
			if(time[0] >= 0 && time[0] <= 23 && time[1] >= 0 && time[1] <= 59) {
				time[0] = time[0] + hour;
				time[1] = time[1] + minute;
				if(time[0] >= 24) {
					if(time[1] >= 60) {
						time[0] = (time[0] % 24 + 1) %24;
						time[1] = time[1] % 60;
					}
					else {
						time[0] = time[0] % 24;
						time[1] = time[1] % 60;	
					}
				}
				else {
					if(time[1] >= 60) {
						time[0] = (time[0] + 1)%24;
						time[1] = time[1] % 60;
					}
				}
			}
			else {
				System.out.println("입력에러");
			}
		System.out.print(time[0] + " " + time[1]);
	}

}
