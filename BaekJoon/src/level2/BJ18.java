package level2;
import java.util.Scanner;

public class BJ18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
			
		if(M-45>=0) {
			System.out.print(H+" "+(M-45)); 
		}else {
            if(H==0) { H=24; }
			System.out.print((H-1)+" "+(60-(45-M))); 
		}	
	}
}