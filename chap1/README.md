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
#### Scanner 메서드별 자료형 및 입력값 범위

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
기존 med3 메서드가 더 효율적인 이유는 '비교 연산' 횟수가 훨씬 적기 때문이다.
- 효율적인 med3(기존 코드):
	- 전략: if-else 구조를 통해 한 번의 비교로 경우의 수를 절반씩 줄여나간다.(결정 트리 방식)
 	- 성능: 어떤 값이 들어와도 최대 3번의 비교만으로 답을 찾아 불필요한 검사를 하지 않는다.
- 비효율적인 med3:
	- 전략: 'a가 중앙값인가?','b가 중앙값인가?'를 순서대로 모두 확인한다.
 	- 성능: 운이 나쁘면(답이 마지막에 있으면) 모든 조건을 다 검사해야 하므로 비교 횟수가 최대 6~8번 이상으로 훨신 많아진다
- 결론: 기존 것은 가장 빠른 길로 한 번에 찾아가는 것이고, 비효울적인 방식은 모든 길을 하나씩 다 가보는것이라서 더 느리다      


## 조건 판단과 분기 
입력한 정숫값의 부호(양수/음수/0)를 판단하는 프로그램 
- chap01/JudgeSign.java
```
import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n = stdIn.nextInt();
		
		if (n > 0) 
			System.out.println("이 수는 양수입니다");
		else if (n < 0) 
			System.out.println("이 수는 음수입니다");
		else 
			System.out.println("이 수는 0입니다");

	}

}

```

- chap01/JudgeABC1.java
```
import java.util.Scanner;

public class JudgeABC1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = stdIn.nextInt();
		
		if(n ==1)
			System.out.println("A");
		else if (n==2)
			System.out.println("B");
		else 
			System.out.println("C");
		
	}

}
```

- chap01/JudgeABC2.java
```
import java.util.Scanner;

public class JudgeABC2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("점수를 입력: ");
		
		int n = stdIn.nextInt();
		
		if (n == 1)
			System.out.println("A");
		else if (n == 2)
			System.out.println("B");
		else if (n ==3)
			System.out.println("C");

	}

}

```
숫자 4이상을 입력하게 되면 출력이 아무것도 안 나온다 

- chap01/JudgeABC2x.java
```
import java.util.Scanner;

public class JudgeABC2x {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("점수를 입력: ");
		
		int n = stdIn.nextInt();
		
		if (n == 1)
			System.out.println("A");
		else if (n == 2)
			System.out.println("B");
		else if (n ==3)
			System.out.println("C");
		else 
			;

	}

}

```

### 보충수업1-5) 연산자와 피연산자 
- +,- 등의 연산 기호를 연산자(operator)라고 하고, 연산의 대상이 되는 것을 피연산자(operand)라고 한다 ex) a > b에서 연산자는 >이고 피연산자는 a,b이다.
- 연산자는 피연산자의 수에 따라 다음과 같이 세 종류가 있다
	- 단항 연산자(unary operator) 피연산자 1개 ex)a++
 	- 2항 연산자(binary operator) 피연산자 2개 ex)a<b
  	- 3항 연산자(ternary operator) 피연산자 3개 ex)a?b:c   
- 자바에서 유일한 3항 연산자는 조건 연산자(conditional operator) ?:이다. 식 a ? b : c는 a가 true이면 b를 반환하고 false이면 c를 반환한다
```
a = (x > y) ? x : y;
System.out.println((c == 0) ? "c는 0이 아님");
```
첫 번째 코드에서는 x와 y 중에서 큰 값을 a에 대입한다. 두 번째 코드에서는 c 값이 0이면 "c는 0"을, 그렇지 않으면 "c는 0이 아님"을 출력한다

## 순서도의 기호 

### 프로그램 순서도 
프로그램 순서도(program flowchart)에서 사용하는 기호는 다음과 같다 
|-----------------------------------------------------------------------------------------------|
|실제로 실행할 연산을 나타내는 기호 |
|제어 흐름을 나타내는 선 기호 |
|프로그램 순서도를 이해하거나 작성하는 데 편리한 특수 기호|

### 데이터 
데이터(data)의 입력과 출력을 나타낸다

### 처리 
처리(process)는 여러 종류의 처리 기능을 나타낸다. 예를 들어 정보값, 자료형, 위치를 바꾸도록 정의한 연산의 실행 또는 연속하는 몇 가지 흐름 가운데 하나의 방향을 결정하는 연산의 실행을 나타낸다 

### 미리 정의된 처리 
미리 정의된 처리(predefined process)는 서브루틴 및 모듈 등 다른 곳에서 이미 정의된 하나 이상의 연산 또는 여러 개의 명령어로 이루어진 처리를 나타난다

### 판단 
판단(decision)은 하나의 입구와 하나를 선택하는 몇 개의 출구가 있고, 기호에서 정의한 조건을 평가하여 하나의 출구를 선택하는 판단 기능(스위치형 기능)을 나타낸다. 예정된 평가 결과(예를 들면 Yes 또는 No)는 경로를 나타낸 선 옆에 쓴다 

### 루프 범위 
루프 범위(loop limit)는 두 부분으로 구성되어 루프의 시작과 종료를 나타낸다. 기호의 두 부분에는 같은 이름(루프의 이름)을 사용한다. 

### 선 
선(line)은 제어의 흐름을 나타낸다. 순서도에서 흐름의 방향을 분명히 나타내고자 할 때, 또는 보기 쉽게 하기 위해 화살표를 붙이기도 한다.

### 단말 
단말(terminator)은 외부 환경으로 나가거나 외부 환경에서 들어오는 것을 나타낸다. 예를 들어 프로그램 흐름의 시작과 종료를 나타낸다 

# 반복 

## 1부터 n까지 정수의 합 구하기 
- chap01/SumWhile.java 
```
import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
		System.out.print("n값: ");
		int n = stdIn.nextInt();
		
		int sum =0; 
		int i =1;
		
		while (i <=n) {
			sum +=i;
			i++;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}

}

```

### while문 반복 
- 루프(loop): 어떤 조건이 성립하는 동안 처리(프로그램 명령문 또는 명령어의 집합)를 반복하여 실행하는 것을 반복(repetition) 구조 
- while문은 실행 전에 반복을 계속할지를 판단하는데, 이런 구조를 '사전판단반복'이라고 한다
	- 제어식의 평싯값이 true이면 프로그램 명령문을 반복한다 

| 구문 예시               |
|------------------------|
| `while(제어식) 명령문` |

### 연습문제 
Q6. while 문이 종료될 때 변수 i값이 n+1이 되는지 확인하세요. 
- chap01/Sum2While.java 
```
import java.util.Scanner;

public class Sum2while {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
		System.out.print("n값: ");
		int n = stdIn.nextInt();
		
		int sum =0; 
		int i =1;
		
		while (i <=n) {
			sum +=i;
			i++;
		}
		System.out.println("while문 종료 시의 i값: "+i);
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}

```

### for문 반복 
- chap01/SumFor.java 
```
import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i =1; i <=n; i++) 
			sum += i; 

		System.out.println("1부터 "+ n +"까지의 합은 "+sum+"입니다.");

	}

}

```

| 구문 예시               |
|------------------------|
| `for (초기화 부분; 제어식; 업데이트 부분) 명령문` |

- 초기화 부분은 for문을 실행하기 전에 한 번만 실행한다
- 제어식을 평가한 값이 true이면 for 문의 명령문을 반복한다 
- 명령문을 실행한 다음에는 업데이트 부분을 실행한다


### 연습문제 
Q7. 1~10의 합은 (1+10) * 5와 같이 구할 수 있습니다. 이를 '가우스의 덧셈'이라고 하는데 이 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요. 
- chap01/SumFor2.java 
```
import java.util.Scanner;

public class Sumfor2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = stdIn.nextInt();
		
		int sum = n * (n + 1) / 2;
		System.out.println("1부터 "+ n +"까지의 합은 "+sum+"입니다.");


	}

}

```

Q8. 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하세요. 
```
static int sumof(int a, int b) 
```

```
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

```

### 보충수업1-6) for문 자세히 알아보기 
자바는 일반 for문과 확장 for 문의 2가지 형식을 제공한다. 

#### for 문의 초기화 부분
하나의 변수를 선언하거나 쉼표로 구분하여 여러 개의 변수를 선언할 수도 있다. for 문의 초기화 부분에서 선언한 변수는 for문 안에서만 사용할 수 있다. 즉 for문이 종료되면 선언한 변수는 무효가 된다. 

- for문을 종료한 다음에도 변숫값을 사용하려면 다음처럼 for문 앞에서 변수를 선언한다
```
int i;
for (i = 1; i <= n; i++)
	sum += i;
//for 문을 종료한 뒤에도 변수 i값을 사용할 수 있음
```

- 여러 개의 for문에서 같은 이름의 변수를 사용하려면 각 for문마다 변수를 선언한다
```
for (int i = 1; i<= 5; i++)
	sum += i;
for (int i = 1; i<= 7; i++)
	System.out.println(i);
```

#### 제어식 
반복의 계속 조건을 나타내는 식으로 생략할 수 있다. 제어식을 생략하면 조건을 true로 간주하여 계속 반복한다. 이때 루프 본문에 break 문이나 return 문이 없으면 for 문은 영원히 반복하는 무한 루프가 된다

#### for문의 업데이트 부분 
- 루프 본문을 실행한 뒤에 평가, 실행하는 식을 작성한다
- 쉽표로 구분하여 여러 개의 식을 작성해도 된다
- 제어식과 마찬가지로 for 문의 업데이트 부분도 생략 가능


## 양수만 입력받아 1부터 n까지의 합 구하기 
```
import java.util.Scanner;

public class SumFor_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다");

		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while (n <=0); 
		
		int sum = 0;
		
		for (int i = 1; i <=n; i++)
			sum += i;
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}

}

```
양수만 입력 받기 위해 do while 문으로 프로그램을 작성 
|형식|
|--|
|do while 문 (제어식)|

do while문은 루프 본문을 한 번 실행한 다음에 계속 반복할 것인지를 판단하는 사후판단반복문이다. while 문과 마찬가지로 ()안의 제어식을 평가한 값이 true이면 루프 본문의 명령문이 반복된다 

##### 사전판단반복과 사후반복의 차이점
사전판단반복문인 while 문과 for 문에서는 처음에 제어식을 평가한 결과가 false면 루프 본문은 한 번도 실행되지 않는다. 이와 달리 사후판단반복문인 do while 문에서는 루프 본문이 반드시 한 번은 실행된다. 이것이 사전판단반복과 사후판단반복의 차이점이다. 
- 사전판단반복(while 문, for 문): 루프 본문을 한 번도 실행하지 않을 수 있다
- 사후판단반복(do while 문): 루프 본문을 한 번은 반드시 실행한다 

### 연습문제
Q9. 오른쪽 결과와 같이 두 변수 a,b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요. (변수 b에 입력한 값이 a값 이하면 변수 b값을 다시 입력하세요)
|결과|
|--|
|a값: 6 
b값: 6
a보다 큰 값을 입력하세요! 
b값: 8 
b - a는 2입니다.|

```
import java.util.Scanner;

public class SumFor3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int c = 0;
		
		System.out.print("a값: ");
		a = stdIn.nextInt();
		System.out.print("b값: "); 
		b = stdIn.nextInt();
		
		if(a>=b) {
			System.out.print("a보다 큰 값을 입력하세요!\n");
			System.out.print("b값: ");
			b = stdIn.nextInt();
		
		}
		if (a<b){
			c = b-a;
			System.out.print("b - a는 "+c+"입니다."); 
		}
	}

}

```

Q10. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하며 '그 수는 4자리입니다.'라고 출력합니다. 
```
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

```

## 반복 과정에서 조건 판단하기 1
- chap01/SumVerbose1.java 
```
import java.util.Scanner;

public class SumVerbose1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i<= n; i++) {
			if(i < n)
				System.out.print(i+" + ");  //1
			else 
				System.out.print(i+" = ");   //2
			sum += i;
		}
		
		System.out.println(sum);
	}

}

```

|실행 결과| 
|--|
|1부터 n까지의 합을 구합니다. 
n값: 5 
1 + 2 + 3 + 4 + 5 = 5 |

1. 중간 고정: 변수 i값 뒤에 +를 출력합니다. 예) "1 + ","2 + ","3 + ","4 + "
2. 마지막 과정: 변수 i값 뒤에 =을 출력합니다. 예) "5 = "

하지만 다음과 같이 프로그램을 만드는 것은 바람직하지 않다. 그 이유는 10,000이라면 for문은 반복을 10,000번 수행해야 한다. 다시 말해 1 ~ 9,999번까지는 판단식 i < n이 성립하므로 1을 실행하고, 판단식이 성립하지 않아 2를 실행하는 경우는 단 한 번이다. 마지막 과정을 한 번 실행하기 위해 뮤려 10,000번이나 판단해야 하는 셈이다. 이렇게 마지막 과정을 실행하기 위한 방법으 ㄹ알고 있는데도 반복할 때마다 조건을 판단하여 실행하는 것은 프로그램의 효율을 떨어뜨린다. 

- chap01/SumVerbose2.java 
```
import java.util.Scanner;

public class SumVerbose2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); 
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i< n; i++) { //1
			System.out.print(i+" + "); 
			sum += i;
		}
		
		System.out.print(n+" = ");  //2
		sum += n; 
		System.out.println(sum);

	}

}

```

프로그램이 2단계로 값을 출력한다 
1. 중간과정: for 문에서 1부터 n-1까지의 값 뒤에 +를 출력한다
2. 마지막 과정: n값 뒤에 =와 합계를 출력한다 

for 문의 반복 횟수가 n번에서 n-1번으로 줄었고, if 문의 판단 횟수는 n번에서 0번으로 줄었다. 다만 반복 횟수가 한 번 줄어지만 2를 추가 수행하므로 강간 과정의 횟수는 결국 상쇄된다 여기서 복합 대입 연산자를 사용해 대입한 뒤에 왼쪽 피연산잣값을 생성하도록 만들면 2부분을 다음과 같이 한 줄로 나타낼 수 있다 

```
System.out.println(n+" = " + (sum += n));
```

## 반복 과정에서 조건 판단히기 2 
지정한 개수의 기로를 중간에 줄 바꿈 없이 연속해서 보여 주는 프로그램이다. +/- 기호를 번갈아 출력한다 

- chap01/Alternative1.java
```
import java.util.Scanner;

public class Alternative1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i=0; i < n; i++)
			if (i%2 ==0)
				System.out.print("+");
			else 
				System.out.print("-");

	}

}

```
for 문에서 변수 i값을 0부터 n-1까지 증가하는 과정을 정리하면 
- i가 짝수(2로 나눈 나머지가 0)이면 +를 출력한다
- i가 홀수이면 -를 출력한다

그런데 이 프로그램에는 2가지 문제점이 있다 
1. 반복할 때마다 if문을 실행해야 한다. = for 문을 반복할 때마다 if문을 실행하고 i값이 홀수인지 알아내기 위해 if문을 모두 n번 실행햐야 한다. ex) n값이 50,000이면 if문도 50,000번 실행한다
2. 변경할 때 유연하게 대응하기 어렵다. 이 프로그램의 카운터용 변수인 i값은 0부터 n-1까지 1씩 증가한다. 

만약 i값을 0부터 시작하지 않고 1부터 n까지 증가시키려면 다음과 같이 for문 전체를 수정해야 한다
```
for (int i = 1; i <= n; i++)
	if (i % 2 == 0)
		System.out.print("-");
	else
		System.our.print("+");
```
이처럼 for문의 초기화 부분과 루프 본문인 ir문도 변경해야 한다. 또한 print() 메서드를 호출하는 순서도 바꿔야 한다. 
- chap01/Alternative2.java 
```
import java.util.Scanner;

public class Alternative2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i=0; i < n / 2; i++) //1
			System.out.print("+-");
		
		if (n % 2 != 0) //2
			System.out.print("+");
	}

}
```

1. for 문은 +-를 n/2회 출력한다. 예를 들어 n값이 12이면 6번, 15이면 7번 출력한다
2. n이 홀수일 때에만 +를 출력한다.

이 프로그램에서는 반복할 때마다 if 문의 판단을 실행할 필요가 없다. 그러므로 if 문의 판단은 2에서 한 번만 실행한다. 또한 나눗셈 회숫도 1의 n/2와 2의 n%2를 실행한 것처럼 2번으로 줄었다

카운터용 변수 i값의 시작을 1로 바꾸는 것도 유연하게 대응할 수 있다. for 문을 밑에처럼 변경하면 된다. for문의 초기화 부분만 변경하고 루프 본문은 그대로 둔다.
```
for(int i=1; i < n / 2; i++) 
			System.out.print("+-");
```

## 반복 과정에서 조건 판단하기 3 
다음은 *를 n개 출력하도 w개마다 줄 바꿈을 하는 프로그램이다.

- chap01/PrintStars1.java 
```
import java.util.Scanner;

public class PrintStars1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, w;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while (n <= 0);
		
		do {
			System.out.print("w값: ");
			w = stdIn.nextInt();
			
		}while (w <= 0 || w > n);
		
		for (int i = 0; i < n; i++) {
			System.out.print("*");
			if(i % w == w - 1)
				System.out.println(); //1 줄 바꿈꿈
		}
		if (n % w != 0)
			System.out.println(); //2 줄 바꿈
	}

}

```
|출력 결과|
|--|
|*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.
n값: 14
w값: 5|
|*****|
|*****|
|****|

이 프로그램은 변수 i값을 1씩 증가시키면서 *를 출력한다. 
1. for문에서 변수 i값을 w값으로 나눈 나머지가 w-1일 때 줄 바꿈을 한다. w값이 5라면 i값이 4,9,14일 때 줄 바꿈을 한다
2. n값이 w값의 배수이면 15번째 *를 출력한 뒤에 마지막 줄 바꿈을 하면 된다. 그러나 n값이 w값의 배수가 아니라면 마지막 줄 바꿈은 2에서 한다. 즉, n값이 w값의 배수가 아닐 때만 줄 바꿈을 한다. 

하지만 for 문을 반복할 때마다 if 문을 실행하므로 효율적이지 않다. 

- chap01/PrintStars2.java 
```
import java.util.Scanner;

public class PrintStars2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, w;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		}while (n <= 0);
		
		do {
			System.out.print("w값: ");
			w = stdIn.nextInt();
			
		}while (w <= 0 || w > n);
		
		for (int i = 0; i < n / w; i++) { //1
			System.out.print("*".repeat(w));
		}
		int rest = n % w; ///2
		if (rest != 0)
			System.out.println("*".repeat(w));

	}

}

```

1. for문에서 *를 w개 출력하는 것을 n/w번 실행한다.
- 메서드 호출식 "*".repeat(w)는 *를 반복한 문자열을 생성하여 반환한다. 메서드repeat()는 String 클래스에 들어 있는 인스턴스 메서드이다.
2. n값이 w값의 배수가 아니라면 남아 있는 마지막 줄 바꿈을 한다. n값을 w값으로 나눈 나머지를 구하여 변수 rest에 넣고 *를 rest개 출력한 다음 줄 바꿈을 한다.

### .repeat()
.repeat()는 Java 11부터 사용 가능한 String 클래스의 메서드이다. 이 메서드는 문자열을 지정한 횟수만큼 반복해서 이어붙인 새로운 문자열을 반환하는 역할을 한다

- 코드에서의 활용 설명:

```
System.out.print("*".repeat(w));
```
"*"라는 문자열을 w번 반복해서 출력한다 예를 들어 w = 5라면 "*".repeat(5)는 "*****"를 반환하고, 그걸 System.out.print()가 화면에 출력하게 된다

장점:
- 루프 없이 문자열 반복이 가능해서 코드가 깔끔해진다.
- 성능도 괜찮고, 읽기 쉬운 방식

### 보충수업 1-7) 논리 연산과 드모르간 법칙 
- chap01/TwoDigits.java 
```
import java.util.Scanner;

public class TwoDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 양수를 입력하세요.");
		
		do {
			System.out.print("no값: ");
			no = stdIn.nextInt();
			
		}while (no < 10 || no > 99);

		System.out.println("변수 no값은 "+no+"이 되었습니다.");
	}

}
```
|실행 결과|
|--|
|2자리의 양수를 입력하세요.
no값: 5
no값: 105
no값: 57
변수 no값은 57이 되었습니다.|

#### 논리 연산자의 단축 평가 
|| 연산자의 왼쪽 피연산자를 평가한 값이 true면 오른족 피연산자는 평가하지 않는다. 마찬가지로 && 연산자의 경우 왼쪽 피연산자를 평가한 값이 false면 오른쪽 피연산자는 평가하지 않는다. 
이처럼 논리 연산의 식 전체를 평가한 결과가 왼쪽 피연산자의 평가 결과만으로 결정되는 경우 오른쪽 피연자를 평가하지 않는데 이를 단축 평가(short circuit evaluation)라고 한다.

### 드모르간 법칙 
제어식을 논리 부정 연산자 !(NOT)을 사용하고 고치면 다음과 같다(논리 부정 연산자는 피연사자가 true면 false를, false면 true를 만드는 단항 연산자)
```
!(no >= 10 && no <= 99)
```
드모르간 법칙(De Morgan's laws)은 '각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면, 원래의 조건과 같다'라는 것이다
예시) 
1. x && y와 !(!x || !y)는 같다
2. x || y와 !(!x && !y)는 같다

#### 조금만 더! 구조적 프로그래밍이란? 
입력하는 곳 하나와 출력하는 곳 하나를 갖는 구성 요소만을 사용하여, 이들을 계층적으로 배치하여 프로그램을 구성하는 방식을 구조적 프로그래밍(structured programming)이라고 한다. 
구조적 프로그래밍은 순차, 선택, 반복이라는 세 종류의 제어 흐름을 사용한다.  

## 다중 루프 다루기 

### 곱셈표 
- chap01/Multi99Table.java 
```

public class Multi99Table {

	public static void main(String[] args) {
		System.out.println("----- 구구단 곱셈표 -----");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}

	}

}
```
|실행 결과|
|--|
|----- 구구단 곱셈표 -----
  1  2  3  4  5  6  7  8  9
  2  4  6  8 10 12 14 16 18
  3  6  9 12 15 18 21 24 27
  4  8 12 16 20 24 28 32 36
  5 10 15 20 25 30 35 40 45
  6 12 18 24 30 36 42 48 54
  7 14 21 28 35 42 49 56 63
  8 16 24 32 40 48 56 64 72
  9 18 27 36 45 54 63 72 81|

변수 i값이 1부터 9까지 증가하면서 행은 9번 반복한다. 각각의 반복에서 변수 j값이 1부터 9까지 증가하면서 열은 9번 반복한다. 열의 반복을 종료한 후 줄 바꿈 문자인 System.out.println();을 출력하고 그 다음 행으로 이동한다. 

- 이중 루프는 다음과 같이 처리된다
  
i가 1일 때: j를 1 ➡️ 9로 증가시키면서 1 * j를 출력하고, 줄 바꿈을 한다.  
i가 2일 때: j를 1 ➡️ 9로 증가시키면서 2 * j를 출력하고, 줄 바꿈을 한다.  
i가 3일 때: j를 1 ➡️ 9로 증가시키면서 3 * j를 출력하고, 줄 바꿈을 한다.  
(••• 생략 •••)  
i가 9일 때: j를 1 ➡️ 9로 증가시키면서 9 * j를 출력하고, 줄 바꿈을 한다.  

### 연습문제) 
Q11. 오른쪽 결과와 같이 위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하세요. 
- 구분선은 수직선(|), 마이너스(-), 플러스(+) 기호를 사용하세요. 
```
    |  1  2  3  4  5  6  7  8  9
 ---+---------------------------
  1 |  1  2  3  4  5  6  7  8  9
  2 |  2  4  6  8 10 12 14 16 18
  3 |  3  6  9 12 15 18 21 24 27
  4 |  4  8 12 16 20 24 28 32 36
  5 |  5 10 15 20 25 30 35 40 45
  6 |  6 12 18 24 30 36 42 48 54
  7 |  7 14 21 28 35 42 49 56 63
  8 |  8 16 24 32 40 48 56 64 72
  9 |  9 18 27 36 45 54 63 72 81
```

```

public class Multi99Table2 {

	public static void main(String[] args) {
		int q,w,i;
		
		for(q=1; q <= 9; q++) {
			if(q==9) {
				System.out.printf("%3d\n", q);
				System.out.print(" ---+---------------------------\n");
			} else if (q==1) {
				System.out.printf("    |%3d", q);
				
			} else 
				System.out.printf("%3d", q);
		}
		for (w=1; w <=9; w++) {
			System.out.printf("%3d |", w);
			for (i = 1; i <= 9; i++) {
				System.out.printf("%3d", w*i);
			}System.out.println();
		}

	}

}

```

Q12. 구구단 곱셈표를 변형하여 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요. 
- Q11과 같이 표의 위쪽과 왼쪽에 더하는 수를 출력하세요. 

```

public class Multi99Table3 {

	public static void main(String[] args) {
		int q,w,i;
		
		for(q=1; q <= 9; q++) {
			if(q==9) {
				System.out.printf("%3d\n", q);
				System.out.print(" ---+---------------------------\n");
			} else if (q==1) {
				System.out.printf("    |%3d", q);
				
			} else 
				System.out.printf("%3d", q);
		}
		for (w=1; w <=9; w++) {
			System.out.printf("%3d |", w);
			for (i = 1; i <= 9; i++) {
				System.out.printf("%3d", w+i);
			}System.out.println();
		}
	}

}
```
결과
```
    |  1  2  3  4  5  6  7  8  9
 ---+---------------------------
  1 |  2  3  4  5  6  7  8  9 10
  2 |  3  4  5  6  7  8  9 10 11
  3 |  4  5  6  7  8  9 10 11 12
  4 |  5  6  7  8  9 10 11 12 13
  5 |  6  7  8  9 10 11 12 13 14
  6 |  7  8  9 10 11 12 13 14 15
  7 |  8  9 10 11 12 13 14 15 16
  8 |  9 10 11 12 13 14 15 16 17
  9 | 10 11 12 13 14 15 16 17 18
```
Q13. 오른쪽 결과와 같이 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.

```
정사각형을 출력합니다.
변의 길이: 5
*****
*****
*****
*****
*****
```

```
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
```

### 보충수업 1-8) 카운터용 변수의 이름은 왜 i나 j일까요? 
많은 프로그래머들이 for 문과 같은 반복문을 제어하는 변수로 i나 j를 사용한다.  그 역사는 과학 계산용 프로그래밍 언어인 포트란(FORTRAN)의 초기 시대로 거슬러 올라간다.  
이 언어에서 변수는 기본적으로 실수형이다. 그러나 이름의 첫 문자가 I,J,...,N인 자동으로 정수형으로 간주했다. 그러므로 반복을 제어하는 변수로 I,J,...를 사용하는 것이 가장 쉽고 편리한 방법이었다. 

### 직각이등변삼각형 출력하기 
- chap01/TriangleLB.java 
```
import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = stdIn.nextInt();
		}while (n <=0 );
		
		for (int i =1; i<= n; i++) {
			for(int j =1; j<= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}

```
|실행 결과|
|--|
|왼쪽 아래가 직각인 이등변삼각형을 출력합니다.
몇 단 삼각형입니까?: 5|
|*|
|**|
|***|
|****|
|*****|

### 연습문제) 
Q14. 직각이등변삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요. 

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







