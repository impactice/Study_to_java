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
