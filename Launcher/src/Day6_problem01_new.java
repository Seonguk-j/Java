import java.util.Scanner;

/*
 *��� �̻� �л�
 *	1. ���� N�� ������ ��´�.
 *	2. ���� N��ŭ �л����� ������ �Է��Ѵ�.
 *		- �̶�, �������� �迭�� ����.
 *	3. arr�迭�� �ִ� �л��� ������ ����� ���Ѵ�.
 *	4. ��հ��� �迭�� �ִ� �л����� ������ ���� ���ؼ� ��պ��� ���� �л����� ����ض�.
 */
public class Day6_problem01_new {
	
	public static int number(int n) {
		return n;
	}
	
	public static int average(int[] arr, int aver, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = arr[i] + sum;
		}		
		return aver = sum / n;
	}
	
	public static void good(int[] arr, int aver, int n) {
		for(int i = 0; i < n; i++) {
			if(arr[i]>aver) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int []arr = new int[n];
		int aver = 0;
		int i = 0;
		for(; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(average(arr, aver, n));
		System.out.println(good(arr, aver, n));
	}
	

}