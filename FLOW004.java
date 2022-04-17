import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while( t-- > 0){
	        int num = sc.nextInt();
	        int tempnum = num;
	        int cnt = 0;
	        while(tempnum != 0){
	            tempnum = tempnum / 10;
	            cnt++;
	        }
	        int lastdig = num % 10;
	        int firstdig = num / (int)Math.pow(10, cnt - 1);
	        int sum = lastdig + firstdig;
	        System.out.println(sum);
	    }
	}
}
