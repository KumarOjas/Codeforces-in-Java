import java.util.Scanner;

public class Main {
  
  public static void main (String [] args ){
    
 
    Scanner sc =new Scanner (System.in);
    
    int n=sc.nextInt();
    
    int k=sc.nextInt();
    
    
    System.out.println(solve(n, k));

		sc.close();
	
  }

	
  
  static int solve(int n, int k) {
	
    return n + (Math.min(k - 1, n - k) + (n - 1)) + (n + 1);
	}
}
