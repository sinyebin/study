package 백준;
import java.util.*;
public class back11053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int arr[]=new int[num];
        int dp[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<num;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int max=0;
        for(int i=0;i<num;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }
        System.out.println(max);
    }
}
