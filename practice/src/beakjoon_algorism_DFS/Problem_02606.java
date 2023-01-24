package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_02606 {

	public static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	public static boolean[] check;
	public static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		check = new boolean[N + 1];
		
		for(int i = 0; i <= N; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		dfs(1);
		
		System.out.println(count);
		
	}
	
	public static void dfs(int number) {
		check[number] = true;
		
		for(int i = 0; i < arr.get(number).size(); i++) {
			int x = arr.get(number).get(i);
			if(!check[x]){
				count++;
				dfs(x);
			}
		}
	}

}
