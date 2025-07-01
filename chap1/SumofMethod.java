import java.util.Scanner;

public class SumofMethod {
	static int sumof(int a, int b) {
		int sum = a+b;
		
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a를 입력: ");
		
		int a = stdIn.nextInt();
		
		System.out.print("b를 입력: ");
		
		int b = stdIn.nextInt();
		
		int sum = sumof(a,b); 
		
		System.out.print(sum);
	}

}
