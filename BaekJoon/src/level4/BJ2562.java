package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max =0;
		int count=0;
		int index=0;
		
		int[] N = new int[9];
		
		for(int i = 0; i<N.length; i++) {
			N[i]= Integer.parseInt(br.readLine());
			count++;
			
		
			if(max<N[i]) {
				max = N[i];
				index =count;
			}
			
		}
		br.close();

		
		System.out.println(max+"\n"+index);
		
		
	}
}
