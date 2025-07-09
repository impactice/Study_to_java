
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
