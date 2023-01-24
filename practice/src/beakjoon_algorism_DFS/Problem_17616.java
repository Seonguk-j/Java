package beakjoon_algorism_DFS;
/*
 * 등수 찾기
 *  1. 입력값 입력받음.
 *  2. ArrayList<Integer>[] stepDown, stepUp작성.
 *  3. stepDown으로 최고등수, stepUp으로 최저등수 구함.
 *  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_17616 {
	
	static ArrayList<Integer>[] stepDown, stepUp;
	static boolean[] check;
	static int max, min, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		stepDown = new ArrayList[N + 1];
		stepUp = new ArrayList[N + 1];
		
		for(int i = 0; i < N + 1; i++) {
			stepDown[i] = new ArrayList<Integer>();
			stepUp[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			stepDown[x].add(y);
			stepUp[y].add(x);
		}
		
		if(stepDown[X].size() != 0 || stepUp[X].size() != 0) {
			check = new boolean[N + 1];
			dfsMax(X);
			max = N - cnt + 1;
			cnt = 0;
			check = new boolean[N + 1];
			dfsMin(X);
			min = cnt;
			System.out.println(min + " " + max);
		}
		else {
			System.out.println("1 " + N);
		}
	}

	static void dfsMax(int x) {
		if(!check[x]) {
			check[x] = true;
			cnt++;
		}
		for(int i = 0; i < stepDown[x].size(); i++) {
			dfsMax(stepDown[x].get(i));
		}
	}
	
	static void dfsMin(int x) {
		if(!check[x]) {
			check[x] = true;
			cnt++;
		}
		for(int i = 0; i < stepUp[x].size(); i++) {
			dfsMin(stepUp[x].get(i));
		}
	}
}
