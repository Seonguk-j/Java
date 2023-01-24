package Weeks3_day3_abstract;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켜다");
	}
	public void turnOff() {
		System.out.println("전원을 끄다");
	}
}
