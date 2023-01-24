
public class Day3_test05 {

	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.indexOf("JavA"));
		System.out.println(a.indexOf("Java"));
		System.out.println(a.charAt(0));
		System.out.println(a.replaceAll("java", "World"));
		System.out.println(a.substring(0, 4));//첫단어부터 끝단어 전까지 표현함
		System.out.println(a.toUpperCase());//모두 대문자로 변경한다
		System.out.println(a.toLowerCase());//모두 소문자로 변경, 잘 사용안함
	}

}
