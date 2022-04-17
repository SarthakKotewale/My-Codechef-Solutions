import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while( t-- > 0){
	        int ans = 0;
	        int num = sc.nextInt();
	        
	        while(num != 0){
	            
	            int rem = num % 10;
	            if(rem == 4){
	                ans = ans + 1;
	            }
	            
	            num = num / 10;
	        }
	        System.out.println(ans);
	    }
	}
}
