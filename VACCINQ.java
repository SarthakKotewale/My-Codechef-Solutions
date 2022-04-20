
/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();    
            }
            
		    int sum = 0;
		    for(int j = 0; j < p - 1; j++){
		        if(arr[j] == 0){
		            sum = sum + x;
		        }
		        else if(arr[j] == 1){
		            sum = sum + y;
		        }
		        if(j == p - 1){
		            break;
		        }
		    }
		    System.out.println(sum + y);
		    
		}
	}
}
