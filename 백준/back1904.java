package 백준;
import java.util.*;
public class back1904 {
    public static int[]dp=new int[1000001];
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            dp[i]=-1;
        }
        System.out.println(tile(num));
    }
    public static int tile(int num){
        if(dp[num]==-1){
            dp[num]=(tile(num-1)+tile(num-2))%15746;
        }
        return dp[num];
    }
}
