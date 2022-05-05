package 백준;
import java.util.*;
public class back1463 {
    static Integer[]dp;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        dp=new Integer[x+1];
        dp[0]=0;
        dp[1]=0;
        System.out.println(make(x));
    }
    static int make(int x){
        if(dp[x]==null){
            if(x%6==0){
                dp[x]=Math.min(make(x-1)+1, Math.min(make(x/2),make(x/3)));
            }else if(x%3==0){
                dp[x]=Math.min(make(x-1)+1, make(x/3));
            }else if(x%2==0){
                dp[x]=Math.min(make(x-1)+1, make(x/2));
            }else{
                dp[x]=make(x-1)+1;
            }
        }
        return dp[x];
    }
}
