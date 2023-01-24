package Week3_day01_new;

import java.util.ArrayList;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	ArrayList<String> passengerList;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
		passengerList = new ArrayList<>();
	}
	
	public void take(String name, int money) {
		this.money += money;
		passengerCount++;
		passengerList.add(name);
	}
	
	public void printInfo() {
		System.out.println("지하철 " + subwayNumber + "번의 승객은 " + passengerCount + "명이고, 매출은 " + money + "입니다.");
		System.out.println("현재 탑승 승객의 이름은 다음과 같습니다.");
		for(int i = 0; i < passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
	}

}
