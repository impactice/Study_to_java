import java.util.Scanner;

public class Triangle3 {
	static void triangleRU(int n) {//오른쪽 위가 직각인 이등변삼각형을 출력
		for(int i =1; i<= n; i++) {
			for (int j =i; j<= n; j++) {
				System.out.print("*");
			}
			System.out.println();
			for (int z=1; z<=i; z++)
				System.out.printf(" ");
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("오른쪽 위가 직각인 이등변삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = stdIn.nextInt();
		}while (n <=0 );
		
		triangleRU(n);

	}

}
