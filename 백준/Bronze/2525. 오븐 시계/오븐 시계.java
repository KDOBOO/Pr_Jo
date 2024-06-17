
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); // 시
		int B = in.nextInt(); // 분
		int C = in.nextInt();
		in.close();
		
		B = B+C;
		while(B>=60) {
			
			A++;
			B-=60;
			if(A>23) {
				A = 0;
			}
		}
		
		System.out.println(A+" "+B);
	}
}