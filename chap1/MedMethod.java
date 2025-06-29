
public class MedMethod {
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	// main 메소드의 출력 문자열만 수정합니다.
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = "+med3(3,2,1)); 	// 중앙값: 2
		System.out.println("med3(3,2,2) = "+med3(3,2,2));	// 중앙값: 2
		System.out.println("med3(3,1,2) = "+med3(3,1,2));	// 중앙값: 2
		System.out.println("med3(3,2,3) = "+med3(3,2,3));	// 중앙값: 3
		System.out.println("med3(2,1,3) = "+med3(2,1,3));	// 중앙값: 2
		System.out.println("med3(3,3,2) = "+med3(3,3,2));	// 중앙값: 3
		System.out.println("med3(3,3,3) = "+med3(3,3,3));	// 중앙값: 3
		System.out.println("med3(2,2,3) = "+med3(2,2,3));	// 중앙값: 2
		System.out.println("med3(2,3,1) = "+med3(2,3,1)); 	// 중앙값: 2
		System.out.println("med3(2,3,2) = "+med3(2,3,2));	// 중앙값: 2
		System.out.println("med3(1,3,2) = "+med3(1,3,2));	// 중앙값: 2
		System.out.println("med3(2,3,3) = "+med3(2,3,3));	// 중앙값: 3
		System.out.println("med3(1,2,3) = "+med3(1,2,3));	// 중앙값: 2
	}
}