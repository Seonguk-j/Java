
public class Day3_test01 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1.equals("hello"));
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
	}

}
