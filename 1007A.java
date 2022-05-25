import java.util.Arrays;

import java.util.Scanner;

public class Main {
  

   public static void main (String [] args){
    
   
      Scanner sc = new Scanner (System.in);
    
    
      int n = sc.nextInt();
		
      int[] a = new int[n];
		
    for (int i = 0; i < a.length; i++) {
      
			
      a[i] = sc.nextInt();
		
    }
		
     System.out.println(solve(a));

		sc.close();
	}

	static int solve(int[] a) {
		
     Arrays.sort(a);

		
     int result = 0;
		 
    int indexForSmaller = 0;
	
     for (int i = 0; i < a.length; i++) {
		
        if (a[i] > a[indexForSmaller]) {
				
           result++;
			
           indexForSmaller++;
			}
		}
		return result;
	}
}
