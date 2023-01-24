
public class Day4_test07 {
	public static void main(String[] args) {
		int [] arr = {5, 10, 23, 1, 22};
		int maxValue = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println(maxValue);
	}

}
