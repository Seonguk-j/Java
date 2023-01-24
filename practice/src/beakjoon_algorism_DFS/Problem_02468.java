package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
 * 안전 영역
 * o 1. N입력받음.
 * o 2. 전역변수 boolean[][] map 작성.
 * o 3. 크기가 N인 배열 작성, 고도를 1 ~ 100과 비교하여 크면 true, 작으면 false입력.
 *  4. 안전구역 count하는 dfs매소드 작성.
 *  5. count값 출력.
 */
public class Problem_02468 {

	public static int[][] map;
	public static boolean[][] check;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringTokenizer st;
		int count;
		
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int x = Integer.parseInt(st.nextToken());
				map[i][j] = x;
				if(!arr.contains(x)) {
					arr.add(x);
				}
			}
		}
		
		for(int k = 0; k < arr.size(); k++) {
			check = new boolean[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] > arr.get(k)) {
						check[i][j] = true;
					}
				}
			}
			
			count = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(check[i][j]) {
						dfs(N, i, j);
						count++;
					}
				}
			}
			pq.add(count);
		}
		
		if(pq.peek() == 0) {
			bw.write("1\n");
		}
		else {
			bw.write(pq.peek() + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static void dfs(int N, int x, int y) {
		check[x][y] = false;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < N && Y >= 0 && Y < N && check[X][Y]) {
				dfs(N, X, Y);
				continue;
			}
		}
		
	}
	
}
