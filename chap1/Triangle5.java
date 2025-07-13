import java.util.Scanner;

public class Triangle5 {

	static void spira(int n) {
		for (int i =1; i<= n; i++) {
			for (int z=i; z<=n; z++) {
				System.out.printf(" ");
			}
			for(int j =1; j<= (i-1)*2+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = stdIn.nextInt();
		}while (n <=0 );

		spira(n);
	}

}
