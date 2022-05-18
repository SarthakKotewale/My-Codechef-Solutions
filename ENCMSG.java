/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    String ans = "";
		    int n = sc.nextInt();
		    String s = sc.next();
		    boolean flag=false;
		    if(n%2 != 0){
		        flag = true;
		        n -= 1;
		    }
		     
		    for(int i = 0; i < n; i++) {
		        char c1 = s.charAt(i);
		        char c2 = s.charAt(++i);
		        ans = ans + c2 + c1;
		    }
		    if(n%2==0 && flag){
		        ans += s.charAt(n);
		        n += 1;
		    }
		   
		    String st = "";
            for(int i = 0; i < n; i++)
            {
                char y ='z';
                for(char ch = 'a';ch <= 'z'; ch++)
                {
                    if(ans.charAt(i)==ch)
                    {
                        st=st+y;
                        break;
                    }
                    y--;
                }
            }
            System.out.println(st);
		  //  System.out.println(ans);
		}
	}
}
