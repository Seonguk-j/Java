package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem_02668 {
	static int[] arr;
	static boolean[] check;
	static ArrayList<Integer> output = new ArrayList<Integer>();
	static int finish, cnt;
	static boolean isCycle;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n + 1];
		check = new boolean[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= n; i++) {
			if(i == arr[i]) {
				output.add(i);
			}
			else {
				if(!check[i]) {
					isCycle = false;
					cnt = 0;
					check[i] = true;
					finish = i;
					dfs(i);
					if(!isCycle) {
						for(int j = 0; j < cnt; j++) {
							output.remove(output.size() - 1);
						}
					}
				}
			}
		}
		Collections.sort(output);
		System.out.println(output.size());
		for(int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}

	static void dfs(int temp) {
		output.add(temp);
		cnt++;
		if(arr[temp] == finish) {
			isCycle = true;
		}
		if(!check[arr[temp]]) {
			check[arr[temp]] = true;
			dfs(arr[temp]);
			check[arr[temp]] = false;
		}
	}
}
