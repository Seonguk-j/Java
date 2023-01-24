import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
	static BufferedReader br;
	static StringTokenizer st;
	static long[][] dpArr;
	static long[][] forest;
	static Node[] nodeArr;
	static int[][] dirArr ={{-1, 0}, {1,0}, {0,-1}, {0, 1}};
	static long max = 1;
	
	static class Node implements Comparable<Node>{
		int x, y;
		long tree;
		
		Node(int x, int y, long tree){
			this.x = x;
			this.y = y;
			this.tree = tree;
		}

		@Override
		public int compareTo(Node o) {
			return (int) (this.tree - o.tree);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dpArr = new long[n][n];
		forest = new long[n][n];
		nodeArr = new Node[n*n];
		
		for(int i = 0; i <n; i ++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <n ; j++) {
				forest[i][j] = Long.parseLong(st.nextToken());
				nodeArr[n*i + j] = new Node(i, j, forest[i][j]);
			}
		}
		
		Arrays.sort(nodeArr);
		for(int i = 0; i < n; i++) {
			Arrays.fill(dpArr[i], 1);
		}
		
		max = 0;
		for(int i = 0; i <nodeArr.length; i++) {
			Node item = nodeArr[i];
			updateDuration(item, n);
		}
		System.out.println(max);
	}
	
	public static void updateDuration(Node item, int n) {
		
		long tree = item.tree;
		for(int i = 0; i < dirArr.length; i ++) {
			int x = item.x + dirArr[i][0];
			int y = item.y + dirArr[i][1];
			
			if(x >= 0 && x < n && y>= 0 && y < n) {
				if(forest[x][y] > tree) {
					dpArr[x][y] = Math.max(dpArr[x][y], dpArr[item.x][item.y] + 1);
					max = Math.max(max, dpArr[x][y]);
				}
			}
		}
		
	}
}