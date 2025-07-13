import java.util.Scanner;

public class Triangle2 {
	static void triangleLU(int n) { //왼쪽 위가 직각인 이등변삼각형을 출력
		for(int i =1; i<= n; i++) {
			for (int j =i; j<= n; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 위가 직각인 이등변삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = stdIn.nextInt();
		}while (n <=0 );
		
		triangleLU(n);

	}

}
