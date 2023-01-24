package Week3_day01_new;

import java.util.ArrayList;

public class Bus {
	int busNumber;
	int passengerCount; // 승객수
	int money; //버스의 매출
	ArrayList<String> passengerList;
	
	private static int allOfBusCount;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		passengerList = new ArrayList<>();
		allOfBusCount++;
	}
	
	public void take(String name, int money) {
		this.money += money;
		passengerCount++;
		passengerList.add(name);
	}
	
	public void printInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 매출은 " + money + "입니다.");
		System.out.println("현재 탑승 승객의 이름은 다음과 같습니다.");
		for(int i = 0; i < passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
	}
	
	public int getAllOfBusCount() {
		return allOfBusCount;
	}

	public int getBusNumber() {
		// TODO Auto-generated method stub
		return busNumber;
	}

}
