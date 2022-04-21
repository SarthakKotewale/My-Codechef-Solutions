import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int o = sc.nextInt();
        int c = sc.nextInt();

        int remOvers = 20 - o;
        if(remOvers * 6 * 6 + c > r){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
