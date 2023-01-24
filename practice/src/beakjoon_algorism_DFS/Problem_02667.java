package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 단지번호붙이기
 * o 1. N입력받음
 * o 2. 배열에 아파트 존재유무 char으로 입력받음.
 *  3. 아파트 count용 dfs매소드 작성
 *  4. ArrayList에 count값 저장
 *  5. Arraylist정렬 및 크기 출력
 */
public class Problem_02667 {

	public static char[][] apt;
	public static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> aptCount = new ArrayList<Integer>();
		int N = Integer.parseInt(br.readLine());
		apt = new char[N][N];
		
		for(int i = 0; i < N; i++) {
			apt[i]= br.readLine().toCharArray();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				count = 0;
				dfs(N, i, j);
				if(count != 0) aptCount.add(count);
			}
		}
		Collections.sort(aptCount);
		System.out.println(aptCount.size());
		for(int i = 0; i < aptCount.size(); i++) {
			System.out.println(aptCount.get(i));
		}
		
	}
	
	public static void dfs(int N, int i, int j) {
		if(apt[i][j] == '1') {
			apt[i][j] = '0';
			count++;
			if(j != N - 1) dfs(N, i, j + 1);
			if(j != 0) dfs(N, i, j - 1);
			if(i != N - 1) dfs(N, i + 1, j);
			if(i != 0) dfs(N, i - 1, j);
		}
	}

}
