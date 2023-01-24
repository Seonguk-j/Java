package beakjoon_algorism_greedy;
/*
 * 우유 축제
 *  1. 일단 입력받고
 *  2. 0 -> 1 -> 2 -> 0 이 되면 cnt++
 */
import java.io.*;
import java.util.*;

public class Problem_14720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int drink = 0, cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int store = Integer.parseInt(st.nextToken());
			if(drink == store) {
				cnt++;
				drink++;
				if(drink == 3)
					drink = 0;
			}
		}
		System.out.println(cnt);
	}

}
