import java.util.Scanner;

public class Main {
  
  public static void main (String [] args ){
    
    Scanner sc = new Scanner (System.in);
    
    int n= sc.nextInt();
    
    System.out.println(solve(n));

		sc.close();
	}

	static int solve(int n) {
		return 2 * (n - 1) * n + 1;
	}
}
