package beakjoon_algorism_DFS;
/*
 * 소문난 칠공주
 *  1. 배열에 값 입력받음.
 *  2. 이다솜파 학생의 위치를 저장.
 *  3. dfs매소드를 좌, 우 아래방향으로 진행되도록 작성.
 *  4. 매소드가 7번만 실행되도록 제한.
 *  5. 이다솜파가 4명이상일 경우 칠공주 연합 완성.
 *  6. 칠공주 연합이 완성되는 수 카운트.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//class Point{
//	int x;
//	int y;
//	Point(int y, int x){
//		this.x = x;
//		this.y = y;
//	}
//}

public class Problem_01941 {
	static char[][] classroom = new char[5][5];
	static boolean[][] check;
	static ArrayList<Point> point = new ArrayList<Point>();
	static int cnt, cntS, output;
	static int[] dx = {1, 0, -1};
	static int[] dy = {0, 1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 5; i++) {
				classroom[i] = br.readLine().toCharArray();
		}
		for(Point student : point) {
			check = new boolean[5][5];
			cnt = 0;
			cntS = 0;
			int x = student.x;
			int y = student.y;
			dfs(y, x);
		}
		System.out.println(output);
	}
	
	static void dfs(int y, int x) {
		check[y][x] = true;
		cnt++;
		if(classroom[y][x] == 'S') {
			cntS++;
		}
		if(cnt <= 7) {
			for(int i = 0; i < 3; i++) {
				int X = x + dx[i];
				int Y = y + dy[i];
				if(X >= 0 && X <5 && Y >= 0 && Y < 5 && !check[Y][X]) {
					if(i == 1) {
					}
					dfs(Y, X);
				}
			}
		}
		if(cnt == 7 && cntS >= 4) {
			output++;
		}
		if(classroom[y][x] == 'S') {
			cntS--;
		}
		cnt--;
	}

}
