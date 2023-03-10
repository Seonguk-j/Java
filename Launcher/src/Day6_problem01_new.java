import java.util.Scanner;

/*
 *평균 이상 학생
 *	1. 숫자 N을 변수에 담는다.
 *	2. 숫자 N만큼 학생들의 성적을 입력한다.
 *		- 이때, 성적들이 배열에 들어간다.
 *	3. arr배열에 있는 학생들 성적의 평균을 구한다.
 *	4. 평균값과 배열에 있는 학생들의 성적을 전부 비교해서 평균보다 높은 학생들을 출력해라.
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
