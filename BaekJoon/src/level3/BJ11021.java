package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력받을 때 사용 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력할 때 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//토큰안에 있는 문자열을 나눌때 사용 
		StringTokenizer st;
				
		//케이스의 개수 T를 받음 
		int T = Integer.parseInt(br.readLine());
		
		//for문을 돌려 원하는 값을 얻는다.
		for(int i =1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+(A+B)+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();		
	}
}
