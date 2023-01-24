package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 적록색약
 * o 1. 크기가 [N][N]인 배열 작성.
 * o 2. 배열에 값 입력
 *  3. 색약이 아닌사람이 보는 구역의 개수 count
 *  4. 색약인 사람이 보는 구역의 개수 count
 *  5. 출력.
 */
public class Problem_10026 {

	public static char[][] color;
	public static boolean[][] check;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count;
		
		int N = Integer.parseInt(br.readLine());
		
		color = new char[N][N];
		for(int i = 0; i < N; i++) {
			color[i] = br.readLine().toCharArray();
		}
		
		for(int x = 0; x < 2; x++) {
			check = new boolean[N][N];
			
			count = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(!check[i][j]) {
						char temp = color[i][j];
						dfs(N, i, j, temp);
						count++;
					}
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(color[i][j] == 'R') {
						color[i][j] = 'G';
					}
				}
			}
			
			bw.write(count + " ");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static void dfs(int N, int x, int y , char temp) {
		check[x][y] = true;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			
			if(X >= 0 && X < N && Y >= 0 && Y < N && !check[X][Y] && color[X][Y] == temp) {
				dfs(N, X, Y, temp);
				continue;
			}
			
		}
		
	}

}
