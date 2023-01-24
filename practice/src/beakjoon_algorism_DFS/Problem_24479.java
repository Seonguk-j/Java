package beakjoon_algorism_DFS;
/*
 * 알고리즘 수 - 깊이 우선 탐색 1
 *  1. 정점 N, 간선 M, 시작 정점 R입력받음.
 *  2. ArrayList<Integer>[] arr작성 후 배열 오름차순 정렬
 *  3. int[N + 1]배열에 순서 입력.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem_24479 {
	
	static int N, M, R, cnt;
	static ArrayList<Integer>[] arr;
	static int[] output;
	static boolean[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		check = new boolean[N + 1];
		output = new int[N + 1];
		arr = new ArrayList[N + 1];
		for(int i = 0; i < N + 1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x].add(y);
			arr[y].add(x);
		}
		for(int i = 1; i < N + 1; i++) {
			Collections.sort(arr[i]);
		}
		dfs(R);
		for(int i = 1; i < N + 1; i++) {
			System.out.println(output[i]);
		}
	}
	
	static void dfs(int node) {
		output[node] = ++cnt;
		check[node] = true;
		for(int i = 0; i < arr[node].size(); i++) {
			if(!check[arr[node].get(i)]) {
				dfs(arr[node].get(i));
			}
		}
	}

}
