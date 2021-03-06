import java.util.Scanner;

import java.util.stream.IntStreaM;

public class Main {
  
  public static void main (String [] args ){
    
    Scanner sc = new Scanner (System.in);
    
    int a = sc.nextInt();
	
    int b = sc.nextInt();
		
    int c = sc.nextInt();
		
    int d = sc.nextInt();
		
    System.out.println(solve(a, b, c, d));

		sc.close();
	}

	static int solve(int a, int b, int c, int d) {
		int[] sorted = IntStream.of(a, b, c).sorted().toArray();

		return Math.max(0, d - (sorted[1] - sorted[0])) + Math.max(0, d - (sorted[2] - sorted[1]));
	}
}
