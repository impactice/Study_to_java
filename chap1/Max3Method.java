
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
