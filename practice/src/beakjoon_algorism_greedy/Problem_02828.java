package beakjoon_algorism_greedy;

import java.io.*;
import java.util.*;

public class Problem_02828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int J = Integer.parseInt(br.readLine());
		
		int min = 1;
		int max = min + M - 1;
		int move = 0;
		
		for(int i = 0; i < J; i++) {
			int apple = Integer.parseInt(br.readLine());
			if(apple > max) {
				move += apple - max;
				max = apple;
				min = max - M + 1;
			}
			else if(apple < min) {
				move += min - apple;
				min = apple;
				max = min + M - 1;
			}
		}
		System.out.println(move);
	}

}
