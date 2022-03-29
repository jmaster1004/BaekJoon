package level3;
import java.io.IOException;
import java.util.Scanner;

public class BJ10871 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt(); 
			
			if(A[i]<X) {
				sb.append(A[i]+" ");
			}
		}
		sc.close();
		
		System.out.println(sb);
		
		
	}
}
