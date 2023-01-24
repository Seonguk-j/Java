import java.util.Scanner;

public class Day3_homework03 {

	public static void main(String[] args) {
		String a = "Do it Java Programming";
		String b = a.toUpperCase();
		Scanner scanner = new Scanner(System.in);
		String c = scanner.nextLine();
		String d = c.toUpperCase();
		
		if(b.contains(d)) {
			System.out.println(b.indexOf(d));
		}
		else {
			System.out.println("-1");
		}
	}

}
