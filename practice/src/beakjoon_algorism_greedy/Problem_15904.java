package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * UCPC
 *  1. 문자열 입력받음.
 *  2. 문자열에 U포함 확인, U이후 문
 */
public class Problem_15904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] input = br.readLine().toCharArray();
		boolean result = true;
		
		if(finder(input, 'U', result)) {
			if(finder(input, 'C', result)) {
				if(finder(input, 'P', result)) {
					if(finder(input, 'C', result)) {
						bw.write("I love UCPC \n");
					}
					else {
						bw.write("I hate UCPC \n");
					}
				}
				else {
					bw.write("I hate UCPC \n");
				}
			}
			else {
				bw.write("I hate UCPC \n");
			}
		}
		else {
			bw.write("I hate UCPC \n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static boolean finder(char[] input, char alphabet, boolean result) {
		for(int i = 0; i < input.length; i++) {
			if(input[i] == alphabet) {
				result = true;
				break;
			}
			else {
				result = false;
			}
			input[i] = 0;
		}
		return result;
	}

}
