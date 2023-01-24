package beakjoon_algorism_DFS;
/*
 * 양 구출 작전
 *  1. 값 입력받음.
 *  2. 역으로도 입력받음.
 *  3. 역으로 입력받은 값에 s일 경우 +, W일 경우 -를 붙혀서 Point에 입력.
 *  4. 정방향으로 입력받은 값의 자식이 없는 경우 따로 저장.
 *  5. 역방향으로 올라가면서 합이 -가 될경우 리셋.
 *  6. 총합 구함.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_16437_timeover {
	
	static Point[] rightWay;
	static ArrayList<Integer>[] reverse;
	static ArrayList<Integer> input = new ArrayList<Integer>();
	static long sum, output;
	static boolean[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		check = new boolean[n + 1];
		reverse = new ArrayList[n + 1];
		rightWay = new Point[n + 1];
		for(int i = 0; i < n + 1; i++) {
			reverse[i] = new ArrayList<Integer>();
		}
		
		for(int i = 2; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			String animal = st.nextToken();
			int number = Integer.parseInt(st.nextToken());
			int node = Integer.parseInt(st.nextToken());
			reverse[node].add(i);
			if(animal.equals("S"))
				rightWay[i] = new Point (node, number);
			else
				rightWay[i] = new Point(node, -number);
		}
		for(int i = 1; i < n + 1; i++) {
			if(reverse[i].size() == 0) {
				sum = 0;
				dfs(i);
				output += sum;
			}
		}
		System.out.println(output);
	}
	
	static void dfs(int node) {
		if(!check[node]) {
			check[node] = true;
			if(rightWay[node] != null) {
				if(sum + rightWay[node].number < 0) {
					rightWay[node].number += sum;
					sum = 0;
					check[node] = false;
				}
				else {
					sum += rightWay[node].number;
					rightWay[node].number = 0;
				}
				dfs(rightWay[node].node);
			}
		}
		else {
			if(rightWay[node] != null) {
				dfs(rightWay[node].node);
			}
		}
	}

}

//class Point{
//	int node;
//	long number;
//	Point(int node, long number) {
//		this.node = node;
//		this.number = number;
//	}
//}
