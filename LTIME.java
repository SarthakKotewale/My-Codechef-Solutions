/* package codechef; // don't place package name! */
//a very easy one
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x >= 1 && x <= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}