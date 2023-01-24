package Weeks3_day02;

import java.util.ArrayList;
import java.util.Scanner;

import Week3_day01_new.Bus;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
		
		//test용
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i = 0; i < 4; i++) {
//			integerList.add(scanner.nextInt());
//		}
		
		
//		integerList.add(1);
//		integerList.add(3);
//		
//		System.out.println(integerList.size());
//		System.out.println();
//		
//		for(int i = 0; i < integerList.size(); i++) {
//			System.out.println(integerList.get(i));
//		}
		
		ArrayList<Bus> busList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			Bus tempBus = new Bus(i * 10);
			busList.add(tempBus);
		}
		
		for(int i = 0; i < busList.size(); i++) {
			Bus tempBus = busList.get(i);
			System.out.println(tempBus.getBusNumber());
		}
		
	}

}
