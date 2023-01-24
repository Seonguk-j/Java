package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 통나무 건너뛰기
 */
public class Problem_11497 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];

		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			String height = br.readLine();
			arr[i] = output(n, height);
		}
		
		for(int i = 0; i < N; i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] input(int n, String height) {
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(height);
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] temp = Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp);
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				arr[i / 2] = temp[i];
			}
			else {
				arr[n - (i + 1) / 2] = temp[i];
			}
		}
		return arr;
	}
	
	public static int output(int n, String height) {
		int[] arr = input(n, height);
		int[] compare = new int[n];
		int max = 0;
		
		for(int i = 0 ; i < n; i++) {
			if(i != n - 1) {
				compare[i] = Math.abs(arr[i + 1] - arr[i]);
			}
			else {
				compare[i] = Math.abs(arr[n - 1] - arr[0]);
			}
		}
		for(int i = 0; i < n; i++) {
			if(max <= compare[i]) {
				max = compare[i];
			}
		}
		return max;
	}

}
