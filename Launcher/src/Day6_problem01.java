import java.util.Scanner;

/*
 *��� �̻� �л�
 *	1. ���� N�� ������ ��´�.
 *	2. ���� N��ŭ �л����� ������ �Է��Ѵ�.
 *		- �̶�, �������� �迭�� ����.
 *	3. arr�迭�� �ִ� �л��� ������ ����� ���Ѵ�.
 *	4. ��հ��� �迭�� �ִ� �л����� ������ ���� ���ؼ� ��պ��� ���� �л����� ����ض�.
 */
public class Day6_problem01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			}
		int sum = 0;
		int aver = 0;
		for(int i = 0; i <n; i++) {
		sum = arr[i] + sum;
		aver = sum / n;
		}
		
		System.out.println(aver);
		
		for(int i = 0; i < n; i++) {
			if(arr[i]>aver) {
				System.out.print(arr[i] + " ");
			}
		}
		

	}
	

}