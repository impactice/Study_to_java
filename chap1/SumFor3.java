import java.util.Scanner;

public class SumFor3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int c = 0;
		
		System.out.print("a값: ");
		a = stdIn.nextInt();
		System.out.print("b값: "); 
		b = stdIn.nextInt();
		
		if(a>=b) {
			System.out.print("a보다 큰 값을 입력하세요!\n");
			System.out.print("b값: ");
			b = stdIn.nextInt();
		
		}
		if (a<b){
			c = b-a;
			System.out.print("b - a는 "+c+"입니다."); 
		}
	}

}
