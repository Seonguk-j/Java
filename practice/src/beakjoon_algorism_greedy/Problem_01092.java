package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * 배
 * o 1. 크레인 수 N, 크기가 N인 배열(crainLiftWeight)에 크레인별 감당가능 무게입력받음.
 * o 2. 화물 수 M, 크기가 M인 배열(freightWeight)에 화물 무게 입력받음.
 *  3. 크레인 배열 정렬, 크기가 N인 배열(crainLiftCount)에 크기가 작은 크레인부터 운반 가능 화물수 입력(단, 이전에 count된 화물은 제외)
 *  4. crainLiftCount에서 가장 마지막 입력와 이전 입력값을 비교하여 가장 마지막 값이 이전 입력값과 동일하거나 1만큼 크게 count값 조정.
 *  5.
 */
public class Problem_01092 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long[] crainLiftWeight = new long[N];
		String[] temp1 = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			crainLiftWeight[i] = Long.parseLong(temp1[i]);
		}
		Arrays.sort(crainLiftWeight);
		
		int M = Integer.parseInt(br.readLine());
		long[] freightWeight = new long[M];
		String[] temp2 = br.readLine().split(" ");
		for(int i = 0; i < M; i++) {
			freightWeight[i] = Long.parseLong(temp2[i]);
		}
		Arrays.sort(freightWeight);
		
		int result = 0;
		if(crainLiftWeight[N - 1] >= freightWeight[M - 1])
			result = output(N, crainLiftWeight, M, freightWeight);
		else
			result = -1;
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] crainLiftCount(int N, long[] crainLiftWeight, int M, long[] freightWeight) {
		int[] clc = new int[N];
		int temp = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(count == M)
				break;
			for(int j = temp; j < M; j++) {
				if(crainLiftWeight[i] >= freightWeight[j]) {
					clc[i]++;
				}
				else {
					temp = j;
					break;
				}
				count++;
			}
		}
		return clc;
	}
	
	public static int output(int N, long[] crainLiftWeight, int M, long[] freightWeight) {
		int[] clc = crainLiftCount(N, crainLiftWeight, M, freightWeight);
		int[] result = new int[N];
		int sum = 0;
		int output = 0;
		
		for(int i = 0; i < N; i++) {
			sum += clc[N - i - 1];
			if(sum % (i + 1) == 0)
				result[i] = sum / (i + 1);
			else
				result[i] = sum / (i + 1) + 1;
		}
		Arrays.sort(result);
		output = result[N - 1];
		return output;
	}

}
