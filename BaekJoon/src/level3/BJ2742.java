package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ2742 {
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//키보드로 입력받은값 등록 
		int A = Integer.parseInt(br.readLine());
		
		//for문  등록 
		for(int i=A; i>0; i--) {
			bw.write(i+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();		
	}
}
