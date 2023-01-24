package beakjoon_algorism_DFS;
/*
 * 가장 가까운 공통 조상
 * o 1. 케이스 갯수 입력받음.
 * o 2. 케이스별 노드수 N입력받음.
 * o 3. N-1개의 간선 입력받음.
 * o 4. 구해야할 두 노드 입력받음.
 *  5. 구해야할 노드1의 조상들을 ArrayList에 저장.
 *  6. 구해야할 노드2의 조상들을 ArrayList에 저장.
 *  7. 비교 및 공통조상 출력.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_03584 {
	
	static int output;
	static int[] tree;
	static boolean[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int input[] = new int[2];
		int Case = Integer.parseInt(br.readLine());
		for(int i = 0; i < Case; i++) {
			int N = Integer.parseInt(br.readLine());
			tree = new int[N + 1];
			check = new boolean[N + 1];
			for(int j = 0; j < N - 1; j++) {
				st = new StringTokenizer(br.readLine());
				int parents = Integer.parseInt(st.nextToken());
				int child = Integer.parseInt(st.nextToken());
				tree[child] = parents;
			}
			st = new StringTokenizer(br.readLine());
			input[0] = Integer.parseInt(st.nextToken());
			input[1] = Integer.parseInt(st.nextToken());
			for(int j = 0; j < 2; j++) {
				dfs(input[j]);
			}
			bw.write(output + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs(int point) {
		if(!check[point]) {
			check[point] = true;
			dfs(tree[point]);
		}
		else {
			output = point;
		}
	}

}
