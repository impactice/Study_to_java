import java.util.Scanner;

public class SumFor4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		
		System.out.print("정수를 입력하세요: ");
		a = stdIn.nextInt();
		
		int count = 0;
		while (a > 0) {
		    a /= 10;
		    count++;
		}
		System.out.println("그 수는 "+count+"입니다.");
		
		if (a <0) {
			System.out.print("0보다 큰 양의 정수를 입력해주세요");
		}

	}

}
