package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A ="*";
		String B =" ";
		String result = "";
		
		int N = Integer.parseInt(br.readLine());
		
		br.close();
		
		
		for(int i=1; i<=N; i++) {
			result = B.repeat(N-i)+A.repeat(i);
			System.out.println(result);
		}
		
	}
}

