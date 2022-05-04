package 백준;
import java.util.*;
public class back1003 {
    static Integer [][]dp=new Integer[41][2];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            int num2=scanner.nextInt();
            fibo(num2);
            System.out.println(dp[num2][0]+" "+dp[num2][1]);
        }
    }
    public static Integer[] fibo(int n){
        if(dp[n][0]==null||dp[n][1]==null){
            dp[n][0]=fibo(n-1)[0]+fibo(n-2)[0];
            dp[n][1]=fibo(n-1)[1]+fibo(n-2)[1];
        }
        return dp[n];
    }
}
