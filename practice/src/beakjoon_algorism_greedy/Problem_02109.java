package beakjoon_algorism_greedy;
/*
 * 순회강연
 *  1. (돈, 날짜) 입력받고 날짜 max값 저장
 *  2. 날짜 max값만큼의 boolean배열, ArrayList 작성
 *  3. 돈기준 내림차순, 날짜 기준 내림차순 정렬
 *  4. boolean 체크하면서 되면 ArrayList에 입력
 */
import java.io.*;
import java.util.*;

public class Problem_02109 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i][1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0])
					return o2[1] - o1[1];
				return o2[0] - o1[0];
			}
		});
		
		boolean[] check = new boolean[max + 1];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = arr[i][1]; j > 0; j--) {
				if(!check[j]) {
					check[j] = true;
					sum += arr[i][0];
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
