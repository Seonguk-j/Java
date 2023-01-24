package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 유기농 배추
 *  1. case수 입력받음.
 *  2. case별로 가로 M, 세로 N, 배추수 K, 배추위치 입력받음.
 *  3. 각 case별 벌레의 수 계산하는 dfs매소드 작성.
 *  4. 출력
 */
public class Problem_01012 {
	
	public static boolean[][] cabbage;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int caseNumber = Integer.parseInt(br.readLine());
		for(int i = 0; i < caseNumber; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken()); //가로 
			int N = Integer.parseInt(st.nextToken()); //세로 
			int K = Integer.parseInt(st.nextToken()); //양배추 수 
			
			cabbage = new boolean[M][N]; //양배추 위치 
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				cabbage[x][y] = true;
			}
			
			int count = 0;
			for(int x = 0; x < M; x++) {
				for(int y = 0; y < N; y++) {
					if(cabbage[x][y]) {
						dfs(M, N, x, y);
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
	
	public static void dfs(int M, int N, int x, int y) {
		if(cabbage[x][y]) {
			cabbage[x][y] = false;
			if(x != M - 1) dfs(M, N, x + 1, y);
			if(x != 0) dfs(M, N, x - 1, y);
			if(y != N - 1) dfs(M, N, x, y + 1);
			if(y != 0) dfs(M, N, x, y - 1);
		}
	}

}
