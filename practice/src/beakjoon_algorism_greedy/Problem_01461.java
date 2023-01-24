package beakjoon_algorism_greedy;

import java.io.*;
import java.util.*;

public class Problem_01461 {
	
	static ArrayList<Integer> minus = new ArrayList<Integer>(), plus = new ArrayList<Integer>();
	static int M, step = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int distance = Integer.parseInt(st.nextToken());
			if(distance < 0) {
				distance = - distance;
				minus.add(distance);
			}
			else {
				plus.add(distance);
			}
		}
		Collections.sort(minus);
		Collections.sort(plus);
		
		int mMax = 0, pMax = 0;
		if(minus.size() != 0)
			mMax = minus.get(minus.size() - 1);
		if(plus.size() != 0)
			pMax = plus.get(plus.size() - 1);
		
		if(mMax != 0 && pMax != 0) {
			if(mMax < pMax) {
				firstDirection(minus);
				lastDirection(plus);
			}
			else {
				firstDirection(plus);
				lastDirection(minus);
			}
		}
		else if(mMax == 0)
			lastDirection(plus);
		else
			lastDirection(minus);
		
		System.out.println(step);
	}
	
	static void firstDirection(ArrayList<Integer> arr) {
		int remain = arr.size() % M;
		if(arr.size() / M == 0 || (arr.size() / M == 1 && arr.size() % M == 0))
			step = 2 * arr.get(arr.size() - 1);
		else {
			if(remain != 0) {
				step = 2 * arr.get(remain - 1);
			}
			for(int i = 1; i <= arr.size() / M; i++) {
				step += 2 * arr.get(i * M + remain - 1);	
			}
		}
	}
	static void lastDirection(ArrayList<Integer> arr) {
		int remain = arr.size() % M;
		if(arr.size() / M == 0 || (arr.size() / M == 1 && arr.size() % M == 0))
			step += arr.get(arr.size() - 1);
		else {
			if(remain != 0) {
				step += 2 * arr.get(remain - 1);
			}
			for(int i = 1; i < arr.size() / M; i++) {
				step += 2 * arr.get(i * M + remain - 1);	
			}
			step += arr.get(arr.size() - 1);
		}
	}

}
