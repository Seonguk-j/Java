package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 연결 요소의 갯수
 *  1. 정점 N, 간선 M 입력받음.
 *  2. 전역변수 ArrayList<ArrayList<Integer>> arr, boolean[] check 작성.
 *  3. 연결요소 갯수 count하는 dfs매소드 작성.
 *  4. count값 출력 
 *  
 */
public class Problem_11724 {
	
	public static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	public static boolean[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
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
		
		for(int i = 1; i <= N; i++) {
			if(!check[i]) {
				dfs(i);
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static void dfs(int i) {
		check[i] = true;
		
		for(int j = 0; j < arr.get(i).size(); j++) {
			int y = arr.get(i).get(j);
			if(!check[y]) {
				dfs(y);
			}
		}
		
	}

}
