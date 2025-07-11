# 알고리즘이란? 

## 세 값의 최댓값 구하기
- 3개의 정숫값 가운데 '최댓값'을 구하는 프로그램
  - 변수 a,b,c에 들어가는 값은 키보드에서 입력한 값이며, 이 중에서 최댓값을 변수 max로 찾을 수 있다. 

- chap01/Max3.java
```
import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다."); 
		System.out.print("a의 값: "); int a = stdIn.nextInt();
		System.out.print("b의 값: "); int b = stdIn.nextInt();
		System.out.print("c의 메서드로 작성하세요. 

```
```
static void triangleLB(int n)   //왼쪽 아래가 직각인 이등변삼각형을 출력
```

또, 왼쪽 위, 오른쪽 아래가 직각인 이등변삼각형을 출력하는 메서드를 각각 작성하세요. 

```
static void trianglLU(int n)   //왼쪽 위가 직각인 이등변삼각형을 출력
static void triangleRU(int n)  //오른쪽 위가 직각인 이등변삼각형을 출력
static void triangleRB(int n)  //오른쪽 아래가 직각인 이등변삼각형을 출력  
```

Q15. n단의 피라미드를 출력하는 메서드를 작성하세요(오른쪽은 4단의 예).
- i행에는 (i - 1) * 2 + 1개의 *가 출력되게 하세요. 마지막 n행에는 (n - 1) * 2 + 1개의 *를 출력하게 됩니다. 
```
static void spira(int n)
```

Q16. 오른쪽과 같이 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
- i행에 출력하는 숫자는 i%10으로 구하세요. 
```
static void npira(int n) 
```







