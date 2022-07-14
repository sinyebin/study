package 백준;
import java.util.*;
public class back11727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int dp[]=new int[1001];
        dp[0]=0;
        dp[1]=1;
        dp[2]=3;
        for(int i=3;i<=n;i++){
            dp[i]=(dp[i-1]+2*dp[i-2])%10007;
        }
        System.out.println(dp[n]);
    }
}
