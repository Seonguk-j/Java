package Chapter4;

import java.util.Scanner;

class Player{
	String name, word;
	public Player (String name){
		this.name = name;
	}
	public void getWordFromUser(String word) {
		this.word = word;
	}
	public boolean checkSuccess() {
		int lastIndex = word.length() - 1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = word.charAt(0);
		if(lastChar == firstChar) {
			return true;
		}
		else
			return false;
	}
}

public class WordGameApp {
	
	static Player[] player;
	
	static void run (int number) {
		Scanner scanner = new Scanner(System.in);
		player = new Player[number];
		for(int i = 0; i < number; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			player[i] = new Player(name);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int number = scanner.nextInt();
				
		run(number);
		
		int i = 0;
		String word = "아버지";
		
		System.out.println("시작하는 단어는 아버지 입니다");
		while(true) {
			System.out.print(player[i % number].name);
			word = scanner.next();
			player[i % number].getWordFromUser(word);
		}
//		for(int i = 0; i < number; i++) {
//			System.out.println(player[i].name);
//		}
		
	}

}
