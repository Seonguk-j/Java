package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 촌수 계산
 *  1. 사람수 n입력받음.
 *  2. 목표 targetA, targetB입력받음.(전역변수)
 *  3. 관계수 입력받음.
 *  4. 부모자식 관계 입력받음.
 *  5. dfs 매소드 작성.(count추가, if문 관계를 찾지못할 경우 -1)
 */
public class Problem_02644_retry {
	
	static int start, end;
	static boolean[] check;
	static int output = -1;
	static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		check = new boolean[n + 1];
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i <= n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		
	//	System.out.println(arr);
		dfs(start, end, 0);
		bw.write(output + "\n");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	static void dfs(int x, int y, int cnt) {
		if(x == y) {
			output = cnt;
			return;
		}
		
		check[x] = true;
		for(int i = 0; i < arr.get(x).size(); i++) {
			int temp = arr.get(x).get(i);
			if(!check[temp]) {
				dfs(temp, y, cnt + 1);
			}
		}
	}

}
