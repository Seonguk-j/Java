package beakjoon_algorism_DFS;
/*
 * 나무 탈출
 *  1. 일단 값 입력받음.
 *  2. 1을 제외하고 크기가 1인 i번째배열들은 리프노드 따로 저장
 *  3. 리프에서 루트까지 가는데 걸리는 횟수 count
 *  4. count%2의 값이 0이면 Yes 아니면 No
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_15900 {
	
	static ArrayList<Integer>[] tree;
	static ArrayList<Integer> leaf = new ArrayList<Integer>();
	static boolean[] check;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		tree = new ArrayList[N + 1];
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
		check= new boolean[N + 1];
		dfs(1, 0);
		if(cnt%2 == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static void dfs(int node, int count) {
		check[node] = true;
		if(node == 1 || tree[node].size() != 1) {
			count++;
			for(int i = 0; i < tree[node].size(); i++) {
				if(!check[tree[node].get(i)]) {
					dfs(tree[node].get(i), count);
				}
			}
		}
		else
			cnt += count;
	}
}
