import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt(); //no of people
		    int k = sc.nextInt(); //units of money
		    int[] arr = new int[n];
		    int[] ans = new int[n];
		  //  int sum = k;
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		        
		        if(k - arr[i] > 0){
		            ans[i] = 1;
		            k = k - arr[i];
		            
		        }else if(k - arr[i] < 0){
		            ans[i] = 0;
		        }else if(k - arr[i] == 0){
		            ans[i] = 1;
		            k = k - arr[i];
		            
		        }
		    }
		    for(int i = 0; i < n; i++){
		        System.out.print(ans[i]);
		    }
		    System.out.println();
		    
		}
	}
}
