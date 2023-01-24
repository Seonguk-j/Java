package Weeks3_day03;
/*
 * 상속, 기본 예제1 - 동물
 */
public class Test01 {

	public static void main(String[] args) {
		Dog dog = new Dog("똘이");
		System.out.println(dog.getName());
		dog.eattingFood("소고기");
	}

}
