package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class BJ10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int[] array = new int[N];
		br.close();
		
		
		for(int i=0; i<N; i++) { 
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
        System.out.println(array[0]+" "+array[N-1]);
	}
}
