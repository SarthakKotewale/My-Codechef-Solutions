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
		    int n = sc.nextInt();
		    
		    int[] sarr  = new int[n];
		    for(int i = 0; i < n; i++){
		        sarr[i] = sc.nextInt();
		    }
		    int[] darr = new int[n];
		    for(int i = 0; i < n; i++){
		        darr[i] = sc.nextInt();
		    }
		    int cnt = 0;
		    for(int i = 0; i < n; i++){
		        if(sarr[i] == darr[i]){
		            cnt++;
		        }
		    }
		    System.out.println(cnt);
		}
	}
}
