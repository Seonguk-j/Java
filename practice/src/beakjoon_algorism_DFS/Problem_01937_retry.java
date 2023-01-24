package beakjoon_algorism_DFS;
/*
 * 욕심쟁이 판다
 *  1. 숲의 크기 n 입력받음.
 *  2. [n][n]배열에 구역별 대나무수 입력받음.
 *  3. ArrayList<Integer> [n*n]에 이동가능 위치 입력함.
 *  4. dfs매소드 작성.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_01937_retry {

	static ArrayList<Integer> tree[];
	static boolean check[];
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	static int cnt, n;
	
	public static void main(String[] args) throws IOException {
		long timeStart = System.currentTimeMillis();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		int[][] forest = new int[n][n];
		tree = new ArrayList [n * n];
		for(int i = 0; i < n * n; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				forest[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int y = 0; y < n; y++) {
			for(int x = 0; x < n; x++) {
				for(int i = 0; i < 2; i++) {
					int X = x + dx[i];
					int Y = y + dy[i];
					if(X < n && Y < n) {
						if(forest[y][x] > forest[Y][X]) {
							tree[Y * n + X].add(y * n + x);
						}
						else if(forest[y][x] < forest[Y][X]) {
							tree[y * n + x].add(Y * n + X);
						}
					}
				}
			}
		}
		
		for(int i = 0; i < tree.length; i++) {
			if((i == 0 || i == n - 1 || i == n * (n - 1) || i == n * n - 1) && tree[i].size() == 2) {
				check = new boolean[n * n];
				dfs(i, 0);
			}
			else if(((i % n == 0 || i % n == n - 1 || i / n == 0 || i / n == n - 1) && tree[i].size() == 3)) {
				check = new boolean[n * n];
				dfs(i, 0);
			}
			else if(tree[i].size() == 4) {
				check = new boolean[n * n];
				dfs(i, 0);
			}
		}
		System.out.println(cnt);

		long timeEnd = System.currentTimeMillis();
		System.out.println("수행시간: " + (timeEnd - timeStart) + " ms");	}
	
	static void dfs(int input, int count) {
		count++;
		cnt = Math.max(count, cnt);
		check[input] = true;
		for(int i = 0; i < tree[input].size(); i++) {
			if(!check[tree[input].get(i)])
				dfs(tree[input].get(i), count);
		}
		check = new boolean[n * n];
	}

}
