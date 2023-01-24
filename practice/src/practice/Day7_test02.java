package practice;

import java.util.Scanner;

public class Day7_test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String []word = input.split(" ");
		for(int i = 0; i < word.length; i++) {
			if(i == 0) {
				String first = word[i].substring(0, 1).toLowerCase();
				String remain = word[i].substring(1, word[i].length()).toLowerCase();
				word[i] = first + remain;
			}
			else {
				String first = word[i].substring(0, 1).toUpperCase();
				String remain = word[i].substring(1, word[i].length()).toLowerCase();
				word[i] = first + remain;
			}
		}
		
		for(int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
	}

}
