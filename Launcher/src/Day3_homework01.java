import java.util.Scanner;

public class Day3_homework01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		if(name.contains(" ")) {
			String[] result = name.split(" ");
			System.out.println("º∫ : " + result[0]);
			System.out.println("¿Ã∏ß : " + result[1]);
		}
		else {
			System.out.println("error");
		}
		
	}

}
