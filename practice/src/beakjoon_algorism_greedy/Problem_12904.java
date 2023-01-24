package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem_12904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		String T = br.readLine();
		
		while(S.length() < T.length()) {
			if(T.charAt(T.length() - 1) == 'A') {
				T = T.substring(0, T.length() - 1);
			}
			else {
				T = change(T.substring(0, T.length() - 1));
			}
		}
		
		if(S.equals(T)) {
			bw.write("1");
		}
		else {
			bw.write("0");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static String change(String S)
	{
		S = S.replace("A", "C");
		S = S.replace("B", "A");
		S = S.replace("C", "B");
		return S;
	}
}
