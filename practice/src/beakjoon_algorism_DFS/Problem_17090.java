package beakjoon_algorism_DFS;
/*
 * 미로 탈출하기
 *  1. 입력받기
 *  2. map을 벗어나게 되면 성공, 벗어나지 못하면 실패
 *  3. 순환되는 경우 check[][] = true로 변환, 그렇지않은경우 다시 false로 변환, true에 닿으면 벗어나지 못한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_17090 {

	static char[][] map;
	static int N, M, cnt;
	static boolean[][] check, doubleCheck;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		check = new boolean[N][M];
		doubleCheck = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(doubleCheck[i][j]) {
					cnt++;
				}
				else
					dfs(i, j);
			}
		}
		System.out.println(cnt);
	}
	
	static void dfs(int y, int x) {
		if(doubleCheck[y][x])
			cnt++;
		else if(!check[y][x]) {
			check[y][x] = true;
			int Y = y;
			int X = x;
			if(map[y][x] == 'U') {
				Y = y - 1;
				if(Y >= 0) {
					dfs(Y, X);
					if(!check[Y][X]) {
						check[y][x] = false;
						doubleCheck[Y][X] = true;
					}
				}
				else {
					cnt++;
					check[y][x] = false;
				}
			}
			else if(map[y][x] == 'R') {
				X = x + 1;
				if(X < M) {
					dfs(Y, X);
					if(!check[Y][X]) {
						check[y][x] = false;
						doubleCheck[Y][X] = true;
					}
				}
				else {
					cnt++;
					check[y][x] = false;
				}
			}
			else if(map[y][x] == 'D') {
				Y = y + 1;
				if(Y < N) {
					dfs(Y, X);
					if(!check[Y][X]) {
						check[y][x] = false;
						doubleCheck[Y][X] = true;
					}
				}
				else {
					cnt++;
					check[y][x] = false;
				}
			}
			else {
				X = x - 1;
				if(X >= 0) {
					dfs(Y, X);
					if(!check[Y][X]) {
						check[y][x] = false;
						doubleCheck[Y][X] = true;
					}
				}
				else {
					cnt++;
					check[y][x] = false;
				}
			}
		}
		
	}

}
