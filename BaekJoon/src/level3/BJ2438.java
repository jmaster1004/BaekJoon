package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		
		String B = "";
		
		for(int i = 0; i<A; i++) {
			B+="*";
			System.out.println(B);
		}
		
		br.close();
	} 
}
