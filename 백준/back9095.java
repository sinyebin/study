package 백준;
import java.util.*;
public class back9095 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[11];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;
        for(int i=0;i<n;i++){
            int temp=scanner.nextInt();
            for(int j=4;j<=temp;j++){
                arr[j]=arr[j-1]+arr[j-2]+arr[j-3];
            }
            System.out.println(arr[temp]);
        }
    }
}
