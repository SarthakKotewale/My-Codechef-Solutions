

import java.util.*;

public class BLACKJACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a + b + 10 >= 21){
                System.out.println(21 - (a + b));
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
