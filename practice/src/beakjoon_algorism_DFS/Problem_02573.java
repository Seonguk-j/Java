package beakjoon_algorism_DFS;

/*
 * 빙산
 *  1. 배열 입력받음.
 *  2. 빙산이 2덩이가 될때까지 년수를 yearCnt하는 while문 작성.
 *  3. while문 안에 dfs매소드 작성.
 *  4. dfs매소드 안에 빙산이 녹은 후의 빙산갯수 확인하는 iceCnt작성.
 *  5. 빙산이 전부녹을때 까지 iceCnt가 1이하일 경우 yearCnt 0출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_02573 {

	static int[][] iceMap;
	static boolean[][] check;
	static int yearCnt = 0;
	static int M, N;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int iceCnt = 1;
		
		iceMap = new int[M][N];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				iceMap[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		while(true) {
			check = new boolean[M][N];
			int[][] liquid = new int[M][N];
			
			if(iceCnt > 1) {
				break;
			}
			else if(iceCnt == 0){
				yearCnt = 0;
				break;
			}
			else {
				yearCnt++;
				iceCnt = 0;
				for(int y = 0; y < M; y++) {
					for(int x = 0; x < N; x++) {
						for(int k = 0; k < 4; k++) {
							int X = x + dx[k];
							int Y = y + dy[k];
							
							if(X >= 0 && X < N && Y >=0 && Y < M && iceMap[Y][X] == 0) {
								liquid[y][x]++;
							}
						}
					}
				}
				for(int y = 0; y < M; y++) {
					for(int x = 0; x < N; x++) {
						if(iceMap[y][x] >= liquid[y][x])
							iceMap[y][x] -= liquid[y][x];
						else
							iceMap[y][x] = 0;
					}
				}

				for(int y = 0; y < M; y++) {
					for(int x = 0; x < N; x++) {
						if(iceMap[y][x] > 0)
							check[y][x] = true;
					}
				}

				for(int y = 0; y < M; y++) {
					for(int x = 0; x < N; x++) {
						if(check[y][x]) {
							dfs(y, x);
							iceCnt++;
						}
					}
				}
			}			
		}
		System.out.println(yearCnt);
	}
	
	public static void dfs(int y, int x) {
		check[y][x] = false;
		for(int i = 0; i < 4; i++) {
			int X = x + dx[i];
			int Y = y + dy[i];
			
			if(X >= 0 && X < N && Y >=0 && Y < M && check[Y][X]) {
				dfs(Y, X);
			}
		}
	}

}
