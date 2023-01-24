package beakjoon_algorism_DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_01068 {
	static ArrayList<Integer> arr[];
	static boolean check[];
	static int start, delete, cnt;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		check = new boolean[N];
		arr = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < N; i++) {
			int x = scan.nextInt();
			if(x == -1) {
				start = i;
			}
			else {
				arr[x].add(i);
			}
		}
		delete = scan.nextInt();
		check[delete] = true;
		dfs(start);
		System.out.println(cnt);
	}
	static void dfs(int x) {
		if(!check[x]) {
			check[x] = true;
			if(arr[x].size() == 0 || (arr[x].size() == 1 && check[arr[x].get(0)])) {
				cnt++;
			}
			else {
				for(int i = 0; i < arr[x].size(); i++) {
					dfs(arr[x].get(i));
				}
			}
		}
	}

}
