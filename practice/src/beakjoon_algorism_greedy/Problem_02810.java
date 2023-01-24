package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * 컵홀
 */
public class Problem_02810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int countS = 0;
		int countL = 0;
		int disposable;
		
		int n = Integer.parseInt(br.readLine());
		
		char[] seat = br.readLine().toCharArray();
				
		
		for(int i = 0; i < n; i++) {
			if(seat[i] == 'S') {
				countS++;
			}
			else {
				countL++;
			}
		}
		
		if(countL > 0) {
			disposable = countS + countL / 2 + 1;
		}
		else {
			disposable = countS;
		}
		
		bw.write(disposable + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
