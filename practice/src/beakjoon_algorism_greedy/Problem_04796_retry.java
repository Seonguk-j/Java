package beakjoon_algorism_greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 캠핑
 *  - 연속하는 P일 중 L일만 캠핑장을 이용가능, 휴가는 V일
 *  1. L P V 순으로 입력받음.
 *    - 입력은 여러가지 케이스로 받을 수 있음.
 *  2. 마지막 입력은 0 0 0 으로 종료.
 *  3. 캠핑가능 일수는 V / P * L + V % P로 계산됨.
 *  4. case 1, case 2, ...으로 출력. 
 */
public class Problem_04796_retry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int num = 0;
		
		while(!str.equals("0 0 0")) {
			num++;
			String vacNum[] = str.split(" ");
			int L = Integer.parseInt(vacNum[0]);
			int P = Integer.parseInt(vacNum[1]);
			int V = Integer.parseInt(vacNum[2]);
			
			int result = (V / P) * L + Math.min((V % P), L);
			bw.write("Case " + num +": " + result + "\n");
			str = br.readLine();
		}
		bw.flush();
		bw.close();
	}

}
