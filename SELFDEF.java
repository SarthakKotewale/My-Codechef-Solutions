import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int cnt = 0;
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] >= 10 && arr[i] <= 60){
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
    }
}
