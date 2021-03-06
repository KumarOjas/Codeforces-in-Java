import java.util.Arrays;
import java.util.Scanner;

public class Main {
  
  public static void main (String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    int n=sc.nextInt();
    
    int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solve(a));

		sc.close();
	}

	static int solve(int[] a) {
		if (Arrays.stream(a).filter(x -> x > 0).count() * 2 >= a.length) {
			return 1;
		} else if (Arrays.stream(a).filter(x -> x < 0).count() * 2 >= a.length) {
			return -1;
		} else {
			return 0;
		}
	}
}
