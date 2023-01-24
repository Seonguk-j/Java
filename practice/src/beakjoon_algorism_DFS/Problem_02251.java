package beakjoon_algorism_DFS;
/*
 * 물통
 *  1. A, B, C입력받음.
 *  2. if) A >= B => C, C - B(if C < B => 0)
 *  3. else) if) A + B > C => C, B, n * A, C - B, C - n * A
 *  4. ArrayList에 추가.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_02251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(C);
		if(A >= B) {
			if(C < B) {
				arr.add(0);
			}
			else {
				arr.add(C - B);
			}
		}
		else {
			if(A + B > C) {
				arr.add(B);
				int i = 1;
				while(A * i < C) {
					arr.add(A * i);
					i++;
				}
				int j = 1;
				while(C - j * A > C - B) {
					
				}
			}
		}
	}

}
