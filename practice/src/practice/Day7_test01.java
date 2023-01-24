package practice;

import java.util.Random;

public class Day7_test01 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		for(int i = 0; i < 6; i++) {
			Random random = new Random();
			int randomValue = Math.abs(random.nextInt())%45 + 1;
			
			arr[i] = randomValue;
			boolean overlap = false;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					overlap = true;
					break;
				}
			}
			if(overlap == true) {
				i = i-1;
				continue;
			}
			System.out.print(arr[i] + " ");
		}
		
	}

}
