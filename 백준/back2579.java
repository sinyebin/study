package 백준;
import java.util.*;
public class back2579 {
    static Integer dp[];
    static int arr[];
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        dp=new Integer[num+1];
        arr=new int[num+1];
        int ans=0;
        for(int i=1;i<=num;i++){
            arr[i]=scanner.nextInt();
        }
        dp[0]=arr[0];
        dp[1]=arr[1];
        if(num>=2){
            dp[2]=arr[1]+arr[2];
        }
        System.out.println(find(num));
    }
    static int find(int num){
        if(dp[num]==null){
            dp[num]=Math.max(find(num-2),find(num-3)+arr[num-1])+arr[num];
        }
        return dp[num];
    }
}
