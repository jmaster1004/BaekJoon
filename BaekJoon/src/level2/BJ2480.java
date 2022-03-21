package level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ2480 {
	public static void main(String[] args) throws IOException, NullPointerException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st;
		int prize =0;
		
		st=new StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		
		if(A==B&&B==C) {
			prize=10000+A*1000;
		}else if(A==B||A==C) {
			prize=1000+A*100;
		}else if (B==C) {
			prize=1000+B*100;
		}else {
			prize=Math.max((Math.max(A, B)),C)*100;
		}
		
		bw.write(prize+"");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
