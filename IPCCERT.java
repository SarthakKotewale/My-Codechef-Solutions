/* package codechef; // don't place package name! */

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
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int arr[] = new int[n]; //for students
		int arrk[] = new int[k]; //for lectures
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < k; j++){
		        arrk[j] = sc.nextInt();
		    }
		    int q = sc.nextInt(); //no of times question asked
		    int time = 0;
		    
		    for(int t : arrk){
		        time = time + t; //we'll get the total time
		    }
		    if(time >= m && q <= 10){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
