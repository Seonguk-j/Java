package beakjoon_algorism_greedy;

import java.util.Scanner;

public class Problem_16953_retry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;
		
		while(true) {
			if(A != B) {
				if(((B % 10) == 1) || ((B % 10) == 2) || ((B % 10) == 4) || ((B % 10) == 6) || ((B % 10) == 8)) {
					if((B % 10) == 1) {
						count++;
						B = B / 10;
					}
					else if(B > A) {
						count++;
						B = B / 2;
					}
					else {
						System.out.println("-1");
						break;
					}
				}
				else if(B % A == 0) {
					while(B != A) {
						if(B % 2 == 0) {
							count++;
							B = B / 2;
						}
						else {
							System.out.println("-1");
							break;
						}
					}
				}
				else {
					System.out.println("-1");
					break;
				}
			}
			else {
				System.out.print(count + 1);
				break;
			}
		}
	}

}
