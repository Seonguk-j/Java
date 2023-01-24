package Weeks3_day3_abstract;
/*
 * 추상클래스 & 추상메서드
 * 
 * 1. 상위클래스가 추상클래스인 경우, 하위클래스는 상위클래스의 모든 추상메서드를 구현해야한다.
 * 2. 상위클래스가 추상클래스인 경우, 하위클래스도 마찬가지로 추상클래스라면,
 * 		더 밑에 존재하는 자식클래스에게 추상메서드 구현을 미룬다.
 * 		그러므로 추상클래스는 상위클래스에서 정의한 모든 추상메서드를 구현할 의무를 자식에게 넘길 수 있다.
 * 3. 추상클래스는 직접적으로 인스턴스화 할 수 없다. (new 사용)
 */
public class Test01 {

	public static void main(String[] args) {
	//	computer c1 = new Computer();
		Computer c2 = new DeskTop();
	//	computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c2.typing();
		c4.display();
		c4.typing();
	}
}
