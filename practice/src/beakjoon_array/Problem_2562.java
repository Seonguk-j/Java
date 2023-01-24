package beakjoon_array;

import java.util.Scanner;

public class Problem_2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[9];
		int max = 0;
		for(int i = 0; i < 9; i++) {
			num[i] = scanner.nextInt();
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9 - i; j++) {
				if(num[i] > num[j]) {
					max = num[i];
				}
			}
		}
		
		int count = 0;
		while(num[count] != max) {
			count++;
			if(num[count] == max) {
				count = count +1;
				break;
			}
		}
		System.out.println(count);
		System.out.println(max);
	}

}
