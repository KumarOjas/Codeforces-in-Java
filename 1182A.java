import java.util.Scanner;

public class Main {
  

  public static void main (String [] args ){
  
    
    Scanner sc = new Scanner (System.in);
    
    
    int n=sc.nexxtInt();
    
    System.out.println(solve(n));
    
    sc.close();
  }
  
  static int solve(int n){
    
    return (n % 2 == 0) ? (1 << (n / 2)) : 0;
	}
}
