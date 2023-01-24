package beakjoon_algorism_DFS;
/*
 * 구슬 찾기
 * o 1. 구슬갯수 N, 저울 사용횟수 M 입력받음.
 * o 2. 무거운 구슬 배열, 가벼운 구슬배열 입력
 *  3. dfs로 구슬카운트, 카운트 수가 (N + 1)/2보다 크면 확실히 아닌것.
 *  4. 아닌것의 갯수 카운트 및 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_02617 {

	static ArrayList<Integer>[] heavy, light;
	static int cnt, output, center;
	static boolean[] check;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		center = (N + 1)/2;
		heavy = new ArrayList[N + 1];
		light = new ArrayList[N + 1];
		for(int i = 0; i < N + 1; i++) {
			heavy[i] = new ArrayList<Integer>();
			light[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			heavy[x].add(y);
			light[y].add(x);
		}
		
		for(int i = 1; i < N + 1; i++) {
			check = new boolean[N + 1];
			cnt = 0;
			dfsH(i);
			if(cnt > center) {
				output++;
			}
			check = new boolean[N + 1];
			cnt = 0;
			dfsL(i);
			if(cnt > center) {
				output++;
			}
		}
		
		System.out.println(output);
		
	}
	
	static void dfsH(int x) {
		check[x] = true;
		cnt++;
		if(cnt <= center && !check[x]) {
			for(int i = 0; i < heavy[x].size(); i++) {
				dfsH(heavy[x].get(i));
			}
		}
	}
	
	static void dfsL(int x) {
		check[x] = true;
		cnt++;
		if(cnt <= center && !check[x]) {
			for(int i = 0; i < light[x].size(); i++) {
				dfsL(light[x].get(i));
			}
		}
	}

}
