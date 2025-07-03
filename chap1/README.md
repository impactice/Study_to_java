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
b값: 6|

Q10. 







