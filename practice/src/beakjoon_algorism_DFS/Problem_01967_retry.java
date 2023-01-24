package beakjoon_algorism_DFS;
/*
 * 트리의 지름
 *  1.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_01967_retry {
	
	static ArrayList<Node> arr[];
	static boolean[] check;
	static int max, idx_max;
	static int sum = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[N + 1];
		for(int i = 0; i <= N; i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b, c));
			arr[b].add(new Node(a, c));
		}
		
		check = new boolean[N + 1];
		check[1] = true;
		dfs(1, 0);
		
		check = new boolean[N + 1];
		check[idx_max] = true; 
		dfs(idx_max, 0);
		System.out.println(max);
	}
	
	static void dfs(int idx, int cnt) {
		if(max < cnt) {
			max = cnt;
			idx_max = idx;
		}
		for(Node x : arr[idx]) {
			if(!check[x.idx]) {
				check[x.idx] = true;
				dfs(x.idx, cnt + x.dist);
			}
		}
	}
}
//class Node{
//	int idx, dist;
//	Node(int idx, int dist) {
//		this.idx = idx;
//		this.dist = dist;
//	}
//}
