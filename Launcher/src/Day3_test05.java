
public class Day3_test05 {

	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.indexOf("JavA"));
		System.out.println(a.indexOf("Java"));
		System.out.println(a.charAt(0));
		System.out.println(a.replaceAll("java", "World"));
		System.out.println(a.substring(0, 4));//ù�ܾ���� ���ܾ� ������ ǥ����
		System.out.println(a.toUpperCase());//��� �빮�ڷ� �����Ѵ�
		System.out.println(a.toLowerCase());//��� �ҹ��ڷ� ����, �� ������
	}

}
