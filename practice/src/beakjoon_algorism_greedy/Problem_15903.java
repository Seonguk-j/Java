package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
 * 카드 합체 놀이
 *  1. 
 */
public class Problem_15903 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(long i = 0; i < n; i++) {
			pq.add(Long.parseLong(st.nextToken()));
		}
		
		long temp1;
		long temp2;
		
		for(int i = 0; i < m; i++) {
			temp1 = pq.peek();
			pq.poll();
			temp2 = pq.peek();
			pq.poll();
			long sum = temp1 + temp2;
			pq.add(sum);
			pq.add(sum);
		}
		
		long output = 0;
		for(long i = 0; i < n; i++) {
			output += pq.peek();
			pq.poll();
		}
		
		bw.write(output + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
