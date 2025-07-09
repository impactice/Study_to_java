import java.util.Scanner;

public class Multi99Table4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정사각형을 출력합니다.\n");
		System.out.print("변의 길이: ");
		int a = stdIn.nextInt();
		
		for (int i=1; i <= a; i++) {
			for(int j=1; j <= a; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
