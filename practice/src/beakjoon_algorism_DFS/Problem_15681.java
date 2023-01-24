package beakjoon_algorism_DFS;
/*
 * 트리와 쿼리
 *  1. 정점의 수 N, 루트번호 R, 쿼리 수 Q 입력받음
 *  2. N-1개의 간선정보 입력받음.
 *  3. Q개의 U 입력값 받음.
 *  4. dfs(R)을 통해 U가 루트가 되는 서브트리 확인.
 *  5. 답 계산.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_15681 {
	
	static ArrayList<Integer>[] tree;
	static int[] cnt;
	static boolean[] check;
	static int U;
	static int output;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		tree = new ArrayList[N + 1];
		cnt = new int[N + 1];
		check = new boolean[N + 1];
		for(int i = 0; i < N + 1; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			tree[x].add(y);
			tree[y].add(x);
		}
		
		dfs(R);
		
		for(int i = 0; i < Q; i++) {
			int output = Integer.parseInt(br.readLine());
			bw.write((cnt[output] + 1) / 2 + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs(int node) {
		if(!check[node]) {
			cnt[node] = 1;
			check[node] = true;
			for(int i = 0; i < tree[node].size(); i++) {
				dfs(tree[node].get(i));
			}
			for(int i = 0; i < tree[node].size(); i++) {
				cnt[node] += cnt[tree[node].get(i)];
			}
		}
	}

}
