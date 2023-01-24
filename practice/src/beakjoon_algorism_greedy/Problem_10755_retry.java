package beakjoon_algorism_greedy;
/*
 * 다시
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 공항
 *  1. 게이트 G, 비행기수 P입력받음.
 *  2. 크기가 P인 배열 p에 비행기별 게이트번호 입력받음.
 *  3. 크기가 G인 배열 g에 비행기 착륙 현황 입력받음.
 */
public class Problem_10755_retry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int G = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		int[] p = new int[P];
		int[] g = new int[G];
		int count = 0;
		
		for(int i = 0; i < P; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < P; i++) {
				g[p[i] - 1]++;
		}
		for(int i = 0; i < G; i++) {
			if(g[i] > 0) {
				count++;
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
