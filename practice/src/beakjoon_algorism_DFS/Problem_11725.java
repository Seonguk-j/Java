package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 트리의 부모 찾기
 * 조건: 뿌리는 1이다.
 *  1. N입력받기
 *  2. 크기가 [N + 1][N + 1]인 전역변수 배열 만들기
 *  3. 배열에 연결관계 입력
 *  4. 
 */
public class Problem_11725 {
	
	public static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	public static boolean[] check;
	public static int N;
	public static int[] output;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		check = new boolean[N + 1];
		output = new int [N + 1];
		
		for(int i = 0; i <= N; i++) {
			arr.add(new ArrayList<Integer>());
		}
		for(int i = 0 ; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		
		dfs(1);
		for(int i = 2; i <= N; i++) {
			bw.write(output[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static void dfs(int x) {
		if(!check[x]) {
			check[x] = true;
			for(int i = 0; i < arr.get(x).size(); i++) {
				int temp = arr.get(x).get(i);
				if(!check[temp]) {
					output[temp] = x;
					dfs(temp);
				}
			}
		}
	}

}
