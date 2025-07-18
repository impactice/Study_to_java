# 배열이란? 

## 자료구조 정의하기

|데이터 단위와 데이터 자체 사이의 물리적 또는 논리적인 관계|
|--|

## 배열 다루기 
배열(array): 기존적이고 간단한 자료구조   
배열은 같은 자료형의 변수인 구성 요소(component)가 모인 것  

예를 들어 배열은 다음의 방식으로 선언한다
```
int[] a; // 구성 요소의 자료형이 int형인 배열 
```
배열 선언에서 만드어지는 a는 배열 변수(array variable)라고 부르는 특수한 변수일 뿐 배열 그 자체는 아니다. 배열 본체는 연산자 new를 사용하여 생성한다.  
예를 들어 구성 요소의 자료형이 int형이고 구성 요소가 5개인 배열은 배열 본체를 생성하고, 그것을 배열 변수 a가 참조하도록 연결한다  
```
a = new int[5]; //new를 사용하여 배열 본체를 생성한 뒤 배열 변수 a와 연결 
```

### 인덱스 식과 구성 요소 
배열 본체 안의 구성 요소에 접근(access)하려면 정수형 인덱스를 연산자 [] 안에 넣은 인덱스 식을 사용한다 
|배열 변수 이름[인덱스] //배열 안의 특정 구성 요소에 접근|
|--|

첫 번째 배열 요소의 인덱스는 0이다. 각 구성 요소에 접근하는 인덱스 식은 처음부터 순서대로 a[0],a[1],a[2],a[3]이다. 다시 말해 표현식 a[i]는 배열 a에서 처음부터 i개 뒤의 구성 요소에 접근한다.  
- 구성 요소가 n개인 배열의 구성 요소는 a[0],a[1],•••,a[n-1]이다. a[n]은 존재하지 않는다

### 구성 요솟수(길이)
배열 본체와 함께 구성 요소의 개수인 구성 요솟수를 나타내는 length라는 변수가 만들어진다. 배열의 구성 요솟수는 배열의 길이(length)라고도 한다. 
|배열 변수 이름.length //배열의 구성 요솟수|
|--| 

### 기본값 
- chap02/IntArray.java 
```
// 구성 요소의 자료형이 int형인 배열(구성 요솟수는 5:new에 의해 본체를 생성)

public class IntArray {

	public static void main(String[] args) {
		int[] a = new int[5]; //배열의 선언 
		
		a[1] = 37;
		a[2] = 51; 
		a[4] = a[1] *2;
		
		for(int i =0; i<a.length; i++)
			System.out.println("a["+i+"]= "+a[i]);

	}

}
```

|실행 결과|
|--|
|a[0]= 0
a[1]= 37
a[2]= 51
a[3]= 0
a[4]= 74|

배열 a는 구성 요소의 자료형이 int형이고 구성 요솟수가 5이다.
```
int[] a;  	//선언하가
a = new int[5];	// 참조하기
```

프로그램의 실행 결과를 보면 값을 대입하지 않은 a[0]과 a[3]의 값이 0인 것을 알 수 있다  
배열의 구성 요소는 자동으로 0으로 초기화되는 규칙이 있다. 이 점은 보통의 변수와 크게 다르므로 꼭 기억해 두자!  
배열을 생성할 때 각 구성 요소에 넣는 초깃값을 기본값(default value)이라고 한다. 

- 각 자료형의 기본값

|자료형|기본값|
|--|--|
|byte|zero, 곧(byte)0|
|short|zero, 곧(short)0|
|int|zero, 곧 0| 
|long|zero, 곧 0L|
|float|zero, 곧 0.0f|
|double|zero, 곧 0.0d|
|char|널(null) 문자, 곧'\u0000'|
|boolean|거짓, 곧 false|
|참조형|널(null) 참조, 곧 null|


#### 조금만 더! 배열의 자료형은 구분해서 사용하세요 
배열 a의 각 요소의 자료형은 int형이고 배열 a의 자료형은 int[5]형이다. 다시 말해 a[0]은 int형, a는 int[5]형이다. 예를 들어 int a = new int[5]라고 선언하면 배열 a는 a[0],a[1],a[2],a[3],a[4]로 총 5개의 int형 저장 공간을 차지한다 

### 배열의 요솟값을 초기화하며 배열 선언하기
배열 본체는 new 연산자뿐만 아니라 배열 초기화(array initializer)에서도 생성할 수 있다. 배열 초기화를 사용하면 배열 본체의 생성과 동시에 각 구성 요소를 특정값으로 초기화할 수 있다
- chap02/IntArrayInit.java 
```
// 구성 요소의 자료형이 int형인 배열(구성 요솟수는 5: 배열 초기화에 의해 생성)
public class IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; //배열 초기화에 의해 생성
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a["+i+"] = " +a[i]);
	}

}
```
|실행 결과|
|--|
|a[0] = 1
a[1] = 2
a[2] = 3
a[3] = 4
a[4] = 5|

구성 요소의 자료형이 Type인 배열을 'Tupe형 배열'이라고 부른다. 배열 a는 'int형 배열'이다. 앞으로 구성 요소를 '요소', 구성 요솟수를 '요솟수'라고 하겠다. 

## 배열 요소의 최댓값 구하기 
배열 a의 요소가 3개일 때 세 요소 a[0],a[1],a[2] 중 최댓값은 다음 코드처럼 구할 수 있다. 
```
max = a[0];
if (a[1] > max) max = a[1];
if (a[2] > max) max = a[2];
```

뱐수 이름이 다름 점을 제외하면 살펴본 세 값의 최댓값을 구하는 프로그램과 과정이 동일하다.  
물론 요소가 4개면 다음처럼 작성해야 한다.
```
max = a[0];
if (a[1] > max) max = a[1];
if (a[2] > max) max = a[2];
if (a[3] > max0 max = a[3]; 
```
먼저 배열의 요솟수와 관계없이 첫 번째 요소 a[0]의 값을 max에 대입한다. 그런 다음 if문을 실행하는 과정에서 필요에 따라 max값을 새로 대입한다. 그런 다음 if문을 실행하는 과정에서 필요에 따라 amx값을 새로 대입한다. 요솟수가 n이면 if 문 실행은 n-1번 필요하다. 이때 max와 비교하거나 max에 대입하는 요소의 인덱스는 1씩 증가한다. 그러므로 a[0],a[1],•••,a[n-1]의 최댓값을 구하는 프로그램은 다음처럼 구현 할 수 있다. 

```
max = a[0];
for (int i = 1; i < n; i++)
	if(a[i] > max) max = a[i];
```
배열 요소를 차례로 조사하는 과정을 알고리즘 용어로 주사(走査,traverse) 또는 스캔이라고 한다 

#### 조금만 더! 주사의 정확한 뜻이 궁금해요! 
주사(走査)는 원래 텔레비전 화면이나 사진을 전송할 때 화면을 여러 개의 점으로 나눠 그 점을 전기 신호로 바꾸는 일 또는 이 전기 신호에서 점을 조립하여 화면을 재구성하는 것을 말한다.  
즉, 스캐닝(scanning)을 의미한다. 주사는 데이터를 하나씩 지나면서(走, 달릴 주) 살피고 조사하는(査, 조사할 사) 일을 말한다. 영어로는 traverse라고 하는데, 이는 '가로지르다', '횡단하다'라는 뜻이다. 

### 보충수업2-1 값을 대입하지 않은 지역 변수 
배열의 구성 요소와 클래스의 필드는 기본값으로 초기화된다. 그러나 메서드 안에서 선언한 지역 변수는 기본값으로 초기화되지 않는다.   
즉, 변수를 만들어도 초기화는 수행되지 않는다. 자바에서 초기화나 대입을 통해 값이 들어가는데, 그렇지 않은 변수, 곧 값이 들어 있지 않은 변수에서 값을 꺼낼 수는 없다. 따라서 다음 프로그램은 컴파일 오류가 발생한다. 

```
int a;
// 값이 들어 있지 않은 변수에서 값을 꺼내려고 함
System.out.println( "a값은 "+a+ "입니다."); 	// 컴파일 오류 
```

#### 프로그램 실행 중 배열의 요솟수 결정하기 
- chap02/MaxOfArray.java 
```
import java.util.Scanner;

public class MaxOfArray {
	// 배열 a의 최댓값을 구하여 반환 
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i =1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = stdIn.nextInt();	// 배열의 요솟수를 입력받음 
		
		int[] height = new int[num];	// 요솟수가 num인 배열을 생성
		
		for (int i = 0; i < num; i++) {
			System.out.print("height["+i+"]:");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("최댓값은 "+maxOf(height)+ "입니다.");
	}

}
```
|실핼 결과|
|--| 
|키의 최댓값을 구합니다.
사람 수: 5
height[0]:172
height[1]:153
height[2]:192 
height[3]:140
height[4]:165
최댓값은 192입니다.|

배열의 요소를 구사는 절차를 별도의 메서드 maxOf로 구현하고 있다. 미 메서드는 인수로 받은 a의 최댓값을 구하고 그 값을 반환하다. 
- 메서드 본체의 코드는 앞에서 살펴본 배열 요소의 최댓값을 구하는 프로그램과 같다. 다만 반복 종료 조건으 ㄹ판단하기 위하여 제어식을 i < n이 아니라 i < a.length로 변경했다

배열 height의 요소가 나타내는 것은 사람의 '키'이다. main 메서드에서는 먼저 사람 수(배열의 요솟수)를 변수 num에 읽어 들이고, 요솟수가 num인 배열 height를 생성한다.  
지금까지의 프로그램과는 달리 배열 요솟수가 프로그램을 컴파일할 때가 아니라 실행할(runtime) 때 결정된다. 각 요소에 넣을 값을 읽어 들인 후 배열 height를 메서드 amxOf에 전달하고 메서드가 반환한 최댓값을 출력한다.

### 보충수업2-2) 메서드의 매개 변수로 배열 사용하기 
호출하는 쪽에서 전달하는 실인수 height는 배열 본체를 참조하는 배열 변수이다. 따라서 메서드 maxOf에 전달하는 값은 '배열 본체에 대한 참조'이다.  
  
자바에서 메서드를 호출하면 메서드의 매개 변수는 호출하는 쪽에서 전달하는 실인숫값으로 초기화된다. 이때 배열 변수인 매개변수 a가 전달받은 참조로 초기화되므로 배열 변수 a는 배열 height의 본체를 참조한다.  
  
그 결과 메서드 maxOf 안의 배열 a는 사실상 main 메서드의 배열 height인 것이다. 이런 원리로 배열을 전달하므로 메서드 maxOf 안에서는 전달받은 배열의 요솟수를 a.length로 얻을 수 있고, 각 요소를 a[i]로 엑세스할 수 있다.

#### 조금만 더! 접근 제한자란? 
멤버는 객체 자신만의 속성이자 특징이므로 외부에 공개하는 것이 반드시 좋은 것은 아니다. 그래서 객체 멤버에 대한 접근을 제한할 때가 있는데, 이를 자바에서는 접근 제한자라 한다.

**접근 제한자의 종류**  
① public: 모든 접근 허용  
② protected: 같은 패키지(폴더)의 객체, 상속 관계의 객체 허용  
③ default: 같은 패키지(폴더)의 객체 허용  
④ private: 현재의 객체 안에서만 허용    



**접근 제한자 사용**  
① 클래스: public, default  
② 생성자: public, protected, default, private  
③ 멤버 변수: public, protected, default, private  
④ 멤버 메서드: public, protected, default, private  
⑤ 지역 변수: 접근 제한자를 사용할 수 없음  

### 난수를 사용하여 배열의 요솟값 설정하기 
- chap02/MaxOfArrayRand.java 
```
import java.util.Random;
import java.util.Scanner;

class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = stdIn.nextInt();	// 배열의 요솟수를 입력받음 
		
		int[] height = new int[num]; // 요솟수가 num인 배열을 생성 
		
		System.out.println("킷값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);	// 요솟값을 난수로 결정
			System.out.println("height["+i+"]: "+height[i]);
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}

}
```

|실행 결과|
|--|
|키의 최댓값을 구합니다.
사람 수: 5
킷값은 아래와 같습니다.
height[0]: 123
height[1]: 125
height[2]: 186
height[3]: 189
height[4]: 125
최댓값은 189입니다.|

### 연습문제 
Q1. 키뿐만 아니라 사람 수도 난수로 생성하도록 MaxOfArrayRand.java를 수정하여 프로그램을 작성하세요. 
```
import java.util.Random;
import java.util.Scanner;

class MaxOfArrayRand2 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = rand.nextInt(90);	// 배열의 요솟수를 입력받음 
		
		int[] height = new int[num]; // 요솟수가 num인 배열을 생성 
		
		System.out.println("킷값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);	// 요솟값을 난수로 결정
			System.out.println("height["+i+"]: "+height[i]);
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");

	}

}
```

### 보충수업2-3) 난수의 생성 
java.util 패키지에 속한 Random 클래스는 자바가 제공하는 아주 큰 클래스 라이브러리이다. Random 클래스의 인스턴스는 일련의 의사 난수(진짜 난수와 비슷한 가짜 난수)를 생성한다.  
  
난수는 무(無)에서 생성되는 것이 아니라 'seed(씨앗)'라는 수의 값을 바탕으로 여러 연산을 수행하여 얻는다(seed가 난수로 되는 것은 달걀이 닭이 되는 것과 같다). Random 클래스에서는 48비트의 seed를 사용하고, 이 seed는 선형 합동법이라는 계산법에 의해 특정 수(난수)로 바뀐다. Random 클래스의 인스턴스 생성은 다음의 a와 b 중 어느 한 가지 형식으로 수행한다.   

```
a Random rand = new Random();	// seed를 임의로 생성
b Random rand = new Random(n);	// seed를 지정
```
형식 a는 난수 생성기를 새로 만든다. 이때 Random 클래스의 다른 인스턴스와 겹치지 않도록 seed의 값을 자동으로 결정한다.   
프로그램을 할 때 분명하게 seed를 지정하는 방법이 b이다. 주어진 seed를 바탕으로 난수 생성기가 난수를 생성한다.


표) 난수를 생성하는 Random 클래스의 메서드 
|구하는 식(메서드 호출)|자료형|생성한 값의 범위|
|--|--|--| 
|nextBoolean()|boolean|true 또는 false|
|nextInt()|int|-2147483648 ~ ±2147483647|
|nextInt(n)|int|0~n-1|
|nextLong()|long|-9223372036854775808 ~ 9223372036854775807|
|nextDouble()|double|0.0 이상 1.0 미만|
|nextFloat()|float|0.0 이상 1.0 미만|

### 조금만 더! 의사 난수와 선형 합동법 
의사 난수  
컴퓨터 과학에서는 보통 특정 입력값이나 컴퓨터 환경에 따라 무작위로 선택한 것처럼 보이는 난수를 생성하는데, 그 입력값이나 컴퓨터 환경이 같다면 그 결괏값은 항상 같다. 결국 컴퓨터에서 생성된 모든 난수는 미리 컴퓨터가 게산해 둔 '의사 난수'이다.
























