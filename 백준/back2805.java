package 백준;
import java.util.*;
public class back2805 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[]=new int[n];
        int min=0;
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        while(min<max){
            int mid=(min+max)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]-mid>0){
                    sum+=(arr[i]-mid);
                }
            }
            if(sum<m){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        System.out.println(min-1);
        
    }
}
