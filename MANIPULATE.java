/*
Ezio can manipulate at most X number of guards with the apple of eden.

Given that there are Y number of guards, predict if he can safely manipulate all of them.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers X and Y.

Output Format
For each test case, print YES if it is possible for Ezio to manipulate all the guards. Otherwise, print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

Constraints
1≤T≤100
1≤X,Y≤100

Sample Input 1 
3
5 7
6 6
9 1

Sample Output 1 
NO
YES
YES

Explanation
Test Case 1: Ezio can manipulate at most 5 guards. Since there are 7 guards, he cannot manipulate all of them.

Test Case 2: Ezio can manipulate at most 6 guards. Since there are 6 guards, he can manipulate all of them.

Test Case 3: Ezio can manipulate at most 9 guards. Since there is only 1 guard, he can manipulate the guard.
*/



//-------------------------ANSWER--------------------------------

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    if(b <= a){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}
