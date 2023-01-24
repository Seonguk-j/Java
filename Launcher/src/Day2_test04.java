
public class Day2_test04 {
	final static int AMERICANO = 1;
	final static int CAFFUCINO = 2;
	final static int LEMONADE = 3;
	public static void main(String[] args) {
		int userChoice = AMERICANO;
		switch(userChoice) {
			case AMERICANO :
				System.out.println("아메리카노");
				break;
			case CAFFUCINO :
				System.out.println("카푸치노");
				break;
			case LEMONADE :
				System.out.println("레몬에이드");
				break;
			default :
				System.out.println("다른거");
				break;
		}
	}	

}
