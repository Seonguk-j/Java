package beakjoon_algorism_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem_01240 {
	
	static ArrayList<Point>[] dist;
	static boolean[] check;
	static int length;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		dist = new ArrayList [N + 1];
		for(int i = 0; i < N + 1; i++) {
			dist[i] = new ArrayList<Point>();
		}
		
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int distance = Integer.parseInt(st.nextToken());
			dist[x].add(new Point(y, distance));
			dist[y].add(new Point(x, distance));
		}
		for(int i = 0; i < M; i++) {
			check = new boolean [N + 1];
			length = 0;
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			if(start != end)
				dfs(start, end, 0);
			bw.write(length + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs(int start, int end, int output) {
		check[start] = true;
		for(int i = 0; i < dist[start].size(); i++) {
			int next = dist[start].get(i).x;
			int distance = dist[start].get(i).y;
			if(next != end && !check[next]) {
				output += distance;
				dfs(next, end, output);
				output -= distance;
			}
			else if(next == end) {
				output += distance;
				length = output;
				break;
			}
		}
	}
}

//class Point{
//	int x;
//	int y;
//	
//	Point(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//}
