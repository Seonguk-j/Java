
public class Day2_test04 {
	final static int AMERICANO = 1;
	final static int CAFFUCINO = 2;
	final static int LEMONADE = 3;
	public static void main(String[] args) {
		int userChoice = AMERICANO;
		switch(userChoice) {
			case AMERICANO :
				System.out.println("�Ƹ޸�ī��");
				break;
			case CAFFUCINO :
				System.out.println("īǪġ��");
				break;
			case LEMONADE :
				System.out.println("�����̵�");
				break;
			default :
				System.out.println("�ٸ���");
				break;
		}
	}	

}
