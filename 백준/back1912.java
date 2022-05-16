package 백준;
import java.util.*;
public class back1912 {
    static int []arr;
    static Integer[] dp;
    static int max;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        arr=new int[num];
        dp=new Integer[num];
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        dp[0]=arr[0];
        max=arr[0];
        recur(num-1);
        System.out.println(max);
    }
    static int recur(int num){
        if(dp[num]==null){
            dp[num]=Math.max(recur(num-1)+arr[num],arr[num]);
            max=Math.max(dp[num],max);
        }
        return dp[num];
    }
}
