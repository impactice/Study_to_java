import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray5 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t; 	
	}
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length -i -1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수: ");
		int num = stdIn.nextInt();

		int[] x = new int[num];
		int[] y = new int[num]; // 복사 대상 배열도 같은 크기로 초기화해야 함

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		rcopy(x, y); // 반환값이 필요 없는 void 메서드이므로 그냥 호출만 하면 됨

		System.out.println("배열 x의 모든 요소를 배열 y에 역순으로 복사했습니다!");
		for (int i = 0; i < num; i++) {
			System.out.println("y[" + i + "] = " + x[i]);
		}

	}

}
