/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		  
		    String a = sc.next();
		    char c = a.charAt(0);
		    if(c == 'b' || c == 'B'){
		        System.out.println("BattleShip");
		    }
		    else if(c == 'c' || c == 'C'){
		        System.out.println("Cruiser");
		    }
		    if(c == 'd' || c == 'D'){
		        System.out.println("Destroyer");
		    }
		    if(c == 'f' || c == 'F'){
		        System.out.println("Frigate");
		    }
		}
	}
}

