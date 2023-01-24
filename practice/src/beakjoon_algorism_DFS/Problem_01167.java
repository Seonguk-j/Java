package beakjoon_algorism_DFS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_01167 {
	static ArrayList<Node> arr[];
	static boolean[] check;
	static int max, idx_max;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		arr = new ArrayList[N + 1];
		
		for(int i = 0; i <= N; i++) {
			arr[i] = new ArrayList<Node>();
		}
		
		for(int i = 0; i < N; i++) {
			int a = scan.nextInt();
			while(true) {
				int b, c;
				b = scan.nextInt();
				if(b == -1) 
					break;
				
				c = scan.nextInt();
				arr[a].add(new Node(b, c));
			}
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

class Node{
	int idx, dist;
	Node(int idx, int dist) {
		this.idx = idx;
		this.dist = dist;
	}
}