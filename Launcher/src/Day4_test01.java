
public class Day4_test01 {

	public static void main(String[] args) {
//		int arr[] = new int[4];
		int[] arr = {5, 10, 1, 3, 40};
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("0번째항 : " + arr[0]);
		System.out.println("1번째항 : " + arr[1]);
		System.out.println("2번째항 : " + arr[2]);
		System.out.println("3번째항 : " + arr[3]);
//		System.out.println("4번째항 : " + arr[4]);
		System.out.println();
		
		arr[0] = 2;
		System.out.println("0번째항 : " + arr[0]);
		arr[2] = 3;
		System.out.println("2번째항 : " + arr[2]);
	}

}
