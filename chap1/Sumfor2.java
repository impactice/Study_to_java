import java.util.Scanner;

public class Sumfor2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = stdIn.nextInt();
		
		int sum = n * (n + 1) / 2;
		System.out.println("1부터 "+ n +"까지의 합은 "+sum+"입니다.");


	}

}
