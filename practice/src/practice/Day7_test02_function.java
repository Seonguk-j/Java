package practice;

import java.util.Scanner;

/*
 * 카멜표기법
 * 1. 문장을 입력받는다.
 * 2. 문장을 단어별로 분리한다.
 * 3. 단어의 첫글자를 대문자로 만든다.
 */
public class Day7_test02_function {
	public static String output(String input, String[] arr) {
		String output = "";
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				String first = arr[i].substring(0, 1).toLowerCase();
				String remain = arr[i].substring(1, arr[i].length()).toLowerCase();
				arr[i] = first + remain;
			}
			else {
				String first = arr[i].substring(0, 1).toUpperCase();
				String remain = arr[i].substring(1, arr[i].length()).toLowerCase();
				arr[i] = first + remain;
			}
			output = output + arr[i];
		}
		return output;
	}
	
	public static String input(String input) {
		String[] arr = input.split(" ");
		return output(input, arr);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		System.out.println(input(input));
	}

}
