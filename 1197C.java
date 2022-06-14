import java.util.Scanner;

import java.util.stream.IntStream;

public class Main {
  
  public static void main (String [] args ){
    
    Scanner sc = new Scanner (System.in);
    
    int n= sc.nextInt();

    int k=sc.nextInt();
    
    int[] a = new int[n];
		
    for (int i = 0; i < a.length; i++) {
		  
      a[i] = sc.nextInt();
		}
		System.out.println(solve(a, k));

		sc.close();
	}

	static int solve(int[] a, int k) {
		return a[a.length - 1] - a[0] + IntStream.range(0, a.length - 1).map(i -> a[i] - a[i + 1]).boxed().sorted()
				.limit(k - 1).mapToInt(x -> x).sum();
	}
}
