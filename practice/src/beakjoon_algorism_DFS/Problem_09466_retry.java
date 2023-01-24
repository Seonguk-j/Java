package beakjoon_algorism_DFS;
/*
 * 텀 프로젝트
 *  1. test수 T 입력받음.
 *  2. 각 case별 학생수 n 입력받음.
 *  3. 선택된 학생 번호 입력받음.
 *  4. dfs매소드 진행.
 *     cnt[n]에 순환되어 돌아오면 check가 true가 되게 만듦.(cnt[n]의 값이 2가되면 순환되는것)
 *  5. check가 true가 되지 못한 학생 수 출력.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem_09466_retry {
	static int[] student, cnt;
	static boolean[] team;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			student = new int[n + 1];
			cnt = new int[n + 1];
			team = new boolean[n + 1];
			
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				student[j] = Integer.parseInt(st.nextToken());
			}
			for(int j = 1; j <= n; j++) {
				if(!team[j] && !team[student[j]]) {
					cnt = new int[n + 1];
					dfs(j);
				}
			}
			int output = 0;
			for(int j = 1; j <= n; j++) {
				if(!team[j]) {
					output++;
				}
			}
			bw.write(output + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	static void dfs(int x) {
		if(cnt[x] == 3) {
		}
		else if(cnt[x] == 2) {
			team[x] = true;
			cnt[x]++;
			dfs(student[x]);
		}
		else {
			cnt[x]++;
			dfs(student[x]);
		}
	}

}
