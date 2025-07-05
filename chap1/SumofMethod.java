import java.util.Scanner;

public class SumofMethod {
	static int sumof(int a, int b) {
	    int min, max; // 작은 값, 큰 값을 저장할 변수

	    // a와 b 중 어느 값이 큰지 확인하여 min, max 설정
	    if (a < b) {
	        min = a;
	        max = b;
	    } else {
	        min = b;
	        max = a;
	    }

	    int sum = 0; // 합계를 초기화
	    for (int i = min; i <= max; i++) {
	        sum += i; // min부터 max까지 모든 정수를 차례로 더함
	    }
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
