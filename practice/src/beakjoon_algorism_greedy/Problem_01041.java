package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 주사위
 */
public class Problem_01041 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] arr = new long[6];
		for(int i = 0; i < 6; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		long[] select = choose(arr);
		
		long sum;
		
		if(N > 1) {
			sum = 4 * (select[0] + select[1] + select[2]) + 4 * (select[0] + select[1]);
			if(N > 2) {
				sum += (select[0] + select[1]) * 4 * (2 * N - 4) + select[0] * (5 * N - 6) * (N - 2);
			}
		}
		else {
			Arrays.sort(arr);
			sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static long[] choose(long[] arr) {
		long[] select = new long[3];
		for(int i = 0; i < 3; i++) {
			if(arr[i] > arr[5 - i]) {
				select[i] = arr[5 - i];
			}
			else {
				select[i] = arr[i];
			}
		}
		Arrays.sort(select);
		return select;
	}

}
