import java.util.Scanner;

import java.util.Arrays;

public class Main {
 
  public static void main (String [] args ){
  
    
    Scanner sc = new Scanner (System.in);
    
    int q =sc.nextInt();
    
    for (int tc = 0; tc < q; tc++) {
		
      int n = sc.nextInt();
			
      int[] a = new int[n];
			
      for (int i = 0; i < a.length; i++) {
			
        a[i] = sc.nextInt();
			}

			System.out.println(solve(a));
		}

		sc.close();
	}

	static int solve(int[] a) {
		return divideToCeil(Arrays.stream(a).sum(), a.length);
	}

	static int divideToCeil(int x, int y) {
		return x / y + (x % y == 0 ? 0 : 1);
	}
}
