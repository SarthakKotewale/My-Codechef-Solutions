import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 1){
            if(b == 1){
                System.out.println("https://discuss.codechef.com");
            }else if(b == 0){
                System.out.println("https://www.codechef.com/contests");
            }
        }else if(a == 0){
            System.out.println("https://www.codechef.com/practice");
        }

    }
}
