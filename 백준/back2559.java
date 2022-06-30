package 백준;
import java.util.*;
public class back2559 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int max=Integer.MIN_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<=n-k;i++){
            int temp=0;
            for(int j=i;j<k+i;j++){
                temp+=arr[j];
            }
            max=Math.max(max,temp);
        }
        System.out.println(max);
    }
}
