import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();
            int cmarks = x * 3;
            int negmarks = (n - x) * -1;
            int totmarks = cmarks + negmarks;
            if(totmarks < p){
                System.out.println("FAIL");
            }else{
                System.out.println("PASS");
            }

        }
    }
}
