package level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ19_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		if(B+C<60) {
			B=B+C;

		}else {
			A+=(B+C)/60;
			B=(B+C)%60;
		}
		
		if(A>=24) {A=A-24;}
		
		bw.write(A+" "+B+"\n");
		
		br.close();
		bw.flush();
		bw.close();
		
		
		
	}
}
