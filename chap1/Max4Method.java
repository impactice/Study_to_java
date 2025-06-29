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
