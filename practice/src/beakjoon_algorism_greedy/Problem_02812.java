package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Problem_02812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		char[] arr = br.readLine().toCharArray();
		
		Deque<Character> dq = new ArrayDeque<>();
		for(int i = 0; i < arr.length; i++) {
			while(K > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
				dq.removeLast();
				K--;
			}
			dq.addLast(arr[i]);
		}
		
		StringBuilder ans = new StringBuilder();
		
		while(dq.size() > K) {
			ans.append(dq.removeFirst());
		}
		
		bw.write(ans.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
