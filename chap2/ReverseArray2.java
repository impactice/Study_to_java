import java.util.Arrays;

class ReverseArray2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t; 	
	}
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length -i -1);
			System.out.println("a["+i+"]과 a["+(a.length -i -1)+"]을 교환합니다.");
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		System.out.println("[2, 5, 1, 3, 9, 6, 7]");
		int[] x = {2, 5, 1, 3, 9, 6, 7};
		reverse(x);	// 배열 a의 요소를 역순으로 정렬
		
		System.out.println("역순 정렬을 마쳤습니다.");

	}

}
