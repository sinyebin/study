package 백준;
import java.util.*;
public class back9461 {
    static long []dp = new long[101];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        for(int i=4;i<dp.length;i++){
            dp[i]=-1;
        }
        for(int i=0;i<num;i++){
            int n=scanner.nextInt();
            System.out.println(p(n));
        }
    }
    public static long p(int n){
        if(dp[n]==-1){
            dp[n]=p(n-2)+p(n-3);
        }
        return dp[n];
    }
}
