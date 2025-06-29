import java.util.Scanner;

public class JudgeABC2x {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("점수를 입력: ");
		
		int n = stdIn.nextInt();
		
		if (n == 1)
			System.out.println("A");
		else if (n == 2)
			System.out.println("B");
		else if (n ==3)
			System.out.println("C");
		else 
			;

	}
}
