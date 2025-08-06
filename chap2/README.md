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
**의사 난수**  
컴퓨터 과학에서는 보통 특정 입력값이나 컴퓨터 환경에 따라 무작위로 선택한 것처럼 보이는 난수를 생성하는데, 그 입력값이나 컴퓨터 환경이 같다면 그 결괏값은 항상 같다. 결국 컴퓨터에서 생성된 모든 난수는 미리 컴퓨터가 게산해 둔 '의사(擬似) 난수'이다.

- 의사 난수는 난수처럼 보이지만 일정한 규칙에 따라 생성한다. 여기서 난수를 의사 난수라고 부르는 건 다음에 생설할 난수를 예측할 수 잇기 때문이다. 의사 난수가 아닌 진짜 난수로는 생설할 난수를 예측할 수 없다. 의사 난수에서 의사(擬似: 본뜰 의, 비슷할 사)는 실제와 비슷하다는 뜻이다.

컴퓨터는 계산된 결과만 가지고 난수를 생성하는데, 이 계산된 결과는 입력값에 의해 결정되므로 이 값으로 임의의 난수를 생성할 수는 없다(컴퓨터는 처음 켜면 난수표를 생성하여 보관한다고 생각하면 된다). 프로그램에서 매번 같은 방법으로 이 값을 가져오면 처음 실행할 때 매번 다르게 전달하여 다른 의사 난수를 생성해야 한다. 보통 seed값은 시간에 따라 다르게 생성된다. 시간은 매 순간 바뀌므로 이전에 발생한 의사 난수를 다시 생성하진 않는다.  

**선형 합동법** 
선형 합동법(linear congruential method)은 보편적으로 사용하는 의사 난수 생성기이다. 현재 의사 난숫값을 A배 하고 C를 더한 다음, M으로 나눈 나머지를 의사 난수로 선택하는 방법이다. 계산 공식이 간단하여 연산이 빠르고 메모리를 적게 사용하지만, 수를 바꾸는(modulate) 연산을 할 때는 변수의 최댓값을 주기로 가지므로 자료형 이상의 주기를 사용할 수 없다.   
선형 합동법은 간단한 공식과 주기의 제한으로 '예측 불가능성'이 없다. 따라서 선형 합동법을 암호 기술에는 사용할 수 없다. C의 rand 함수, 자바의 java.util.Random 클래스는 모두 선형 합동법을 사용한다. 

## 배열 요소를 역순으로 정렬하기 
요솟수가 n인 배열 요소를 역순으로 정렬하는 알고리즘을 코드로 나타내면 
```
for (int i = 0; i < n/2; i++)
	// a[i]와 a[n -i -1]의 값을 교환
```

#### 두 값의 교환 
```
// 배열 요소 a[idx1]과 a[idx2]의 값을 교환
static void swap(int[] a, int idx1, int idx2) {
	int t = a[idx1];
	a[idx1] = a[idx2];
	a[idx2] = t;
}
```
메서드 swap가 수행하는 것은 배열 a의 요소 a[idx1]값과 a[idx2]값을 교환하는 것이다. 그러므로 swap(x, 1, 5)를 호출하면 메서드로부터 돌아올 때 x[1]값과 x[5]값이 바뀌어 있다.  

- chap02/ReverseArray.java 
```
import java.util.Arrays;
import java.util.Scanner;

// 배열 요소에 값을 읽어 들여 역순으로 정렬
class ReverseArray {
	// 배열 요소 a[dix1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t; 	
	}
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++)
			swap(a, i, a.length -i -1);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();	//요솟수 
		
		int[] x = new int[num];	//요솟수가 num인 배열
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);	// 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		System.out.println("x= "+Arrays.toString(x));

	}

}
```
- 여기에서는 코드를 표시하는 공간을 절약하기 위해 메서드 본체를 한 줄에 꽉 채워 표기햇지만 프로그램을 작성할 때는 여러 줄로 나눠 여유 있게 표기하는 것이 좋다.

|실행 결과|
|--|
|요솟수: 7
x[0]: 2
x[1]: 5
x[2]: 1
x[3]: 3
x[4]: 9
x[5]: 6
x[6]: 7
요소를 역순으로 정렬했습니다.
x= [7, 6, 9, 3, 1, 5, 2]|


메서드 reverse는 매개변수로 전달받은 배열 요소를 역순으로 정렬한다. 
- main 메서드에서 생성한 배열에 대한 참조 x를 메서드 reverse에 전달한다. 호출된 reverse는 매개변수 a로 전달받은 참조를 그대로 swap에 전달한다. 즉, 2회에 걸쳐 차례로 돌아가며 배열을 참조한다. 따라서 메서드 reverse의 매개변수 a와 swap의 매개변수 a는 모두 amin 메서드 안에서 x로 생성한 배열 본체를 참조하게 된다. 

### 배열의 전체 요소 표시
for문을 사용하지 않고 Arrays.toString 메서드를 사용하여 배열의 전체 요솟값을 한 번에 표시한다. 즉, 
```
import java.util.Arrays;
```
처럼 프로그램 시작 부분에 형 import를 선언하고, 
```
Arrays.toString(x)
```
처럼 Arrays.toString(배열 변수 이름)으로 메서드를 호출하면 모든 요소를 쉼표(,)로 구분하여 []로 둘러산 문자열을 얻는 구조이다. 

### 연습문제 
Q2. 오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나 하나 나타내는 프로그램을 작성하세요. 
```
[2, 5, 1, 3, 9, 6, 7]
a[0]과 a[6]을 교환합니다.
[7, 5, 1, 3, 9, 6, 2]
a[1]과 a[5]을 교환합니다.
[7, 6, 1, 3, 9, 5, 2]
a[2]과 a[4]을 교환합니다.
[7, 6, 9, 3, 1, 5, 2]
역순 정렬을 마쳤습니다.
```

```
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
```

Q3. 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요. 
```
static int sumOf(int[] a) 
```

```
import java.util.Scanner;

class ReverseArray3 {

	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수: ");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		int result = sumOf(x);
		System.out.println("배열 요소의 합계: " + result);
	}
}
```

Q4. 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요. 
```
static void copy(int[] a, int[] b)
```

```
import java.util.Scanner;

public class ReverseArray4 {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
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

		copy(x, y); // 반환값이 필요 없는 void 메서드이므로 그냥 호출만 하면 됨

		System.out.println("배열 x의 모든 요소를 배열 y에 복사했습니다!");
		for (int i = 0; i < num; i++) {
			System.out.println("y[" + i + "] = " + y[i]);
		}
	}
}
```

Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요. 
```
static void rcopy(int[] a, int[] b) 
```

```
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
```

### 보충수업 2-4 전위형 증가 연산자와 후위형 증가 연산자 
증가(increment)를 수행하는 증가 연산자 ++는 앞에 놓느야 뒤에 놓느야에 따라 동작이 다르다.  

#### 전위형 증가 연산자 ++a 
++를 앞에 놓으면 식 전체를 평가하기 전에 피연산자의 값을 증가시킨다.   
예시) a값이 3일 때 b=++a를 실행하면 먼저 a가 1 증가한 값인 4가 된다. 그런 다음 ++a를 평가한 값 4를 b에 대입한다. 결국 a와 b는 4가 된다.

#### 후위형 증가 연산자 a++ 
++를 뒤에 놓으면 식 전체를 평가한 후에 피연산자의 값을 증가시킨다.  
예시) a값이 3일 때 b=a++를 실행하면 먼저 a++를 실행하면 먼저 a++를 평가한 값 3을 b에 대입한다. 그런 다음 ++가 수행되어 a는 4가 된다. 결국 a는 4, b는 3이 된다.  

## 기수 변환하기 

### 보충수업2-5) 기수 살펴보기 
- chap02/CardConv.java 
```
import java.util.Scanner;

// 입력받은 10진수를 2진수~36진수로 기수 변환하여 출력 

class CardConv {
	// 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환 
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;	// 변환 후의 자릿수 
		String dchar = "0123456789ABCDEFGHIGKLMNOPQRSTUVWYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0 );
		for (int i = 0; i < digits / 2; i++ ) { // 배열 d의 숫자 문자열을 역순으로 정렬
			char t = d[i];
			d[i] = d[digits -i -1];
			d[digits -i -1] = t;
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;						//변환하는 정수
		int cd;						// 기수
		int dno;					//반환 후의 자릿수
		int retry;					// 다시 한번?
		char[] cno = new char[32];	// 변환 후 각 자리의 숫자를 넣어 두는 문자 배열 
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = stdIn.nextInt();
			}while (no < 0); 
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				cd = stdIn.nextInt();
			}while (cd < 2 || cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd+"진수로 ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1...예/0...아니요): ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
	}

}
```
|실행 결과|
|--|
|10진수를 기수 변환합니다.
변환하는 음이 아닌 정수: 59
어떤 진수로 변환할까요? (2~36): 2
2진수로 111011입니다.
한 번 더 할까요? (1...예/0...아니요): 0|

#### 조금만 더! 정수 상수의 n진수 표현 방법 

### 연습문제 
Q6. 오른쪽처럼 기수 변환 과정으 자세히 나타내는 프로그램을 작성하세요. 









