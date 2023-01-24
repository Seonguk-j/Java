package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem_04963 {
	
	public static int[][] island;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int count;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			if(w == 0 && h == 0) {
				break;
			}
			
			island = new int[h][w];
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					island[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			count = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(island[i][j] == 1) {
						dfs(h, w, i, j);
						count++;
					}
				}
			}
			
			bw.write(count + "\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static void dfs(int h, int w, int x, int y) {
		
		int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
		int[] dy = {1, 0, -1, 1, -1, 1, 0, -1};
		
		island[x][y] = 0;
		for(int i = 0; i < 8; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			if(X >= 0 && X < h && Y >= 0 && Y < w && island[X][Y] == 1) {
				dfs(h, w, X, Y);
				continue;
			}
		}
	}

}
