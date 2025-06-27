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
		System.out.print("c의 값: "); int c = stdIn.nextInt(); 
		
		int max = a;
		if (b>max) max =b;
		if (c>max) max = c; 
		
		System.out.println("최댓값은 "+max+"입니다.");
	}

}
```
- 변수 a,b,c의 최댓값을 max로 구하는 과정은 다음과 같이 정리할 수 있다
1. max에 a 값을 넣는다
2. b값이 max보다 크면 max에 b값을 넣는다
3. c값이 max보다 크면 max에 c값을 넣는다 
- 이렇게 여러 문장(프로세스)이 순차적으로 실행되는 구조를 순차(sequential) 구조라고 한다. 그런데 1.은 단순한 대입이지만 2.,3.은 if문이다. () 안에 있는 식을 평가한 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택(selection) 구조라고 한다

### 보충수업1-1) 숫자와 문자열 입력하기 1 
- 키보드로 숫자와 문자열을 입력하는 방법은 다음과 같다
```
import java.util.Scanner;
class A {
	public- static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		stdIn.nextInt()
	}
}
```
1. java.util 패키지에 있는 Scanner 클래스를 프로그램에 포함시킨다
2. main 메서드의 앞쪽에 작성한다. System.in은 키보드와 연결된 표준 입력 스트림(standard input stream)이다
3. 키보드로 입력한 int형 정숫값을 읽어 들이는 부분이다. stdIn.nextInt()를 호출하면 입력한 정숫값을 얻을 수 있다

- 참고로 stdIn은 키보드와 연결된 표준 입력 스트림 System.in에서 문자나 숫자를 꺼내는 장치 역할을 한다. 변수명 stdIn은 다른 이름으로 바꿔도 된다

### 보충수업1-2) 숫자와 문자열 입력하기 2 
# Scanner 메서드별 자료형 및 입력값 범위

아래 표는 `java.util.Scanner` 클래스의 주요 입력 메서드와 각 메서드가 반환하는 자료형, 그리고 허용하는 입력값의 범위를 정리한 것이다.

| 메서드           | 반환 자료형 | 입력값의 범위                                                                                   |
| ---------------- | ---------- | ----------------------------------------------------------------------------------------------- |
| nextBoolean()    | boolean    | `"true"` 또는 `"false"` (대소문자 구분 안 함)                                                   |
| nextByte()       | byte       | -128 ~ 127                                                                                     |
| nextShort()      | short      | -32,768 ~ 32,767                                                                               |
| nextInt()        | int        | -2,147,483,648 ~ 2,147,483,647                                                                 |
| nextLong()       | long       | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807                                         |
| nextFloat()      | float      | 약 ±3.4028235e38 (IEEE 754 단정도)                                                             |
| nextDouble()     | double     | 약 ±1.7976931348623157e308 (IEEE 754 배정도)                                                   |
| next()           | String     | 문자열(공백, 줄 바꿈 문자로 구분)                                                           |
| nextLine()       | String     | 문자열 1줄                                         |

그러면 여러값에 대해서도 최댓값을 제대로 구할 수 있는지 확인해 보겠다. 
- chap01/Max3Method.java 
```

public class Max3Method {
	
	static int max3(int a, int b, int c) {
		int max =a;
		if (b>max) 
			max=b;
		if (c>max) 
			max=c;
		
		return max; // return max;가 없다면 max 변수는 메서드 내부에서만 살아있는 로컬 변수이고, 호출 지점으로는 아무것도 전달되지 않음
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = "+max3(3,2,1)); 	//a
		System.out.println("max3(3,2,2) = "+max3(3,2,2));	//b 
		System.out.println("max3(3,1,2) = "+max3(3,1,2) );	//c
		System.out.println("max3(3,2,3) = "+max3(3,2,3));	//d
		System.out.println("max3(2,1,3) = "+max3(2,1,3));	//e 
		System.out.println("max3(3,3,2) = "+max3(3,3,2));	//f
		System.out.println("max3(3,3,3) = "+max3(3,3,3));	//g	
		System.out.println("max3(2,2,3) = "+max3(2,2,3));	//h 
		System.out.println("max3(2,3,1) = "+max3(2,3,1)); 	//i
		System.out.println("max3(2,3,2) = "+max3(2,3,2));	//j 
		System.out.println("max3(1,3,2) = "+max3(1,3,2));	//k
		System.out.println("max3(2,3,3) = "+max3(2,3,3));	//l 
		System.out.println("max3(1,2,3) = "+max3(1,2,3));	//m
	}

}
```
'알고리즘'은 다음과 같이 정의할 수 있다 
|---| 
|어떤 문제를 해결하기 위한 절차로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합|

- 물론 알고리즘을 아무리 명확하게 정의해도 변숫값에 따라 결과가 맞기도 하고 틀리기도 한다면 올바를 알고리즘이라 할 수 없다. 그래서 여기서는 세 값의 최댓값을 구하는 알고리즘이 올바른지 확인하기 위해 값을 여러 개 입력하여 프로그램의 결괏값을 확인했다.

#### 매개변수 
- 메서드를 정의할 때 메서드에 전달되는 값을 저장하기 위해 변수(variable)를 선언하는데, 이를 매개변수(parameter) 또는 형식매개변수(formal parameter)라고 한다. 형식매개변수를 가인수(임시 인수)라 하고, 매서드를 호출할 때 사용하는 매개변숫값(value)을 실인수(actual argument)라고 한다. 간단하게 매서드를 정의할 때는 '매개변수', 메서드를 호출할 때는 '실인수'라고 생각하면 된다. 

### 연습문제 
Q1. 네 값이 최댓값을 구하는 max4 메서드를 작성하세요. 작성한 메서드를 테스트하기 위해 main 메서드를 포함한 프로그램을 작성해야 합니다. 이후의 문제도 마찬가지입니다. 
```
static int max4(int a, int b, int c, int d)
```

```
import java.util.Scanner;

public class Max4Method {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max < b) 
			max=b;
		if(max < c)
			max=c;
		if(max < d)
			max=d;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		int max = max4(a, b, c, d);

		System.out.print("최댓값: "+max);
		
	}

}

```

Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요. 
```
static int min3(int a, int b, int c)
```
```
import java.util.Scanner;

public class Min3Method {
	static int min3(int a, int b, int c){
		int min = a;
		if (min > b)
			min = b; 
		if (min > c)
			min = c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int one = stdIn.nextInt();
		int two = stdIn.nextInt();
		int three = stdIn.nextInt(); 
		
		int min = min3(one,two,three);
		System.out.print("최솟값: "+min);

	}

}
```

Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요. 
```
static int min4(int a,int b, int c, int d)
```

```
import java.util.Scanner;

public class Min4Method {
	static int min4(int a,int b, int c, int d) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		int min = min4(a,b,c,d);
		System.out.print("최솟값: "+min);

	}

}
```

### 보충수업1-3) 메서드의 반환값과 메서드 호출식의 평가 
- 메서드는 return 문에서 처리한 결괏값을 원래 호출할 곳으로 반환한다.
- max3 메서드의 반환값은 int형이고, 메서드의 끝 부분에서 번수 max값을 반환한다 

### 보충수업1-4) 세 값의 대소 관계와 중앙값 
**세 값의 대소 관계**
- 조합을 나열한 모양이 나무(tree) 형태이므로 결정 트리(decision tree)라고 한다 

**세 값의 중앙값**
- chap01/Median.java
```
import java.util.Scanner;

public class Median {
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

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 "+med3(a,b,c)+"입니다.");

	}

}
```

### 연습 문제 
Q4. 세 값의 대소 관계인 13가지 조합의 중앙값을 구하여 출력하는 프로그램을 작성하세요. 
```

```

Q5. 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다. 그러나 실습 1C-1의 med3 메서드에 비해 효율이 떨어지는 데 그 이유를 설명하세요. 
```
static int med3(int a, int b, int c) {
	if ((b >= a && c <= a) || (b <= a && c >=a))
		return a;
	else if ((a > b && c < b) || (a < b && c > b))
		return b;
	return c;
} 
```




