import java.util.Scanner;

public class Day2_test08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a == 0 || b == 0) {
			System.out.println("0���� ���� �� ����");
		}
		else {
			int divideValue = a/b;
			int remainValue = a%b;
			System.out.println("�� : " + divideValue);
			System.out.println("������ : " + remainValue);
		}
	}

}
