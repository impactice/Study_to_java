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

### 보충수업) 숫자와 문자열 입력하기 1 
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

### 보충수업) 숫자와 문자열 입력하기 2 
# Scanner 메서드별 자료형 및 입력값 범위

아래 표는 `java.util.Scanner` 클래스의 주요 입력 메서드와 각 메서드가 반환하는 자료형, 그리고 허용하는 입력값의 범위를 정리한 것입니다.

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


























