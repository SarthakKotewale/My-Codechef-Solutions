import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;


class Main{

    public static void main(String[] args) {

        try {
            FastReader sc = new FastReader();
            int t = sc.nextInt();
            while(t-- > 0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(x == y){
                    System.out.println((y * 2) + (x - y) - 1);
                }else{
                    System.out.println((y * 2) + (x - y));
                }


            }


        } catch (Exception e) {
            return;
        }
    }
    static char[] swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    static int indexOf(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
    public static int[] remove(int[] a, int index)
    {
        if (a == null || index < 0 || index >= a.length) {
            return a;
        }

        int[] result = new int[a.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }

        for (int i = index; i < a.length - 1; i++) {
            result[i] = a[i + 1];
        }

        return result;
    }


    /*---------------------- Pair Class & Comparator ------------------------*/
    static class Pair{
        int x,y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
    }
    static class Compare {
        static void compare(ArrayList<Pair> list) {
            Collections.sort(list, new Comparator<Pair>() {
                @Override
                public int compare(Pair p1, Pair p2){
                    return p1.x - p2.x;
                }
            });
        }
    }
    /*------------------------- Sort & Merge -----------------------------------------*/
    public static void sort(int[] arr, int left, int right){
        if(left<right){
            int mid=left+(right-left)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int size_first=mid-left+1;
        int size_second=right-mid;

        int[] left_array=new int[size_first+1];
        int[] right_array=new int[size_second+1];

        for(int i=0;i<size_first;i++) left_array[i]=arr[left+i];
        for(int i=0;i<size_second;i++) right_array[i]=arr[mid+1+i];

        left_array[size_first]=Integer.MAX_VALUE;
        right_array[size_second]=Integer.MAX_VALUE;

        int i=0,j=0;
        for(int k=left;k<=right;k++){
            if(left_array[i]<=right_array[j]){
                arr[k]=left_array[i];
                i++;
            }else{
                arr[k]=right_array[j];
                j++;
            }
        }
    }

    public static void sort(long[] arr, int left, int right){
        if(left<right){
            int mid=left+(right-left)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(long[] arr, int left, int mid, int right){
        int size_first=mid-left+1;
        int size_second=right-mid;

        long[] left_array=new long[size_first+1];
        long[] right_array=new long[size_second+1];

        for(int i=0;i<size_first;i++) left_array[i]=arr[left+i];
        for(int i=0;i<size_second;i++) right_array[i]=arr[mid+1+i];

        left_array[size_first]=Integer.MAX_VALUE;
        right_array[size_second]=Integer.MAX_VALUE;

        int i=0,j=0;
        for(int k=left;k<=right;k++){
            if(left_array[i]<=right_array[j]){
                arr[k]=left_array[i];
                i++;
            }else{
                arr[k]=right_array[j];
                j++;
            }
        }
    }
    /*-------------------------- FACTORIAL(big int) & SUM -----------------------------*/
    public static BigInteger __find_factorial(int n){
        BigInteger bi=new BigInteger("1");

        for(int i=2;i<=n;i++){
            bi=bi.multiply(BigInteger.valueOf(i));
        }
        return bi;
    }
    public static long get_natural_sum(long n){
        long sum=0;
        long even_part=0;
        if((n^1)>n){ // (n&1)==0 even
            even_part=n/2;
            sum=even_part*(n+1);
        }else{
            even_part=(n+1)/2;
            sum=even_part*n;
        }
        return sum;
    }
    /*---------------------------- GCD & LCM --------------------------------*/
    private static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }
    private static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    private static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }
    private static long gcd(long a, long b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    /*------------------------------------------------------------------------*/
    private static int count_bits(long n){
        return (int)(Math.log(n)/Math.log(2) + 1);
    }
    private static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void swap(long[] arr, int i, int j){
        long temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void print_array(int[] arr){
        for(int ele:arr)
            System.out.print(ele+" ");
        System.out.println();
    }
    private static void print_array(long[] arr){
        for(long ele:arr)
            System.out.print(ele+" ");
        System.out.println();
    }
    private static void print_array_two(int[][] arr){
        int rows=arr.length;
        int columns=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    private static void print_array_two(long[][] arr){
        int rows=arr.length;
        int columns=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    /*-------------------------- FastReader Class -----------------------------*/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    /*--------------------------------------------------------------------------*/
}
