package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem_01343 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		input = input.replace("XXXX", "AAAA");
		input = input.replace("XX", "BB");
		
		if(input.contains("X")) {
			bw.write("-1\n");
		}
		else {
			bw.write(input + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
