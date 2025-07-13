import java.util.Scanner;

public class Triangle4 {
	static void triangleRB(int n) {//오른쪽 아래가 직각인 이등변삼각형을 출력 
		for (int i =1; i<= n; i++) {
			for (int z=i; z<=n; z++) {
				System.out.printf(" ");
			}
			for(int j =1; j<= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = stdIn.nextInt();
		}while (n <=0 );
		
		triangleRB(n);

	}

}
