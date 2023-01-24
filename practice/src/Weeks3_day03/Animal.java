package Weeks3_day03;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eattingFood(String food) {
		System.out.println(name + " 음식 " + food + "를 먹었습니다.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}