package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * 영역 구하기
 * o 1. 전역변수 boolean[M][N]arr배열 입력.
 * o 2. M, N, K입력받음.
 * o 3. K개의 좌표 입력받음.
 * o 4. 좌표에 포함되는 배열위치 true로 변환.
 *  5. arr의 false값 count.
 */
public class Problem_02583 {

	public static boolean arr[][];
	public static int count;
	public static int M, N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		arr = new boolean[M][N];
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int x_min = Math.min(x1, x2);
			int x_max = Math.max(x1, x2);
			int y_min = Math.min(y1, y2);
			int y_max = Math.max(y1, y2);
			
			for(int j = x_min; j < x_max; j++) {
				for(int k = y_min; k < y_max; k++) {
					arr[k][j] = true;
				}
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(!arr[i][j]) {
					count = 0;
					dfs(i, j);
					output.add(count);
				}
			}
		}
		
		Collections.sort(output);
		bw.write(output.size() + "\n");
		
		for(int i = 0; i < output.size(); i++) {
			bw.write(output.get(i) + " ");
		}
		
		bw.write("\n");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static void dfs(int y, int x) {
		count++;
		arr[y][x] = true;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			
			if(X >= 0 && X < N && Y >= 0 && Y < M && !arr[Y][X]) {
				dfs(Y, X);
			}
		}
	}

}
