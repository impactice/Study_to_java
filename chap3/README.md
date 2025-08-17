# 검색 알고리즘이란? 

## 검색과 키 살펴보기 

## 배열에서 검색하기 

### 조금만 더! 데이터 추가 비용은 어떤 경우에 더 많이 들까요? 

# 선형 검색 

## 선형 검색 알아보기 

- chap03/SeqSearch.java 
```
import java.util.Scanner;

// 선형 검색 

class SeqSearch {
	// 요솟수가 n인 배열 a에서 key와 같이 같은 요소를 성형 검색 
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i == n) 
				return -1;	// 검색 실패(-1을 반환)
			if (a[i] == key)
				return i;	// 검색 성공(인덱스를 반환)
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt(); 
		int[] x = new int[num];		// 요솟수가 num인 배열 
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = stdIn.nextInt();
		} 
		
		System.out.print("검색할 값: ");	// 키값을 입력받음
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky); 	// 배열 x에서 값이 ky인 요소를 검색 
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println("그 값은 x["+idx+"]에 있습니다.");

	}

}
```
|실행 결과|
|--|
|요솟수: 7
x[0]: 6
x[1]: 4
x[2]: 3
x[3]: 2
x[4]: 1
x[5]: 2
x[6]: 8
검색할 값: 2
그 값은 x[3]에 있습니다.|

- chap03/SeqSearchFor.java
```
import java.util.Scanner;

class SeqSearchFor {

	// 요솟수가 n인 배열 a에서 key와 같이 같은 요소를 성형 검색 
		static int seqSearch(int[] a, int n, int key) {
			for (int i = 0; i < n; i++)
				if (a[i] == key) 
					return i;	// 검색 성공(인덱스를 반환)
			return -1;				// 검색 실패(-1을 반환)
			
		}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt(); 
		int[] x = new int[num];		// 요솟수가 num인 배열 
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = stdIn.nextInt();
		} 
		
		System.out.print("검색할 값: ");	// 키값을 입력받음
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky); 	// 배열 x에서 값이 ky인 요소를 검색 
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println("그 값은 x["+idx+"]에 있습니다.");

	}


}
```










