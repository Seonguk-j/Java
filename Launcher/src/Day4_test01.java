
public class Day4_test01 {

	public static void main(String[] args) {
//		int arr[] = new int[4];
		int[] arr = {5, 10, 1, 3, 40};
		System.out.println("�迭�� ���� : " + arr.length);
		System.out.println("0��°�� : " + arr[0]);
		System.out.println("1��°�� : " + arr[1]);
		System.out.println("2��°�� : " + arr[2]);
		System.out.println("3��°�� : " + arr[3]);
//		System.out.println("4��°�� : " + arr[4]);
		System.out.println();
		
		arr[0] = 2;
		System.out.println("0��°�� : " + arr[0]);
		arr[2] = 3;
		System.out.println("2��°�� : " + arr[2]);
	}

}